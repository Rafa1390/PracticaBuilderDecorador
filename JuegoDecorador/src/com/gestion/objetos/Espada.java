package com.gestion.objetos;

import com.creacion.personajes.Personaje;

public class Espada extends DecoradorPersonaje{
	Personaje personaje;
	
	public Espada(Personaje pPersonaje) {
		this.personaje = pPersonaje;
	}
	
	@Override
	public String getProfesion() {
		return this.personaje.getProfesion() + ", con Espada";
	}
	
	@Override
	public int vida() {
		return 1 + this.personaje.vida();
	}

	@Override
	public int ataque() {
		return 10 + this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return 10 + this.personaje.defensa();
	}

	@Override
	public int magia() {
		return this.personaje.magia();
	}
}
