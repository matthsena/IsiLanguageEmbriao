package br.com.professorisidro.isilanguage.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
import br.com.professorisidro.isilanguage.parser.IsiLangLexer;
import br.com.professorisidro.isilanguage.parser.IsiLangParser;

@RestController
public class IsilangController {
	@PostMapping("/")
	public String index(@RequestBody String input) {
		String javaCode = "";
		
		try {
			IsiLangLexer lexer;
			IsiLangParser parser;
			
			lexer = new IsiLangLexer(CharStreams.fromString(input));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new IsiLangParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
			parser.exibeComandos();
			
			javaCode = parser.generateCode();
			
		}
		catch(IsiSemanticException ex) {
			System.err.println("Semantic error - "+ex.getMessage());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.err.println("ERROR "+ex.getMessage());
		}
		return javaCode;
	}
}
	