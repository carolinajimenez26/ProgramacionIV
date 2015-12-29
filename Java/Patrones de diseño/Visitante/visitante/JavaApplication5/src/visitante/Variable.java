package javaapplication5;

import visitante.Node;
import java.util.HashMap;
import java.util.Map;

public class Variable implements Node{

    private String id;
    public Map<String,Double> HM = new HashMap<String,Double>();
    
    public Variable(String id){
        this(id, 0.0);
    }
    
    public Variable(String id, double value) {
        this.id = id;
        setValue(value);
    }
    
    public void setValue(double value) {
        HM.put(id, value);
    }
    
    public double getValue(String id){
        return HM.get(id);
    }
    
    @Override
    public double calc() {
        return HM.get(id);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public double getValue() {
        return HM.get(id);
    }
    
}
