
package ed_uc2_181539;

import Lineales.CDEC;
import Lineales.LDE;
import Lineales.LDEC;
import Lineales.LES;
import Lineales.LESC;
import Nodos.Nodo;
import Nodos.NodoD;
import noLineales.Vertice;

/**
 *
 * @author manuel donato 181539
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vertice uno = new Vertice(1);
        Vertice dos = new Vertice(2);
        Vertice tres = new Vertice(3);
        Vertice cuatro= new Vertice(4);
        Vertice cinco = new Vertice(5);
        Vertice seis = new Vertice(6);
        
        uno.agregarVecino(dos);
        uno.agregarVecino(seis);
        uno.agregarVecino(cinco);
        
        dos.agregarVecino(uno);
        
        tres.agregarVecino(tres);
        tres.agregarVecino(cuatro);
        
        System.out.println("Vertice uno");
        for (int i = 0; i < uno.vecinos.size(); i++) {
            System.out.println( "Vecino --> " + uno.vecinos.get(i).valor);
        } System.out.println("");
        
        System.out.println("Vertice dos");
        for (int i = 0; i < dos.vecinos.size(); i++) {
            System.out.println("Vecino --> " + dos.vecinos.get(i).valor);
        } System.out.println("");
        
        System.out.println("Vertice tres");
        for (int i = 0; i < tres.vecinos.size(); i++) {
            System.out.println("Vecino --> " + tres.vecinos.get(i).valor);
        }System.out.println("");
        
    }
    
}
