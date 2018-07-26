/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import calculadoracomida.InformacionComida.InformacionComidaBuilder;

public class CalculadoraComida {

    public static void main(String[] args) {
        //InformacionComida porcionOllaDeCarne = new InformacionComida("Olla De Carne",240,Medida.ML,2,350,40,50,10);
        
        InformacionComida porcionOllaDeCarne;
        InformacionComidaBuilder builder = new InformacionComida.InformacionComidaBuilder();
        builder = builder.nombre("Olla de carne").cantidadPorcion(240).unidadDeMedida(Medida.ML).porciones(2).calorias(350).grasa(40)
        		.sodio(50).carbohidratos(10);
        porcionOllaDeCarne = builder.crearInfoComida();
        System.out.println(porcionOllaDeCarne.toString());
    }
    
}
