package model;


import model.Tablero;
import java.util.Random;


/**
 *
 * @author karen
 */
 public class MiniMax {
    
    private Tablero tablero=new Tablero();
    private final int color_ordenador=2;
    private final int color_persona=1;
    private int contador=0;
    Random rnd = new Random();
    

    public MiniMax(){
        
       
        
    }
    
    //no estoy usando esta funcion por que no quizo funcionar en las comparaciones
    //que usaba para saber si retornaba un ganador o un dos =(
    private int valoracion(Tablero t){
        
        if(t.Finish()&&t.Color()==1) return -1;
        if(t.Finish()&&t.Color()==2) return 1;
        if(t.Lleno()) return 0;
        
        return 2;
        
    }
    
    public int minimax (Tablero t){
        
         for(int i=0; i<6;i++){
              
              for(int j=0; j<7; j++){
                  
                  tablero.matriz[i][j]=t.matriz[i][j];
                      
              }
              
          }
         
         
        
        int aux=-1, mejor=-999999, columna=-1;
        
        for(int i=0; i<7;i++){
            
            
            if(JugadaValida(i, tablero)){
                
                
                tablero.Pinta(i,color_ordenador);
                
                
                aux=Mini();
                                
                
                if(aux>mejor){
                                        
                    mejor=aux;

                    columna=i;
                    
                }
                                
                tablero.Pinta(i,0);
                contador=0;
            }
        }
                    
       contador=0;
        
        return columna;
    }
    
    
    private int Mini(){
        
        
        if(tablero.Finish()){
            
            if(tablero.Color()==color_ordenador) return 1;
            
            if(tablero.Color()==color_persona) return -1;
            
        }
        
        if(tablero.Lleno()) return 0;
        
        contador++;
         
        if(contador>60)return -1;
        
        
            
        int aux=-1, mejor=0;
            
        for(int i=0; i<7; i++){
                
            if(JugadaValida(i, tablero)){
                    
                 tablero.Pinta(i, color_persona);
                    
                   
                 aux=Max();   
                 
                        
                 mejor=mejor+aux;
                    
                 tablero.Pinta(i,0);
            }
        }
            

         return mejor;
        
                
    }
    
    
    private int Max(){
        
       if(tablero.Finish()){
            
            if(tablero.Color()==color_ordenador) return 1;
            
            if(tablero.Color()==color_persona) return -1;
            
        }
        
        if(tablero.Lleno()) return 0;
        
        contador++;
         
        if(contador>60)return 0;

         
        
             
             int aux=-1, Maxmejor=0;
             
              for(int i=0; i<7; i++){
                
                if(JugadaValida(i, tablero)){
                    
                    tablero.Pinta(i, color_ordenador);
                    
                   
                    aux=Mini();
                    
                         
                                                
                  Maxmejor=Maxmejor+aux;
                        
                    
                    tablero.Pinta(i,0);
                   
                }
            }
              
              
              
            return Maxmejor;
             
        
    }
       
    
    
    boolean JugadaValida(int y, Tablero tablero){
        
        return (tablero.DimensionValidaColumna(y) && tablero.CasillaVacia(y));
         
    }
    
        
   
    
}
    

