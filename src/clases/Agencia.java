package clases;


import java.util.LinkedList;
import tipo.construccion.LocalComercial;
import java.util.List;

public interface Agencia {
    
    LinkedList<Inmueble> inmueblesVenta(int precio);
    LinkedList<LocalComercial> localesSegundaMano(int area);    
    

    
    boolean añadirInmueble(Inmueble inmueble);
    boolean añadirAlquilerInmueble(Inmueble inmueble);

    int solarRusticos();
}
