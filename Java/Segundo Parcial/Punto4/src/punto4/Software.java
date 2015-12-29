
package punto4;

public class Software {
    private char codigo;
    private String descripcion;
    private String tipo;
    
    public Software(char codigo, String descripcion, String tipo){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
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
    
    public String getTipo(){
        return tipo;
    }
}
