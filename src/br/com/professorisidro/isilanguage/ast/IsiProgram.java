package br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;

public class IsiProgram {
	private IsiSymbolTable varTable;
	private ArrayList<AbstractCommand> comandos;
	private String programName;
	private Map<String, Boolean> varAtribuidas = new HashMap<String, Boolean>();

	public String generateTarget() {
		String javaCode = "";
		
		StringBuilder str = new StringBuilder();
		str.append("import java.util.Scanner;\n");
		str.append("public class MainClass{ \n");
		str.append("  public static void main(String args[]){\n ");
		str.append("      Scanner _key = new Scanner(System.in);\n");
		for (IsiSymbol symbol: varTable.getAll()) {
			str.append(symbol.generateJavaCode()+"\n");
			// --> Obtendo nome de simbolos 
			varAtribuidas.put(symbol.getName(), false);
		}
		for (AbstractCommand command: comandos) {
			str.append(command.generateJavaCode()+"\n");
			// --> Setando simbolos como true caso atribuido
			varAtribuidas.put(command.getId(), true);
		}
		str.append("  }");
		str.append("}");
		
		try {
			javaCode = str.toString();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return javaCode;
	}

	public ArrayList<String> getVariaveisInutilizadas() {
		ArrayList<String> variaveis = new ArrayList<String>();

		for (Map.Entry<String, Boolean> vars : varAtribuidas.entrySet()) {
			if (vars.getValue() == false) {
				variaveis.add(vars.getKey());
			}
		}
		return variaveis;
	}

	public IsiSymbolTable getVarTable() {
		return varTable;
	}

	public void setVarTable(IsiSymbolTable varTable) {
		this.varTable = varTable;
	}

	public ArrayList<AbstractCommand> getComandos() {
		return comandos;
	}

	public void setComandos(ArrayList<AbstractCommand> comandos) {
		this.comandos = comandos;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

}
