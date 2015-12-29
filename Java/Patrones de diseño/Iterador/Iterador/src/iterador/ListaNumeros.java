package iterador;


public class ListaNumeros{
    private int[] numeros;
    private int posicion;
    
    public ListaNumeros(){
        numeros = new int[10];
        posicion = 0;
    }
    
    public void Agregar(int n){
        numeros[posicion++] = n;
    }
    
    public IteradorListaNumeros iterador(){
        return new IteradorListaNumeros(numeros);
    }
    
    
}
