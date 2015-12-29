
package iterador;

public class IteradorListaNumeros implements Iterator{
    private int[] numeros;
    private int posicion;
    
    public IteradorListaNumeros(int[] numeros){
        this.numeros = numeros;
        posicion = 0;
    }
    
    @Override
    public Object siguiente() {
        return numeros[posicion++];
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < numeros.length;
    }
}
