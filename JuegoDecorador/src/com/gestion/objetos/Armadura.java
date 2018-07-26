package com.gestion.objetos;

import com.creacion.personajes.Personaje;

public class Armadura extends DecoradorPersonaje{
	Personaje personaje;
	
	public Armadura(Personaje pPersonaje) {
		this.personaje = pPersonaje;
	}

	@Override
	public String getProfesion() {
		return this.personaje.getProfesion() + ", con Armadura";
	}

	@Override
	public int vida() {
		return 20 + this.personaje.vida();
	}

	@Override
	public int ataque() {
		return this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return 20 + this.personaje.defensa();
	}

	@Override
	public int magia() {
		return this.personaje.magia();
	}
}
