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
import model.SudokuModel;
import view.SudokuView;

/**
 *
 * @author utp
 */
public class Sudoku extends JFrame {

    private static final String INITIAL_BOARD =
        "8156....46...75.8.....9....9...417...4.....2...623...8....5.....5.91...61....7895";

    private SudokuModel model = new SudokuModel(INITIAL_BOARD);
    private SudokuView view = new SudokuView(model);

    private JTextField _rowTF = new JTextField(2);
    private JTextField _colTF = new JTextField(2);
    private JTextField _valTF = new JTextField(2);

    public Sudoku() {
        // 1. Crea/Inicializa Componentes
        JButton moveBtn = new JButton("Mover");

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(new JLabel("Fila [1-9]:"));
        controlPanel.add(_rowTF);
        controlPanel.add(new JLabel("Col [1-9]:"));
        controlPanel.add(_colTF);
        controlPanel.add(new JLabel("Valor:"));
        controlPanel.add(_valTF);
        controlPanel.add(moveBtn);

        //... Add listener
        moveBtn.addActionListener(new MoveListener());

        // 2... Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        // 3... Add the components to the content panel.
        content.add(controlPanel, BorderLayout.NORTH);
        content.add(view, BorderLayout.CENTER);

        // 4... Set this window's attributes, and pack it.
        setContentPane(content);
        setTitle("Sudoku Version 0.1");
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
                int row = Integer.parseInt(_rowTF.getText().trim()) - 1;
                int col = Integer.parseInt(_colTF.getText().trim()) - 1;
                int val = Integer.parseInt(_valTF.getText().trim());
                if (model.isValid(row, col, val)) {
                    model.setValue(row, col, val);
                    view.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Valor Invalido: fila, col o valor.");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Por valor entre un valor numerico.");
            }
        }
    }
}
