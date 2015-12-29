
package controller;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.MiniMax;
import model.Tablero;
import view.Conecta4View;

/**
 *
 * @author carolinajimenez26
 */
public class conecta4Controller extends JFrame{
    
    private Tablero modelTablero = new Tablero();
    private MiniMax modelMiniMax = new MiniMax();
    private Conecta4View view = new Conecta4View(modelTablero);
    
    private JTextField _rowTF = new JTextField(2);
    private JTextField _colTF = new JTextField(2);
    private JTextField _valTF = new JTextField(2);
    
    public conecta4Controller(){
        // 1. Crea/Inicializa Componentes
        JButton moveBtn = new JButton("Mover");

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(new JLabel("Col [1-9]:"));
        controlPanel.add(_colTF);
        controlPanel.add(moveBtn);

        //... Add listener
        moveBtn.addActionListener(new MoveListener());

        // 2... Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        // 3... Add the components to the content panel.
        content.add(controlPanel, BorderLayout.NORTH);
        //content.add(view, BorderLayout.CENTER);

        // 4... Set this window's attributes, and pack it.
        setContentPane(content);
        setTitle("Conecta4 Version 0.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);               // Don't let user resize it.
        pack();
        setLocationRelativeTo(null);       // Center it.
    }
    
    private class MoveListener implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            try {
                //... Translate row and col to zero-based indexes.
                int col = Integer.parseInt(_colTF.getText().trim()) - 1;
                if (modelTablero.DimensionValidaColumna(col)) {
                    modelTablero.Pinta(col);
                    view.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Columna inválida.");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Por valor entre un valor numerico.");
            }
        }
    }
}
    
