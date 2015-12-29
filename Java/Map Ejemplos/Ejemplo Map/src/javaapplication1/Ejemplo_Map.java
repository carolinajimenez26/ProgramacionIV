
package javaapplication1;
import java.util.HashMap;
import java.util.Map;

public class JavaApplication1 {

    public static void main(String[] args) {
        Map mp = new HashMap();
        mp.put(1, "A");
        mp.put(2, "B");
        mp.put(3, "C");
        mp.put(4, "D");
        System.out.println("Mappings into Map (mp) are  : " + mp);
        System.out.println("Size of Map (mp) = " + mp.size());
        Map mp1 = new HashMap();
        mp1.putAll(mp);
        mp1.put(5, "E");
        System.out.println("Mappings into Map (mp1) after copying all the maps from Map (mp) =");
        System.out.println(mp1);
        System.out.println("Size of Map (map1) = " + mp1.size());

    }
    
}
