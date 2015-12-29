
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author utp
 */
public class Variable implements Node {
    
    private static Map<String, Double> st = new HashMap<String, Double>();
    
    private String id;
    
    public Variable(String id) {
        this(id, 0.0);
    }
    
    public Variable(String id, double value) {
        this.id = id;
        setValue(value);
    }
    
    public void setValue(double value) {
        st.put(id, value);
    }
    
    public double getValue() {
        return st.get(id);
    }
    
    @Override
    public double calc() {
        return st.get(id);
    }   

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
