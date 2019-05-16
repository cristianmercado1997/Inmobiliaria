package clases;

public abstract class Inmueble {
    
    protected int metrosCuadrados;
    protected String ubicacion;

    
    
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
    protected Inmueble(String ubicacion, int metrosCuadrados) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
    }


    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
     public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

   
    
    
    public abstract void muestra();
}
