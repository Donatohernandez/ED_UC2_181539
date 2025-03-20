
package Lineales;

import Nodos.NodoD;

/**
 *
 * @author manuel donato 181539
 */
public class LDE {
    
    private NodoD inicial;
    private int tam = 0;
    
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
     * metodo que añade un valor dado al principio de la lista
     * @param val valor dado a añadir al principio de la lista 
     * @return confirmacion "true" si se añadió correctamente
     * "false" en caso contrario
     */
    public boolean addFirst(int val) {
        NodoD nN = new NodoD(val);
        if (tam == 0) {
            inicial = nN;
            tam ++;
            return true;
        } else if (tam > 0) {
            nN.setSig(inicial);
            inicial.setAnt(nN);
            inicial = nN;
            tam ++;
            return true;
        }
        return false;
    }
    
    /**
     * Añade elementos al principio de la lista 
     * @param val valor que se desea añadir a la lista
     * @return verdadero si se agregó con exito el valor a la lista
     */
    public boolean addLast(int val){
        NodoD nN = new NodoD(val);
        if (tam == 0) {
            inicial = nN;
            tam ++;
            return true;
        } else {
            NodoD actual = inicial;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(nN);
            nN.setAnt(actual);
            tam ++;
            return true;
        }
    }
    
    /**
     * Elimina el elemento al inicio de la lista
     */
    public void removeFirst() {
        if (tam == 1) {
            inicial = null;
            tam --;
        }else if (tam > 1) {
            inicial = inicial.getSig();
            inicial.getAnt().setSig(null);
            inicial.setAnt(null);
            tam --;
        }
    }
    
    /**
     * Elimina el elemento al final de la lista
     */
    public void removeLast() {
        if (tam == 1) {
            inicial = null;
            tam = 0;
        } else if (tam > 1){
            NodoD actual = inicial;
            while (actual.getSig().getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(null);
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
