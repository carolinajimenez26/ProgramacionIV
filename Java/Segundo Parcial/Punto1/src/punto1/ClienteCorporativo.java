
package punto1;


public class ClienteCorporativo extends Cliente {
    private String nombre;
    private String direccion;
    private String cuenta;
    
    public ClienteCorporativo(String nombre, String direccion, String cuenta) {
        super(nombre, direccion);
        this.cuenta = cuenta;
    }
    
    public void pago(){
        System.out.println("Se debe pagar a la cuenta: " + cuenta);
    }
    
}
