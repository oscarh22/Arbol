
package arbol;

import java.util.Scanner;


public class Arbol {

  
    public static void main(String[] args) {
       Grafo G = new Grafo();
        int opc;
        System.out.println("=========================");
        System.out.println("RECORRIDO POR AMPLITUD");
        System.out.println("=========================");
        System.out.println("¿Cuanto nodos tiene el arbol?: ");
        Scanner entrada = new Scanner(System.in);
        int cant = entrada.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Ingrese los valores de los nodos: ");
        for(int i=0;i<cant;i++){
            G.insertarNodoG();
        }
        System.out.println("==================================");
        System.out.println("Adyacentes de los nodos");
        System.out.println("===================================");
        do{
            System.out.println("Ingrese el nodo que desea ingresar los adyacentes");
            G.insertarAdyacente();
            System.out.println("-----------------------------------------");
            System.out.print("¿Desea ingresar otro adyacente?: (Si: 1) (No: Cualquier numero) -> ");
            opc = entrada.nextInt();
            System.out.println("-----------------------------------");
        }while(opc == 1);
        do{
            System.out.println("==========================");
            System.out.println("Recorrido por Amplitud: ");
            System.out.println("---------------------------");
            G.busquedaAmplitud();
            System.out.println("\n---------------------------");     
            System.out.println("¿Desea hacer otro recorrido? (Si: 1) (No: Cualquier numero)->");
            opc = entrada.nextInt();
        }while(opc==1);
    }
    
}
