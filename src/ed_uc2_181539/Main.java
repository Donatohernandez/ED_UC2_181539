
package ed_uc2_181539;

import Lineales.LDE;

/**
 *
 * @author manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LDE l = new LDE();
        
        l.addLast(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.print();
        
        System.out.println("");
        l.removeFirst();
        l.print();
        
        System.out.println("");
        System.out.println(l.contains(2));
        l.print();
        
        
    }
    
}
