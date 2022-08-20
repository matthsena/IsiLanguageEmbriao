package br.com.professorisidro.isilanguage.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
import br.com.professorisidro.isilanguage.parser.IsiLangLexer;
import br.com.professorisidro.isilanguage.parser.IsiLangParser;

@RestController
public class IsilangController {
	
	@CrossOrigin(origins = "*")
	@PostMapping("/")
	public ResponseEntity<String> index(@RequestBody String input) {
		String javaCode = "";
		String errorMsg = "";
		String warningMsg = "";
		
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

			ArrayList<String> unusedVars = parser.getUnusedVars();
			
			if (!unusedVars.isEmpty()) {
				System.out.println("VARIAVEIS NAO UTILIZADAS");
				System.out.println(unusedVars.toString());
				
				warningMsg = "Unused variable(s): " + unusedVars.toString();
				return ResponseEntity.status(200)
						.header("Access-Control-Expose-Headers", "warning")
						.header("warning", warningMsg)
						.body(javaCode);
			} else {
				return ResponseEntity.status(200).body(javaCode);
			}			
		}
		catch(IsiSemanticException ex) {
			errorMsg = "Semantic error - "+ex.getMessage();
			System.err.println(errorMsg);
			
			return ResponseEntity.status(500).body(errorMsg);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			errorMsg = "ERROR "+ex.getMessage();
			System.err.println(errorMsg);
			
			return ResponseEntity.status(500).body(errorMsg);
		}
	}
}
	