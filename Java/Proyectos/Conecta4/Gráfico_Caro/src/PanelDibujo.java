
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PanelDibujo extends JPanel{
    
    JTextArea texto1 = new JTextArea();
    Tablero miTablero = new Tablero();
    MiniMax minimax=new MiniMax();
            
    PanelDibujo(){
        this.setBackground(Color.getHSBColor(246,244,242));
        this.add(texto1); 
    }

    void ReiniciaJuego() {
        miTablero.Reinicia();//reinicia el juego
        texto1.setText(miTablero.toString());
    }
    
    void Mueve(int col){//Persona
        if(!miTablero.Lleno()){
                miTablero.CambiarColor(1);
                miTablero.Pinta(col);
                texto1.setText(miTablero.toString());
                
                if(miTablero.Finish()) {
                    texto1.setText("¡¡GANASTE!!!");
                    miTablero.Reinicia();
                }
                
                
                Mueve();
                           
        }
    }
    
    void Mueve(){//Máquina
        if(!miTablero.Lleno()){
            
                miTablero.CambiarColor(2);
                int r=minimax.minimax(miTablero);
                if(r !=-1) miTablero.Pinta(r);
                texto1.setText(miTablero.toString());
                
                if(miTablero.Finish()) {
                    texto1.setText("¡¡PERDISTE!!");
                    miTablero.Reinicia();
                }
        }
        
        else texto1.setText("¡¡EMPATE!!");
    }
}
