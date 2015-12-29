
package visitante;

import javaapplication5.Visitor;

public interface Node {
    public double calc();
    public void accept(Visitor v);
}
