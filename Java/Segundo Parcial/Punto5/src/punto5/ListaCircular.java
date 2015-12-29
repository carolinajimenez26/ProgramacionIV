
package punto5;

public class ListaCircular<T> {
    private T first, last;//para apuntar al primero y al último
    private T next;//apuntamos al siguiente
    private T actual;
    
    public ListaCircular(T elemento){
       if(last == null && first == null){
            next = null;
            first = elemento;
            last = elemento;
            actual = elemento;
       }
       else{//ya hay elementos en la lista
           next = elemento;
           actual = elemento;
       }
    }
    
    
    //Se crea el constructor que si first y null están apuntando aún a null entonces
    //cuando se le agrega el primer elemento se pone first y last a apuntar a si mismo,
    //otro constructor que permita que el elelemto anterior apunte al nuevo elemento que se le ingrese
    
    public Iterator<T> iterador(){
        return Iterator<T>;
    }
}
