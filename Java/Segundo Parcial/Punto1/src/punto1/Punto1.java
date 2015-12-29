
package punto1;

public class Punto1 {

    public static void main(String[] args) {
        ClienteParticular cliente = new ClienteParticular("Carolina", "Cartago","1112786793");
        Encargo encargo = new Encargo("Encargo1", "Nov-02-15",30000);
        Producto producto = new Producto("Acetaminofem",3000);

        cliente.pedirEncargo(encargo);//hago un pedido
        encargo.pedirProducto(producto);
        
        System.out.println("He pedido: " + encargo.getEncargoID());
        cliente.pago();//Me dice donde debo pagar
    }
    
}
