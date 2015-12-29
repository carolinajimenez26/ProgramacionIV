
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.AncestorListener;


public class Ventana extends JFrame implements ActionListener{
    
    Panel mipanel = new Panel();
    PanelDibujo pnlD = new PanelDibujo();
    JButton btnReinicio = new JButton("Reiniciar");//Plan B
    
    public Ventana(){
        setTitle("¡¡Conecta4!!");
        setBounds(0,0,480,520);
        
        setVisible(true);
        
        Container contenido = getContentPane();
        
        contenido.setLayout(new GridLayout(3,1));//3 filas y 1 columna

        contenido.add(mipanel);
        mipanel.btnMover.addActionListener(this);
        contenido.add(pnlD);
       
        btnReinicio.addActionListener(this);
        
        contenido.add(btnReinicio);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btnReinicio) pnlD.ReiniciaJuego();
        if(ae.getSource() == mipanel.btnMover) pnlD.Mueve(Integer.parseInt(mipanel.ingreso.getText().trim()));
    }

}
