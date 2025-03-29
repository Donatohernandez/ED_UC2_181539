
package noLineales;

import Lineales.LES;
import java.util.ArrayList;

/**
 *
 * @author manuel donato 181539
 */
public class Vertice {
    
    public int valor;
    public ArrayList<Vertice> vecinos;
    
    public Vertice(int val) {
        this.valor = val;
        vecinos = new ArrayList<Vertice>();
    }
    
    public void agregarVecino(Vertice nV) {
        vecinos.add(nV);
    }
    
}
