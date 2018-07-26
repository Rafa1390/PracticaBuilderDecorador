package com.gestion.objetos;

import com.creacion.personajes.Personaje;

public class Amuleto extends DecoradorPersonaje{
	Personaje personaje;
	
	public Amuleto(Personaje pPersonaje) {
		this.personaje = pPersonaje;
	}

	@Override
	public String getProfesion() {
		return this.personaje.getProfesion() + ", con Amuleto";
	}

	@Override
	public int vida() {
		return this.personaje.vida();
	}

	@Override
	public int ataque() {
		return this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return this.personaje.defensa();
	}

	@Override
	public int magia() {
		if(this.personaje.getProfesion().equals("Trabajador")) {
			return this.personaje.magia();
		}else {
			return 10 + this.personaje.defensa();
		}
	}
}
