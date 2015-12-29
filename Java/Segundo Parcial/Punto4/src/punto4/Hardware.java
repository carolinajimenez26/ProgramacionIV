
package punto4;

public class Hardware {
    private char codigo;
    private String descripcion;
    private boolean periferico;
    
    public Hardware(char codigo, String descripcion, boolean preiferico){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.periferico = preiferico;
    }
    
    public void visit(Visitor v){
        v.visit(this);
    }
    
    public char getCodigo(){
        return codigo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public boolean isPeriferico(){
        return periferico;
    }
}
