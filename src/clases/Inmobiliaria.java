package clases;
import clases.Enum.ZonaSolar;
import tipo.superficie.PlazaGaraje;
import tipo.superficie.Solares;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tipo.construccion.LocalComercial;
import tipo.construccion.vivienda;


public class Inmobiliaria implements Agencia {

    private final ArrayList<Inmueble> lventas;
    private final ArrayList<Inmueble> lAlquileres;
    private final String nombreAgencia;

    public Inmobiliaria(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
        this.lventas = new ArrayList<>();
        this.lAlquileres = new ArrayList<>();
    }

    @Override
    public boolean añadirInmueble(Inmueble inmueble) {
        if (!lventas.contains(inmueble)) {
            if ((inmueble instanceof Solares) || (inmueble instanceof vivienda)) {
                lventas.add(inmueble);
                return true;
            } else {
                System.out.println("El Inmueble No es valido para las ventas ");
            }
        }

        return false;
    }

   

    @Override
 public LinkedList<Inmueble> inmueblesVenta(int precio) {
        LinkedList<Inmueble> listaInmuebles = new LinkedList<>();
        
        for (int i = 0; i < lventas.size(); i++) {
            Inmueble inmueble = lventas.get(i);
            
            if (inmueble instanceof Solares) {
                if (((Solares) inmueble).precio() < precio) {
                    listaInmuebles.add(inmueble);
                }
            } else if (inmueble instanceof vivienda) {
                if (((vivienda) inmueble).getPrecio() < precio) {
                    listaInmuebles.add(inmueble);
                }
            }
        }

        return listaInmuebles;
    }
 @Override
    public boolean añadirAlquilerInmueble(Inmueble inmueble)  {
        if (!lAlquileres.contains(inmueble)) {
            if ((inmueble instanceof PlazaGaraje) || (inmueble instanceof LocalComercial)) {
                lAlquileres.add(inmueble);
                return true;
            } else {
                System.out.println("El Inmueble No es valido para alquileres!");
            }
        }

        return false;
    }

    @Override
   
 
    public LinkedList<LocalComercial> localesSegundaMano(int area) {
        LinkedList<LocalComercial> listaLocales = new LinkedList<>();
        for (int i = 0; i < lAlquileres.size(); i++) {
            Inmueble inmueble = lAlquileres.get(i);
            if (inmueble instanceof LocalComercial) {
                LocalComercial local = (LocalComercial) inmueble;
                int areaLocal = local.metrosCuadrados;
                if (areaLocal > area) {
                    listaLocales.add(local);
                }
            }
        }

        return listaLocales;
    }

    @Override
    public int solarRusticos() {
        int cont = 0;
        
        for (int i = 0; i < lventas.size(); i++) {
            Inmueble inmueble = lventas.get(i);
            if (inmueble instanceof Solares) {
                ZonaSolar var = ((Solares) inmueble).getZona();
                if (var.equals(ZonaSolar.RUSTICO)) {
                    cont = cont + 1;
                }
            }
        }

        return cont;
    }

}
