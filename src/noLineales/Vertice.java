
package noLineales;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author manuel donato 181539
 */
public class Vertice <T> {
    
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertice<?> other = (Vertice<?>) obj;
        return Objects.equals(this.valor, other.valor);
    }
    
    
    
}
