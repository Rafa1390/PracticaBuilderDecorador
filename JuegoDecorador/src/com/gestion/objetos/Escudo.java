package com.gestion.objetos;

import com.creacion.personajes.Personaje;

public class Escudo extends DecoradorPersonaje{
	Personaje personaje;
	
	public Escudo(Personaje pPersonaje) {
		this.personaje = pPersonaje;
	}

	@Override
	public String getProfesion() {
		return this.personaje.getProfesion() + ", con Escudo";
	}

	@Override
	public int vida() {
		return 10 + this.personaje.vida();
	}

	@Override
	public int ataque() {
		return this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return 40 + this.personaje.defensa();
	}

	@Override
	public int magia() {
		return this.personaje.magia();
	}
}
