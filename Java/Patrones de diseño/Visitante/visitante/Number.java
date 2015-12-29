/**
 *
 * @author utp
 */
public class Number implements Node {

    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public double calc() {
        return value;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
