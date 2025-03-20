
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author manuel donato 181539
 */
public class LESC {
    
    private Nodo inicial;
    private int tam;
    
    public LESC(Nodo nN) {
        this.inicial = nN;
        inicial.setSiguiente(inicial);
        tam ++;
    }
    
    /**
     * este metodo verifica si la lista está (true) vacía o no (false)
     * @return  true si "inicial" es nulo, false en caso de que haya al menos un 
     * nodo en "inicial"
     */
    public boolean isEmpty() {
        if (inicial == null) {
            return true;
        }
        return false;
    }
    
    /**
     * Regresa la cantidad de elementos que tiene la lista 
     * @return cantidad de elementos que tiene la lista
     */
    public int size() {
        return tam;
    }
    
    /**
     * Lista que añade un nodo al principio de la lista
     * @param nN nodo a añadir
     */
    public void addFirst(Nodo nN){
        if (tam == 1) {
        nN.setSiguiente(inicial);
        inicial.setSiguiente(nN);
        inicial = nN;
        tam ++;
        } else {
            Nodo actual = inicial;
            while (actual.getSiguiente() != inicial) {  
                actual = actual.getSiguiente();
            }
                nN.setSiguiente(inicial);  
                actual.setSiguiente(nN);   
                inicial = nN; 
                tam ++;
        }
    }
    
    /**
     * Lista que añade un nodo al final de la lista
     * @param nN nodo a añadir
     */
    public void addLast(Nodo nN) {
        if (tam == 1) {
        nN.setSiguiente(inicial);
        inicial.setSiguiente(nN);
        inicial = nN;
        tam ++;
        } else {
            Nodo actual = inicial;
            while (actual.getSiguiente() != inicial) {
                actual = actual.getSiguiente();
            }
                actual.setSiguiente(nN);
                nN.setSiguiente(inicial);
                tam ++;
        }
    }
    
    /**
     * metodo que remueve el primer elemento de la lista
     */
    public void removeFirst() {
        if (tam == 1) {
            inicial = null;
            tam = 0;
        } else {
            Nodo actual = inicial;
            while (actual.getSiguiente() != inicial) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(inicial.getSiguiente());
            inicial = inicial.getSiguiente();
            tam --;
        }
    }
    
    /**
     * metodo que elimina el ultimo elemento de la lista
     */
    public void removeLast() {
        if (tam == 1) {
            inicial = null;
            tam = 0;
        } else if (tam > 1) {
            Nodo aux = inicial;
            while (aux.getSiguiente().getSiguiente() != inicial) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(inicial);
            tam --;
        }
    } 
    
    /**
     * busca el elemento dado por el parametro dentro de la lista 
     * @param valor valor dado a buscar en la lista
     * @return regrsa "true" si se encontró el elemento, "false"
     * en caso contrario
     */
    public boolean contains(int valor){
        Nodo actual = inicial;
        boolean b= false;
        while (actual != null){
            if (actual.getValor() == valor) {
                b = true;
                break;
            } else {
            actual = actual.getSiguiente();
            }
        } 
        return b;
    }
    
    /**
     * Metodo que regresa un elemento de la lista dado por el parametro
     * @param valor elemento a obtener dentro de la lista
     * @return el elemento buscado dentro de la lista
     */
    public int getElement(int valor){
         Nodo actual = inicial;
         while (actual != null){
            if (actual.getValor() == valor) {
                return valor;
            } else {
            actual = actual.getSiguiente();
            }
        } 
        return -1;
    }
    
    /**
     * este metodo elimina todos los elementos de la lista
     * @return "true" si se borraron todos los elementos de la 
     * lista, "false" en caso contrario
     */
    public boolean clear() {
        inicial = null;
        tam = 0;
        return true;
    }
    
    /**
     * metodo que imprime la lista
     */
    public void print(){
        if (inicial == null) {
            System.out.println("Lista vacia");
            return;
        } 
        Nodo actual = inicial;
        do {
            System.out.print(actual.toString() + " -> ");
            actual = actual.getSiguiente();
        } while (actual != inicial);
        System.out.println("(vuelve al inicio)");
    }
    
}
