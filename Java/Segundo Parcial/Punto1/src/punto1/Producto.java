
package punto1;

public class Producto {
   private String ID;
   private int coste;
   
   public Producto(String ID, int coste){
       this.ID = ID;
       this.coste = coste;
   }
   
   public String getID(){
       return ID;
   }
   
   public int getCoste(){
       return coste;
   }
}
