
package ed_uc2_181539;

import Lineales.LDE;
import Lineales.LES;

/**
 *
 * @author manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        LDE l = new LDE();
//        
//        
        
//        l.addLast(0);
//        l.addLast(1);
//        l.addLast(2);
//        l.addLast(3);
//        l.print();
//        
//        System.out.println("");
//        l.removeFirst();
//        l.print();
//        
//        System.out.println("");
//        System.out.println(l.contains(2));
//        l.print();



        LES l1 = new LES();
        l1.addFirst(9);
        l1.addFirst(6);
        l1.addFirst(1);
        l1.addFirst(3);
        l1.print();
        System.out.println("");
        System.out.print(l1.clear());
        System.out.println(" verdadero del metodo clear");
        System.out.print(l1.isEmpty());
        System.out.println(" verdadero del metodo isEmpty");
        System.out.println("para verificar que la lista esta vacia");
        
        
    }
    
}
