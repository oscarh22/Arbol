
package arbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Grafo {
    private List<NodoG> nodoGrafo;
    
    public Grafo(){
        nodoGrafo = new ArrayList<NodoG>();
    }

    public List<NodoG> getNodoGrafo() {
        return nodoGrafo;
    }

    public void setNodoGrafo(ArrayList<NodoG> nodoGrafo) {
        this.nodoGrafo = nodoGrafo;
    }
    
    public void insertarNodoG(){
        System.out.println("Inserte dato: ");
        Scanner entrada = new Scanner(System.in);
        System.out.print("->");
        int valor = entrada.nextInt();
        NodoG nodo = new NodoG(valor);
        nodoGrafo.add(nodo);       
    }
    
    public NodoG buscarNodoGrafo(int n1){
        NodoG nodo = null;
        for (NodoG nodoGrafo1 : nodoGrafo) {
            if(nodoGrafo1.getDato() == n1){
                nodo = nodoGrafo1;
            }
        }
        return nodo;
    }
    
    public void insertarAdyacente(){
        System.out.println("Insertar dato del nodo del grafo: ");
        Scanner entrada = new Scanner(System.in);
        System.out.print("->");
        int valor = entrada.nextInt();
        NodoG nodo = buscarNodoGrafo(valor);
        if(nodo!=null){
            System.out.println("Insertar dato del adyacente: ");
            System.out.print("->");
            int dato = entrada.nextInt();
            NodoG nuevo = new NodoG(dato);
            nodo.getAdyacentes().add(nuevo);
        }
        else{
            System.out.println("->Nodo no existe en el grafo.");
        }
    }
    
    public void busquedaAmplitud(){
        System.out.println("Inserte nodo inicial: ");
        Scanner entrada = new Scanner(System.in);
        int dato = entrada.nextInt();
        System.out.println("-----------------------");
        NodoG inicio = buscarNodoGrafo(dato);
        if(inicio!=null){
            Queue<NodoG> cola = new LinkedList<NodoG>();
            
            cola.add(inicio);
            inicio.setVisitado(true);
            while(!cola.isEmpty()){
              //  System.out.println("tamanio: "+cola.size());
                NodoG elem = cola.poll();
                //System.out.println("--------------");
                System.out.print("->" + elem.getDato());
                //System.out.println("--------------");
                List<NodoG> ady = elem.getAdyacentes();
                for (int i = 0;i<ady.size();i++) {
                    NodoG ady1 = ady.get(i);
                    if(ady1!= null && !ady1.isVisitado()){
                        cola.add(ady1);
                        ady1.setVisitado(true);
                    }
                }
            }
        }
        else{
            System.out.println("El nodo no existe en el grafo");
        }
    }
    
}
