package iterador;


public class ListaPalabras {
    private String palabra1, palabra2, palabra3;
    private int posicion;
    
    public ListaPalabras(){
        posicion = 0;
    }
    
    public void Agregar(String s){
        switch(posicion){
            case 0:
                palabra1 = s;
                break;
            case 1:
                palabra2 = s;
                break;
            case 2:
                palabra3 = s;
                break;
        }
        posicion++;
    }
    
    public IteradorListaPalabras iterador(){
        return new IteradorListaPalabras(palabra1, palabra2, palabra3);
    }
}
