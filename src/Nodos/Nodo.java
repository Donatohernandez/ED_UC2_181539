
package Nodos;

/**
 *
 * @author manuel donato 181539
 */
public class Nodo {
    
    private int valor;
    private Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo-->" +  String.valueOf(valor);
    }
    
}
