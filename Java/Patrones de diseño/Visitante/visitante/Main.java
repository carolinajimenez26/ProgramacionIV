/**
 *
 * @author utp
 */
public class Main {

    public static void main(String[] args) {
      
        Node root = new SubNode(
          new AddNode(
            new Number(1), 
            new MulNode(
              new Number(2),
              new DivNode(
                new Variable("a", 45.0), 
                new Number(4)
              )
            )
          ),
          new MulNode(
            new Number(5),
            new Number(3)
          )
        );
        System.out.println(root.calc());
        
        CalcVisitor calc = new CalcVisitor();
        root.accept(calc);
        System.out.println(calc.getValue());
    }
    
}
