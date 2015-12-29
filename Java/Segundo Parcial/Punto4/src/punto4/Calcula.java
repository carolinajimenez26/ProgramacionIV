
package punto4;

public class Calcula implements Visitor {

    @Override
    public void visit(Hardware h) {
        if(h.getCodigo() == 'A'){
            if(h.isPeriferico())
                System.out.println("Se debe pagar: " + ((double)(100 + 100 * 0.01)));
            else System.out.println("Se debe pagar: 100");
        }
        if(h.getCodigo() == 'B'){
            if(h.isPeriferico())
                System.out.println("Se debe pagar: " + ((double)(50.3 + 50.3 * 0.01)));
            else System.out.println("Se debe pagar: 50.3");
        }
    }

    @Override
    public void visit(Software s) {
        if(s.getCodigo() == 'C'){
            if(s.getTipo() == "ProgramaJuegos")
                System.out.println("Se debe pagar: " + ((double)(150.5 + 150.5 * 0.01)));
            else System.out.println("Se debe pagar: 150.5");
        }
        if(s.getCodigo() == 'B'){
            if(s.getTipo() == "ProgramaJuegos")
                System.out.println("Se debe pagar: " + ((double)(50.3 + 50.3 * 0.05)));
            else System.out.println("Se debe pagar: 50.3");
        }
    }
    
}
