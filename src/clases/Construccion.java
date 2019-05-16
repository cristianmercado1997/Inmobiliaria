package clases;

import clases.Inmueble;
import clases.Enum.TipoConstruccion;

public abstract class Construccion extends Inmueble {

    protected TipoConstruccion estilo;

    protected Construccion(String ubicacion, int metrosCuadrados, TipoConstruccion tipo) {
        super(ubicacion, metrosCuadrados);
        this.estilo = tipo;
    }

     public void setEstilo(TipoConstruccion estilo) {
        this.estilo = estilo;
    }
    public TipoConstruccion getEstilo() {
        return estilo;
    }

   
}
