
package punto1;

public class Cliente {
    private String nombre;
    private String direccion;
    private Encargo encargo;
    
    public Cliente(String nombre, String direccion){
        this.direccion = direccion;
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void pago(){//Se dice cuánto se debe pagar por el encargo
        System.out.println("Se debe pagar: " + encargo.getValor());
    }
    
    public void pedirEncargo(Encargo encargo){
        this.encargo = encargo;
    }
}
