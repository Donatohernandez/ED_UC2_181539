
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author manue
 */
public class LESC {
    
    private Nodo inicial;
    private int tam;
    
    public LESC(Nodo nN) {
        this.inicial = nN;
        inicial.setSiguiente(inicial);
        tam ++;
    }
    
    public void addFirst(int x){
        Nodo nN = new Nodo(x);
        inicial.setSiguiente(nN);
        nN.setSiguiente(inicial);
        inicial = nN;
        tam ++;
    }
    
    public void addLast(Nodo nN) {
        Nodo actual = inicial;
        while (actual.getSiguiente() != inicial) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nN);
        nN.setSiguiente(inicial);
        tam ++;
    }
    
    
    
}
