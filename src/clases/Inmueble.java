package clases;

public abstract class Inmueble {
    
    protected int metrosCuadrados;
    protected String ubicacion;

    protected Inmueble(String ubicacion, int metrosCuadrados) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
    }

    
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    
    public abstract void muestra();
}
