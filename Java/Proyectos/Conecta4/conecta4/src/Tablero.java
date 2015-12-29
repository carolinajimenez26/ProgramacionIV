
import java.io.IOException;
import java.util.Scanner;


public class Tablero {
    //amarillo-->1, rojo-->2
    private  int fila, columna,turno,color;
    public final int[][] matriz= new int[6][7];
    
    public Tablero(){
        this.fila=0;
        this.turno=0;
    }
    
    void CambiarFila(int fila){
        this.fila=fila;
    }
    
    public int Fila(){
        return fila;
    }
    
    void CambiarColumna(int columna){
        this.columna=columna;
    }
    
    public int Columna(){
        return columna;
    }
    
    public void AddTurno(){
        turno++;
    }
    
    public int Turno(){
        return turno;
    }
    
    public void CambiarColor(int color){
        this.color = color;
    }
    
    public int Color(){
        return color;
    }
    
    public boolean Lleno(){
        for(int i=0; i<6;i++){
              
              for(int j=0; j<7; j++){
                  
                  if(matriz[i][j] !=0){
                      turno++;
                  }
              }
              
          }
        
        return (turno==48);
    }
    
    public boolean ColumnaLlena(){
        return matriz[0][columna]>0;//el cero significa que no ha metido un color
    }
    
    public boolean DimensionValida(int fila, int columna){
        return DimensionValidaColumna(columna)&&DimensionValidaFila(fila);
    }
    
    public boolean DimensionValidaColumna(int columna){
        return (columna>=0 && columna<7);
    }
    
    public boolean DimensionValidaFila(int fila){
        return (fila>=0 && fila<6);
    }

    
    //hay una casilla vacia para apilar en la columna y
    public boolean CasillaVacia( int y){
        for(int i=5; i>=0; i--){
            if(matriz[i][y]==0) return true;
        }
        
        return false;
    }
    
    public void Pinta(int columna){//agregar una ficha
        for(int i=5;i>=0;i--){
            if(matriz[i][columna]==0){
                matriz[i][columna] = color;
                CambiarFila(i);
                CambiarColumna(columna);
                break;
            }
        }
    }
    
    public void Pinta(int columna, int color){//para el minimax
        CambiarColor(color);
        
        if(color==0){
            
             if(matriz[0][columna]!=0){
                    
                    matriz[0][columna]=0;
                    CambiarFila(0);
                    CambiarColumna(columna);
                }
             
             else{
            
                for(int i=4;i>=0;i--){


                    if(matriz[i][columna]==0){

                        matriz[i+1][columna]= color;
                        CambiarFila(i+1);//guarda la fila en la que añadió el color
                        CambiarColumna(columna);

                        break;

                    }
                }
             }
        }
        
        else{
            for(int i=5;i>=0;i--){
                if(matriz[i][columna]==0){
                    matriz[i][columna]= color;//añade ficha
                    CambiarFila(i);//guarda la fila en la que añadió el color
                    CambiarColumna(columna);

                    break;
                }
            }
        }
    }
    
   private boolean Derecho(int columna){
        int contador=0;
        for(int i=0; i<4;i++){
            
           if(DimensionValidaColumna(columna)){
                if(matriz[fila][columna] != color) return false;
                contador++;
                columna++;
            }
        }
        return contador==4;
    }
    
    private boolean Izquierda(int columna){
         
        int contador=0;
        for(int i=0; i<4;i++){
            
            if(DimensionValidaColumna(columna)){
                
                if(matriz[fila][columna] != color) return false;

                columna--;
                contador++;
            }
            
        }
        
        return contador==4;
        
    }
     
    private boolean Abajo(int fila){//no está el problema
        int contador = 0;
        for(int i=0; i<4;i++){   
            if(DimensionValidaFila(fila)){
                //System.err.println("matriz: "+matriz[fila][columna]+" fila: "+fila+" columna: "+columna);
                if(matriz[fila][columna] != color) return false;
                fila++;
                contador++;
                //System.err.println("entro");
            }
        }
        return contador==4;
    }
     
    private boolean ArribaDerecha( int fila, int columna){
        int contador=0;
        for(int i=0; i<4;i++){
            
            if(DimensionValidaColumna(columna) && DimensionValidaFila(fila)){
                
                if(matriz[fila][columna] != color) return false;

                    columna++;
                    fila--;
                    contador++;
            }
            
        }
        return contador==4;
    }
      
      
    private boolean ArribIzquierda(int fila, int columna){
          
        int contador=0;
        for(int i=0; i<4;i++){
            
            if(DimensionValidaColumna(columna) && DimensionValidaFila(fila)){
                
                if(matriz[fila][columna] != color) return false;

                columna--;
                fila--;
                contador++;
            }
        }
        return contador==4;
    }
      
      
    private boolean AbajoIzquierda( int fila, int columna){
          
        int contador=0;
        
        for(int i=0; i<4;i++){
            
            if(DimensionValidaColumna(columna) && DimensionValidaFila(fila)){
               
                if(matriz[fila][columna] != color) return false;

                columna--;
                fila++;
                contador++;
            }
        }
        return contador==4;
        
    }
      
