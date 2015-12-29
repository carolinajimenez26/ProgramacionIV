
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Panel extends JPanel implements ActionListener{
    
    JTextField ingreso = new JTextField("  ");//donde el usuario pone su movimiento
    JButton btnMover = new JButton("Mover");
    PanelDibujo pnlD = new PanelDibujo();
    
    Panel(){
       // this.setBackground(Color.lightGray);
        setBackground(Color.getHSBColor(246,244,242));
        JLabel texto1 = new JLabel("Ingrese la columna: ");
        this.add(texto1); 
        this.add(ingreso);
        btnMover.addActionListener(this);
        this.add(btnMover);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(ingreso.getText().trim());
        pnlD.Mueve(n);
    }
}
