
package arbol;

import java.util.ArrayList;
import java.util.List;


public class NodoG {
    private int dato;
    boolean visitado;
    List<NodoG> adyacentes;

    public NodoG(int dato){
        this.dato = dato;
        this.visitado = false;
        this.adyacentes = new ArrayList<>();
    }
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<NodoG> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ArrayList<NodoG> adyacentes) {
        this.adyacentes = adyacentes;
    }
    
    @Override
    public String toString(){
        return (dato + "->");
    } 
}
