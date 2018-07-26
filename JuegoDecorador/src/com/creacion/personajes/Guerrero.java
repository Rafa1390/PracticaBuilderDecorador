package com.creacion.personajes;

public class Guerrero extends Personaje{
	public Guerrero() {
		this.profesion = "Guerrero";
	}
	public int vida() {
		return 20;
	}
	public int ataque() {
		return 30;
	}
	public int defensa() {
		return 30;
	}
	public int magia() {
		return 20;
	}
}
