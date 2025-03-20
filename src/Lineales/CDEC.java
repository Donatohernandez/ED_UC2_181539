
package Lineales;

import Nodos.NodoD;

/**
 * First in, First out
 * @author manue
 */
public class CDEC {
    
    private NodoD h;
    private int size;
    
    public CDEC() {
        size = 0;
    }
    
    //Encolar, agregar inicio 
    public void enqueue(int val) {
        NodoD nN = new NodoD(val);
        if (size == 0) {
            nN.setSig(nN);
            nN.setAnt(nN);
            size ++;
            h = nN;
        } else {
            nN.setSig(h);
            h.setSig(nN);
            nN.setAnt(h);
            h.setAnt(nN);
            h = nN;
            size ++;
        }
        
    }
    
    //desencolar, remover al inicio 
    public void dequeue() {
        if (size == 1) {
            h = null;
            size = 0;
        } else if (size > 1) {
            h.getAnt().getAnt().setSig(h);
            h.setAnt(h.getAnt().getAnt());
            size --;
        }
    }
    
    //Mostar 
    public NodoD peek() {
        return h.getAnt();
    }
}
