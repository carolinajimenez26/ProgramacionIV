
package hashmap;

import java.util.Iterator;
import java.util.Map;

public class HashMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");		map.put(15, "Ramos");
        map.put(3, "Pique");		map.put(5, "Puyol");
        map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");		map.put(6, "Iniesta");
        map.put(7, "Villa");

        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
          Integer key = it.next();
          System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }
    
}
