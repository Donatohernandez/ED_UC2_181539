
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
    
    public int size(){
        return tam;
    }
    
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
    
    public void print(){
        NodoD actual = inicial;
        
        while (actual != null) {
            System.out.print(actual.toString());
            actual = actual.getSig();
            }
    }
    
    
    
    
}
