package desarrolloPersonajes;

import com.creacion.personajes.Guerrero;
import com.gestion.objetos.Armadura;
import com.gestion.objetos.Espada;

public class DesarrolloDePersonajes {

	public static void main(String[] args) {
		Guerrero guerrero = new Guerrero();
		Armadura guerreroConArmadura = new Armadura(guerrero);
		Espada guerreroEspYArm = new Espada(guerreroConArmadura);
		
		System.out.println("Los parametros del " + guerrero.getProfesion() + " son los siguientes:\n"
							+ guerrero.vida() + "\n" + guerrero.ataque() + "\n" + guerrero.defensa() +
							"\n" + guerrero.magia());
		
		System.out.println("Los parametros del " + guerreroConArmadura.getProfesion() + 
				" son los siguientes:\n" + guerreroConArmadura.vida() + "\n" + 
				guerreroConArmadura.ataque() + "\n" + guerreroConArmadura.defensa() +	"\n" +
				guerreroConArmadura.magia());
		
		System.out.println("Los parametros del " + guerreroEspYArm.getProfesion() + 
				" son los siguientes:\n" + guerreroEspYArm.vida() + "\n" + 
				guerreroEspYArm.ataque() + "\n" + guerreroEspYArm.defensa() +	"\n" +
				guerreroEspYArm.magia());
	}

}
