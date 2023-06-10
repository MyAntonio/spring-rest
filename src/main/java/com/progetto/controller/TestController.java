package com.progetto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	//CHIAMATE REST HTTP
	
	//get vuota
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	//get testo 
	@GetMapping("/test")
	public ResponseEntity<String> getTesto(){
		return ResponseEntity.ok("Test ok");
	}
	
	//get user con nome
	@GetMapping("/test/getUser")
	public ResponseEntity<Utente> getTestoPost(@RequestParam("nome") String nome){
		Utente u = new Utente();
		u.setNome(nome);
		u.setCognome("franzè");
		return ResponseEntity.ok(u);
	}
	
	//post user con user
	@PostMapping("/test/post/getUser")
	public ResponseEntity<Utente> getTestoPost(@RequestBody Utente ut){
		Utente u = new Utente();
		u.setNome(ut.getNome() + "---");
		u.setCognome(ut.getCognome()+ "----");
		return ResponseEntity.ok(u);
	}
	
	//post user con user
	@PutMapping("/test/put/getUser")
	public ResponseEntity<Utente> getTestoPut(@RequestBody Utente ut){
		Utente u = new Utente();
		u.setNome(ut.getNome() + "---");
		u.setCognome(ut.getCognome()+ "----");
		return ResponseEntity.ok(u);
	}
}
