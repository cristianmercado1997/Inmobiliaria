package clases;


import java.util.LinkedList;
import tipo.construccion.LocalComercial;
import java.util.List;

public interface Agencia {
    
  
    LinkedList<LocalComercial> localesSegundaMano(int area);    
      LinkedList<Inmueble> inmueblesVenta(int costo);
    

    

    boolean añadirAlquilerInmueble(Inmueble inmueble);
    boolean añadirInmueble(Inmueble inmueble);
    int solarRusticos();
}
