
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author manue
 */
public class LES {
    
    private Nodo inicial;
    private int tam;
    
    /**
     * este metodo verifica si la lista está (true) vacía o no (false)
     * @return  true si "inicial# es nulo, false en caso de que haya al menos un 
     * nodo en "inicial"
     */
    public boolean isEmpty(){
        if (inicial == null) {
            return true;
        }
        return false;
    }
    
    /**
     * Regresa la cantidad de elementos que conforma la lista 
     * @return cantidad de elementos que conforma la lista
     */
    public int size(){
        return tam;
    }
    
    
    public boolean addFirst(Nodo nN){
        if (this.isEmpty()) {
            inicial = nN;
            tam ++;
            return true;
        }else if (size() > 0){
            nN.setSiguiente(inicial);
            inicial = nN;
            tam ++;
            return true;
        }
        return false;
    }
    
    
     public boolean addLast(int val){
        //crear el nuevo nodo
        Nodo nN = new Nodo(val);
        
        if (tam == 0) {
            inicial = nN;
            tam ++;
            return true;
        } else {
            Nodo actual = inicial;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nN);
            tam ++;
            return true;
        }
    }
    
    public void imprimirListaConsola(){
        Nodo nActual = inicial;
        while (nActual != null) {
            System.out.print(nActual.getValor() + "--> ");           
                nActual = nActual.getSiguiente();
        }
    }
    
    public boolean removeFirst(){
        if (size() == 1) {
            inicial = null;
            tam = 0;
            return true;
        } else if (size() > 1) {
            inicial = inicial.getSiguiente();
            tam --;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean removeLast(){
        if (size() == 1) {
            inicial = null;
            tam = 0;
            return true;
        } else if (size() > 1) {
            Nodo nAux = inicial;
            while (nAux.getSiguiente().getSiguiente() != null) {
                nAux = nAux.getSiguiente();
            }
            nAux.setSiguiente(null);
            tam --;
            return true;
        } else {
            return false;
        }
    }
    
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
    
    
}
