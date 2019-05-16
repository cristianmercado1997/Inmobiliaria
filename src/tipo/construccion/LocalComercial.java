package tipo.construccion;

import clases.Enum.TipoConstruccion;
import clases.Construccion;

public class LocalComercial extends Construccion {

    public LocalComercial(String ubicacion, int metrosCuadrados, TipoConstruccion tipo) {
        super(ubicacion, metrosCuadrados, tipo);
    }

    @Override
    public void muestra() {
        System.out.println("*********** LOCAL C:*************");
        
        System.out.println("Precio del Local: " + precio());
        System.out.println("Area *metrossCuadrados*: " + metrosCuadrados);
        System.out.println("Tipo de Construccion: " + estilo.name());
        System.out.println("Ubicacion: " + ubicacion);
        
        System.out.println("***********************************");
        
    } 
    public int precio() {
        return (5000 * this.metrosCuadrados);
    }
    
   
}
