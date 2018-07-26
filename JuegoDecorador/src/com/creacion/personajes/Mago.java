package com.creacion.personajes;

public class Mago extends Personaje{
	public Mago() {
		this.profesion = "Mago";
	}
	public int vida() {
		return 8;
	}
	public int ataque() {
		return 15;
	}
	public int defensa() {
		return 15;
	}
	public int magia() {
		return 40;
	}
}
