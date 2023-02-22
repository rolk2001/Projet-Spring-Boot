package com.demo.projet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.projet.modele.Personne;

@RestController
public class PersonneController {
	@GetMapping("/personnes")
	public Personne getPersonne () {
		return new Personne("Tadmbaye", "Rodrigue","tadmbayero@gmail.com", 22);
}
}
