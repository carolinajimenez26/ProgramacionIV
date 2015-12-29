
package iterador;

public class Iterador_ej {

    public static void main(String[] args) {
        ListaNumeros ln = new ListaNumeros();
        ListaPalabras lp = new ListaPalabras();
        Iterator it;
        
        for(int i = 0; i < 10; i++) ln.Agregar(i);
        lp.Agregar("uno");
        lp.Agregar("dos");
        lp.Agregar("tres");
        
        it = ln.iterador();
        while(it.tieneSiguiente()){
            System.out.println((int) it.siguiente());
        }
        
        it = lp.iterador();
        while(it.tieneSiguiente()){
            System.out.println((String) it.siguiente());
        }
    }
    
}
