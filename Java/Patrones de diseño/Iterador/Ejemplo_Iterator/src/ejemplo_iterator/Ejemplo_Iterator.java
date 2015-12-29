
package ejemplo_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo_Iterator {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        int i;
        
        for(i = 0; i < 10; i++) l.add(i);
        
        i = 0;
        for(Iterator iter = l.iterator(); iter.hasNext();){
            if(i < l.size()){ 
                System.out.println(l.get(i));
                i++;
            }
            else break;
        }
    }
    
}
