
/**
 *
 * @author utp
 */
public interface Node {

    public double calc();

    public void accept(Visitor v);
}
