package com.creacion.personajes;

public class Trabajador extends Personaje{
	public Trabajador() {
		this.profesion = "Trabajador";
	}
	public int vida() {
		return 25;
	}
	public int ataque() {
		return 10;
	}
	public int defensa() {
		return 10;
	}
	public int magia() {
		return 10;
	}
}
