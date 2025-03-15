
package Lineales;

import Nodos.NodoD;

/**
 *
 * @author manuel donato 181539
 */
public class LDEC {
    
    private NodoD inicial;
    private int tam;

    public LDEC(NodoD nNodo) {
        this.inicial = nNodo;
        inicial.setSig(inicial);
        inicial.setAnt(inicial);
        tam ++;
    }
    
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
    
    /**
     * Metodo que añade un nodo al principio de la lista
     * @param nN nodo a añadir
     */
    public void addFirst(NodoD nN) {
        if (tam == 1) {
            nN.setSig(inicial);
            inicial.setSig(nN);
            nN.setAnt(inicial);
            inicial.setAnt(nN);
            inicial = nN;
            tam ++;
        } else if (tam > 1) {
            nN.setSig(inicial);
            nN.setAnt(inicial.getAnt());
            inicial.getAnt().setSig(nN);
            inicial.setAnt(nN);
            inicial = nN;
            tam ++;
        }
    }
    
    /**
     * Metodo que añade un nodo al final de la lista
     * @param nN nodo a añadir
     */
    public void addLast(NodoD nN){
        if (tam == 1) {
            nN.setSig(inicial);
            nN.setAnt(inicial);
            inicial.setSig(nN);
            inicial.setAnt(nN);
            tam ++;
        } else {
            NodoD actual = inicial;
            while (actual.getSig() != inicial) {
                actual = actual.getSig();
            }
            nN.setSig(inicial);
            nN.setAnt(actual);
            actual.setSig(nN);
            inicial.setAnt(nN);
            tam ++;
        }
    }
    
    public void removeFirst() {
        
    }

    /**
     * metodo que remueve el ultimo nodo de la lista
     */
    public void removeLast() {
        if (tam == 1) {
            inicial = null;
            tam = 0;
        } else {
            inicial.getAnt().getAnt().setSig(inicial);
            inicial.setAnt(inicial.getAnt().getAnt());
            tam --;
        }
    }
    
    /**
     * busca el elemento dado por el parametro dentro de la lista
     * @param valor valor dado por el parametro
     * @return regresa verdadero si el valor está dentro de la lista
     */
    public boolean contains(int valor){
        NodoD actual = inicial;
        boolean b= false;
        
        while (actual != null){
            if (actual.getValor() == valor) {
                b = true;
                break;
            } else {
            actual = actual.getSig();
            }
        } 
        return b;
    }
    
    /**
     * Metodo que regresa un elemento de la lista dado por el parametro
     * @param valor elemento a obtener dentro de la lista
     * @return el elemento buscado dentro de la lista
     */
    public int getElement(int valor) {
        NodoD actual = inicial;
        
        while (actual != null){
            if (actual.getValor() == valor) {
                return valor;
            } else {
            actual = actual.getSig();
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
        if (inicial == null) {
            return false; 
        }
        inicial = null;
        tam = 0; 
    return true;
    }
    
    /**
     * metodo que imprime la lista
     */
    public void print(){
        NodoD actual = inicial;
        
        while (actual != null) {
            System.out.print(actual.toString());
            actual = actual.getSig();
            }
    }
    
}
