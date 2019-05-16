package clases;

import clases.Inmobiliaria;
import clases.Inmueble;
import tipo.superficie.Solares;
import java.util.LinkedList;
import clases.Enum.ZonaSolar;
import tipo.construccion.LocalComercial;
import clases.Enum.TipoConstruccion;
import clases.Enum.TipoGaraje;
import tipo.construccion.vivienda;
import tipo.superficie.PlazaGaraje;



public class Programa {

  
    public static void main(String... args) {
        Inmobiliaria agen = new Inmobiliaria("Agencia tu casa soñada:");
        
        Solares solar1, solar2, solar3;
        solar1 = new Solares("Villa Marvella", 200, ZonaSolar.URBANO);
        solar2 = new Solares("Manzanares", 600, ZonaSolar.RUSTICO);
        solar3 = new Solares("El Pando", 300, ZonaSolar.URBANO);
        
        
        LocalComercial localcom1, localcom2, localcom3,localcom4;
        localcom1 = new LocalComercial("San Miguel", 200, TipoConstruccion.NUEVA);
        localcom2 = new LocalComercial("Pastrana", 600, TipoConstruccion.SEGUNDA_MANO);
        localcom3 = new LocalComercial("Maria Eugenia", 800, TipoConstruccion.NUEVA);
        localcom4 = new LocalComercial("Bastidas", 800, TipoConstruccion.SEGUNDA_MANO);
        
        PlazaGaraje plazag1, plazag2;
        
        plazag1 = new PlazaGaraje("Gaira", 900, TipoGaraje.PRIVADO);
        plazag2 = new PlazaGaraje("Primero de Mayo", 500, TipoGaraje.PUBLICO);
        
        vivienda vivien1;
        vivienda vivien2;
        vivien1 = new vivienda("Avenida del Rio", 400, TipoConstruccion.SEGUNDA_MANO, 300000, 8, 4);
        vivien2 = new vivienda("Cienaga", 200, TipoConstruccion.NUEVA, 250000, 2, 1);
       
    
        agen.añadirAlquilerInmueble(localcom1);
        agen.añadirAlquilerInmueble(localcom2);
        agen.añadirAlquilerInmueble(localcom3);
        agen.añadirAlquilerInmueble(localcom4);
        
        agen.añadirAlquilerInmueble(plazag1);
        agen.añadirAlquilerInmueble(plazag2);
       
       
        
        agen.añadirInmueble(solar1);
        agen.añadirInmueble(solar2);
        agen.añadirInmueble(solar3);
        agen.añadirInmueble(vivien1);
        agen.añadirInmueble(vivien2);
       
    
        
        int numSolares = agen.solarRusticos();
        System.out.println("Numero de solares rusticos en venta : " + numSolares);
        System.out.println("\n___________________\n");
        
        LinkedList<Inmueble> lista = (LinkedList<Inmueble>) agen.inmueblesVenta(600000);
        System.out.println(".Inmuebles que se ofrecen con precio menor a 600000");
        for (Inmueble inmueble : lista) {
            inmueble.muestra();
            System.out.println("\n_________________\n");
        }

        LinkedList<LocalComercial> locales = (LinkedList<LocalComercial>) agen.localesSegundaMano(400);
        System.out.println(" Locales comerciales que tienen area cuadrada mayor a 400mts");
        for (LocalComercial local : locales) {
            local.muestra();
            System.out.println("\n___________________\n");
        }

       
    }
}
