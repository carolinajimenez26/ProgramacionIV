
package iterador;

public class IteradorListaPalabras implements Iterator{
    private String palabra1, palabra2, palabra3;
    private int posicion;
    
    public IteradorListaPalabras(String palabra1, String palabra2, String palabra3){
        this.palabra1 = palabra1;
        this.palabra2= palabra2;
        this.palabra3 = palabra3;
        posicion = 0;
    } 
    
    @Override
    public Object siguiente() {
        switch(posicion++){
            case 0: 
                return palabra1;
            case 1: 
                return palabra2;
            case 2: 
                return palabra3;
        }
        return null;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < 3;
    }
}
