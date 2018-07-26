package com.creacion.personajes;

public abstract class Personaje {
	String profesion = "desconocido";
	
	public String getProfesion() {
		return profesion;
	}
	
	public abstract int vida();
	public abstract int ataque();
	public abstract int defensa();
	public abstract int magia();
}
