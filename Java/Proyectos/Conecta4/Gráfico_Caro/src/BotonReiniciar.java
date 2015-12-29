
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class BotonReiniciar extends JButton implements ActionListener{

    PanelDibujo pnl_dibujo = new PanelDibujo();
    
    BotonReiniciar(){
        super("Reiniciar");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {//cuando le hundan el botón:
        pnl_dibujo.ReiniciaJuego();//Reinicia el juego
    }
    
    
}
