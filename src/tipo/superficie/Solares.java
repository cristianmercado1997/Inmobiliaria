package tipo.superficie;

import clases.Enum.ZonaSolar;
import clases.Superficie;

public class Solares extends Superficie {

    private ZonaSolar zona;

    public Solares(String ubicacion, int metrosCuadrados, ZonaSolar zona) {
        super(ubicacion, metrosCuadrados);
        this.zona = zona;
    }

     public void setZona(ZonaSolar zona) {
        this.zona = zona;
    }
     
    public ZonaSolar getZona() {
        return zona;
    }

    @Override
    public void muestra() {
        System.out.println("------------  Solar  --------------");
        
        System.out.println("Zona: " + zona.name());
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area *metroscuadrados*: " + metrosCuadrados);
        System.out.println("Precio: " + super.precio());
        
        System.out.println("-----------------------------------");
    }
}
