
package punto1;

public class ClienteParticular extends Cliente {
    private String tarjNum;
    private String nombre;
    private String direccion;
    
    public ClienteParticular(String nombre, String direccion, String tarjNum) {
        super(nombre, direccion);
        this.tarjNum = tarjNum;
    }
    
    public void pago(){
        System.out.println("Numero tarjeta a la cual se debe pagar: " + tarjNum);
    }
}
