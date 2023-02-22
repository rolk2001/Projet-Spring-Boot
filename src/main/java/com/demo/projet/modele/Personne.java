package com.demo.projet.modele;

public class Personne {
	private String nom;
	private String prenom;
	private String email;
	private Integer age;
	
	public Personne() {
		super();
	}
	public Personne(String nom, String prenom, String email, Integer age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
