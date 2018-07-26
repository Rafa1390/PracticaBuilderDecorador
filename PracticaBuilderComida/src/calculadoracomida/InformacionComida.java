/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private final String nombre; 
    private final int cantidadPorcion;
    private final Medida unidadDeMedida;
    private final int porciones;
    private final int calorias;
    private final int grasa;
    private final int sodio;
    private final int carbohidratos;

    public InformacionComida(final String pNombre, final int pCantidadPorcion, final Medida pMedida, 
    		final int pPorciones, final int pCalorias, final int pGrasa, final int pSodio, final int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}
    
    public static class InformacionComidaBuilder{
    	private String ndoNombre; 
        private int ndoCantidadPorcion;
        private Medida ndoUnidadDeMedida;
        private int ndoPorciones;
        private int ndoCalorias;
        private int ndoGrasa;
        private int ndoSodio;
        private int ndoCarbohidratos;
        
        public InformacionComidaBuilder nombre(String pNombre) {
        	this.ndoNombre = pNombre;
			return this;
        }
        
        public InformacionComidaBuilder cantidadPorcion(int pCantidadPorcion) {
        	this.ndoCantidadPorcion = pCantidadPorcion;
			return this;
        }
        
        public InformacionComidaBuilder unidadDeMedida(Medida pUnidadDeMedida) {
        	this.ndoUnidadDeMedida = pUnidadDeMedida;
			return this;
        }
        
        public InformacionComidaBuilder porciones(int pPorciones) {
        	this.ndoPorciones = pPorciones;
			return this;
        }
        
        public InformacionComidaBuilder calorias(int pCalorias) {
        	this.ndoCalorias = pCalorias;
			return this;
        }
        
        public InformacionComidaBuilder grasa(int pGrasa) {
        	this.ndoGrasa = pGrasa;
			return this;
        }
        
        public InformacionComidaBuilder sodio(int pSodio) {
        	this.ndoSodio = pSodio;
			return this;
        }
        
        public InformacionComidaBuilder carbohidratos(int pCarbohidratos) {
        	this.ndoCarbohidratos = pCarbohidratos;
			return this;
        }
        
        public InformacionComida crearInfoComida() {
        	return new InformacionComida(ndoNombre, ndoCantidadPorcion, ndoUnidadDeMedida, ndoPorciones, ndoCalorias, ndoGrasa,
        			ndoSodio, ndoCarbohidratos);
        }
    }
    
}
