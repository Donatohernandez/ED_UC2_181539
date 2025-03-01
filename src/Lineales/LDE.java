
package Lineales;

import Nodos.NodoD;

/**
 *
 * @author manue
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
     * Añade elementos al principio de la lista 
     * @param val valor que se desea añadir a la lista
     * @return verdadero si se agregó con exito el valor a la lista
     */
    public boolean addLast(int val){
        //crear el nuevo nodo
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
