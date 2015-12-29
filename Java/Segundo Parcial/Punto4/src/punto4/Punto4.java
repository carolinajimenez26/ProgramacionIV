
package punto4;


public class Punto4 {

    public static void main(String[] args) {
        Hardware h = new Hardware('A', "Compuerta AND", true);
        Software s = new Software('B', "Pacman", "ProgramaJuegos");
        Calcula ch = new Calcula();
        
        System.out.println("Hardware: ");
        System.out.println("Código: " + h.getCodigo());
        System.out.println("Descripcion: " + h.getDescripcion());
        System.out.print("Periférico: ");
        if(h.isPeriferico()) System.out.println("Si");
        else System.out.println("No");
        System.out.println("Precio: " );
        ch.visit(h);
        System.out.println("\n");
        
        System.out.println("Software: ");
        System.out.println("Código: " + s.getCodigo());
        System.out.println("Descripcion: " + s.getDescripcion());
        System.out.print("Tipo: " + s.getTipo());
        System.out.println("\nPrecio: " );
        ch.visit(s);
        
    }
    
}