    private boolean AbajoDerecha( int fila, int columna){
          
        int contador=0;
        
        for(int i=0; i<4;i++){
            
            if(DimensionValidaColumna(columna) && DimensionValidaFila(fila)){
                
                if(matriz[fila][columna] != color) return false;

                columna++;
                fila++;
                contador++;
            }
        }
        return contador==4;
    }
    
    private boolean Lateral_izq(int fila, int columna){
        int contador = 1;//para que se cuente a sí mismo
        if(DimensionValida(fila-1,columna-1)){
            if(matriz[fila-1][columna-1]==color){
                contador++;
                if(DimensionValida(fila-2,columna-2)){
                    if(matriz[fila-2][columna-2]==color) contador++;
                }
            }
        }
        if(DimensionValida(fila+1,columna+1)){
            if(matriz[fila+1][columna+1]==color){
                contador++;
                if(DimensionValida(fila+2,columna+2)){
                    if(matriz[fila+2][columna+2]==color) contador++;
                }
            }
        }
        //System.err.println("contador:"+contador);
        return contador>=4;
    }
    
    private boolean Lateral_der(int fila, int columna){
        int contador = 1;//para que se cuente a sí mismo
        if(DimensionValida(fila-1,columna+1)){
            if(matriz[fila-1][columna+1]==color){
            contador++;
            if(DimensionValida(fila-2,columna+2)){
                if(matriz[fila-2][columna+2]==color) contador++;
            }
            }
        }
        if(DimensionValida(fila+1,columna-1)){
            if(matriz[fila+1][columna-1]==color){
            contador++;
            if(DimensionValida(fila+2,columna-2)){
                if(matriz[fila+2][columna-2]==color) contador++;
            }
            }
        }
        return contador>=4;
    }
    
    private boolean Lados(int fila, int columna){
        int contador = 1;//para que se cuente a sí mismo
        if(DimensionValidaColumna(columna-1)){
            if(matriz[fila][columna-1]==color){
            contador++;
            if(DimensionValidaColumna(columna-2)){
                if(matriz[fila][columna-2]==color) contador++;
            }
            }
        }
        if(DimensionValidaColumna(columna+1)){
            if(matriz[fila][columna+1]==color){
            contador++;
            if(DimensionValidaColumna(columna+2)){
                if(matriz[fila][columna+2]==color) contador++;
            }
            }
        }
        return contador>=4;
    }
    
    private boolean Laterales(int fila, int columna){
        return Lateral_izq(fila, columna)||Lateral_der(fila, columna);
    }
    
    private boolean arr_abj(int fila){
        int contador = 1;//para que se cuente a sí mismo
        if(DimensionValidaFila(fila-1)){
            if(matriz[fila-1][columna]==color){
            contador++;
            if(DimensionValidaFila(fila-2)){
                if(matriz[fila-2][columna]==color) contador++;
            }
            }
        }
        if(DimensionValidaFila(fila+1)){
            if(matriz[fila+1][columna]==color){
            contador++;
            if(DimensionValidaFila(fila+2)){
                if(matriz[fila+2][columna]==color) contador++;
            }
            }
        }
        return contador>=4;
    }
      
    private boolean Finish_esquineros(){
        if(Derecho(columna)) return true;
        if(Izquierda(columna)) return true;
        if(Abajo(fila)) return true;
        if(ArribaDerecha(fila, columna)) return true;
        if(ArribIzquierda(fila, columna)) return true;
        if(AbajoDerecha(fila, columna)) return true;
        if(AbajoIzquierda(fila, columna)) return true;
        return false;
    }
    
    public boolean Finish_medios(){
        if(Lados(fila, columna)) return true;
        if(Laterales(fila, columna)) return true;
        if(arr_abj(fila)) return true;
        return false;
    }
    
    public boolean Finish(){//solo sirve si el que se ingresa está en la esquina
        if(Finish_esquineros()){//si es un esquinero entonces no se mete por el de abajo
            return true;
        }else{
           return Finish_medios();
        }
    }
      
      public void ImprimirTablero(){
          for(int i=0; i<6;i++){
              for(int j=0; j<7; j++){
                  System.out.print(matriz[i][j]+" ");
              }
              System.out.println();
          }
      }
}
