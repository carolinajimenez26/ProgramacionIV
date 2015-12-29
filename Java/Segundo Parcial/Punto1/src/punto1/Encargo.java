
package punto1;

public class Encargo {
    private String encargoID;
    private String fecha;
    private int valor;
    private Producto producto;
    
    public Encargo(String encargoID, String fecha, int valor){
        this.encargoID = encargoID;
        this.fecha = fecha;
        this.valor = valor;
    }
    
    public String getEncargoID(){
        return encargoID;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void pedirProducto(Producto producto){
        this.producto = producto;
    }
}
