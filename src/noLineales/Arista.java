
package noLineales;

/**
 *
 * @author manuel donato 181539
 */
public class Arista {
    
    Vertice vOrigen;
    Vertice vDestino;
    int peso;

    public Arista(Vertice vOrigen, Vertice vDestino, int peso) {
        this.vOrigen = vOrigen;
        this.vDestino = vDestino;
        this.peso = peso;
    }

    public Arista(Vertice vOrigen, Vertice vDestino) {
        this.vOrigen = vOrigen;
        this.vDestino = vDestino;
    }
    
    
    
}
