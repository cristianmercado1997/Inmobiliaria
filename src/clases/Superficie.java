package clases;

import clases.Inmueble;

public abstract class Superficie extends Inmueble {

    protected Superficie(String ubicacion, int metrosCuadrados) {
        super(ubicacion, metrosCuadrados);
    }
    public int precio() {
        return (5000 * this.metrosCuadrados); 
    }
}
