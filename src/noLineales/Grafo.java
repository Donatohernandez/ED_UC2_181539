
package noLineales;

/**
 *
 * @author manuel donato 181539
 */
public class Grafo {
    
    Vertice vertices[];
    Arista adyasencia[][];
    int cantidadVertices;
    int maximoNodos;
    
    
    public Grafo(int tam) {
        this.vertices = new Vertice[tam];
        adyasencia = new Arista[tam][tam];
        cantidadVertices = 0;
        maximoNodos = tam;
    }
    
    public void agregarVertive( Vertice nV) {
        if (cantidadVertices < vertices.length) {
            vertices[cantidadVertices] = nV;
            cantidadVertices ++;
        }
    } 
    
    private int buscarIndice(Vertice valor) {
        return 0;
    }
    
    public void agregarArista(Vertice desde, Vertice hasta) {
        
    }
    
    
}
