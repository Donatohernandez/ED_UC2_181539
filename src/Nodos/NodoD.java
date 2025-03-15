
package Nodos;

/**
 *
 * @author manuel donato 181539
 */
public class NodoD {
    
    private int valor;
     private NodoD sig;
     private NodoD ant;

    public NodoD(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        String antVal = (ant == null) ? "null" : String.valueOf(ant.getValor());
        String sigVal = (sig == null) ? "null" : String.valueOf(sig.getValor());
        return "<-- " + antVal + " | " + valor + " | " + sigVal + " -->";
    }

}
