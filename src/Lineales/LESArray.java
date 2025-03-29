
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author manuel donato 181539
 */
public class LESArray {
    
    Nodo inicial;
    int tam;
    int posicion;
    
    public int get(int pos) {
        Nodo aux = inicial;
        //si la lista no está vacia
        if (!(tam == 0) && pos <= tam ) {
            for (int i = 0; i < pos-1; i++) {
                aux.getSiguiente();
            }
        }
        return 0;
    }
    
}
