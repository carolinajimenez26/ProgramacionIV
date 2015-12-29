package javaapplication5;

import visitante.Node;

public class Number implements Node{
    private double value;

    public Number(double value){
        this.value = value;
    }
    
    public Number(){
        this.value = 0.0;
    }
    
    public double getValue(){
        return value;
    }
    
    @Override
    public double calc() {
        return value;
    }
    
    //@Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
