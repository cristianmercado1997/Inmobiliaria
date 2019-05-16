package tipo.construccion;

import clases.Enum.TipoConstruccion;
import clases.Construccion;

public class vivienda extends Construccion {

    private int precio;
    private int numHabitaciones;
    private int piso;

    public vivienda(String ubicacion, int metrosCuadrados, TipoConstruccion tipo, int precio, int numHabitaciones, int piso) {
        super(ubicacion, metrosCuadrados, tipo);
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
    }

    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

     public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

   
    
    @Override
    public void muestra() {
        System.out.println("--------- Vivienda -------------");
        System.out.println("Tipo de Construccion: " + tipo.name()); 
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Precio: "+ precio);
        System.out.println("Area *metrosCuadrados*: " + metrosCuadrados);
        System.out.println("Tipo de Construccion: " + tipo.name());
        System.out.println("Numero de Habitaciones: " + numHabitaciones);
        System.out.println("--------------------------------");
    }
}
