
import controller.conecta4Controller;
import model.MiniMax;
import model.Tablero;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        /*Scanner sc = new Scanner(System.in);
        
        Tablero T=new Tablero();
        MiniMax minimax=new MiniMax();
        int col,r;
        
        while(!T.Lleno()){
            
            System.out.println("ingrese la columna");
            col=sc.nextInt();
            
            
            T.CambiarColor(1);//escoge el color de juego 1-->amarillo
            T.Pinta(col);//juega
            
            T.ImprimirTablero();//muestra la jugada realizada
            System.out.println();
            
            
            if(T.Finish()) {
                System.out.println("GANASTE!!!");
                break;
            }
            
            T.CambiarColor(2);
            r=minimax.minimax(T);
            
            if(r !=-1) T.Pinta(r);
            
            T.ImprimirTablero();
           
            
            if(T.Finish()){ 
                
                System.out.println("Perdiste!!!");
                break;
            
            }
            
        }*/
        
        /*T.ImprimirTablero();

        T.CambiarColor(1);//se asigna su color
        T.Pinta(0);//juega, recibe la columna
        T.Pinta(2);//juega
        T.Pinta(3);//juega
        T.Pinta(1);
        

        T.ImprimirTablero();
        
        System.out.println("Estas en la fila #: "+T.Fila());
        System.out.println("Estas en la columna #: "+T.Columna());
        
        if(T.Finish()) System.out.println("GANASTE!!!");
        else System.out.println("GANASTE!!!");
        */
        
        /*
        T.CambiarColor(2);
        T.Pinta(2);
        
        T.ImprimirTablero();

        
        System.out.println("Estas en la fila #: "+T.Fila());
        System.out.println("Estas en la columna #: "+T.Columna());
        
        
        T.CambiarColor(1);
        T.Pinta(1);
        T.Pinta(3);
        //T.Pinta(4);
        
        System.out.println("Estas en la fila #: "+T.Fila());
        
        System.out.println("Estas en la columna #: "+T.Columna());

        
        if(T.Finish()) System.out.println("GANASTE!!!");
        
        else System.out.println("PERDISTE =b");*/
        
        new conecta4Controller().setVisible(true);
        
    }
}
