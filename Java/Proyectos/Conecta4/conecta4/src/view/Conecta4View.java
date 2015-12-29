
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import model.Tablero;



/**
 * @author carolinajimenez26
 */
public class Conecta4View {
    private static final int CELL_PIXELS = 50;  // Tamaño de cada celda
    private static final int PUZZLE_SIZE_ROW = 6;   // Numero de filas
    private static final int PUZZLE_SIZE_COL = 7;   // Numero de columnas
    private static final int BOARD_PIXELS = CELL_PIXELS * PUZZLE_SIZE_COL;
    private static final int TEXT_OFFSET = 15;  // Ubicacion especial del texto
    private static final Font TEXT_FONT = new Font("Sansserif", Font.BOLD, 24);

    private Tablero modelTablero;                  // Revisar en constructor

    public Conecta4View(Tablero modelTablero) {
        this.modelTablero = modelTablero;

        //setPreferredSize(new Dimension(BOARD_PIXELS + 2, BOARD_PIXELS + 2));
        //setBackground(Color.WHITE);
    }

    //@Override
    public void paintComponent(Graphics g) {
        // Dibujar fondo pantalla
        //g.setColor(getBackground());
        //g.fillRect(0, 0, getWidth(), getHeight());
        //g.setColor(Color.BLACK);

        drawGridLines(g);
        drawCellValues(g);

    }

    // Dibujamos Rectangulos
    private void drawGridLines(Graphics g) {
        // Dibuja  lineas. 
        for (int i = 0; i <= PUZZLE_SIZE_ROW; i++) {
            int acrossOrDown = i * CELL_PIXELS;
            g.drawLine(acrossOrDown, 0, acrossOrDown, BOARD_PIXELS);
            g.drawLine(0, acrossOrDown, BOARD_PIXELS, acrossOrDown);

                acrossOrDown++;
                g.drawLine(acrossOrDown, 0, acrossOrDown, BOARD_PIXELS);
                g.drawLine(0, acrossOrDown, BOARD_PIXELS, acrossOrDown);
            
        }
    }

    // Colocamos los valores
    private void drawCellValues(Graphics g) {
        g.setFont(TEXT_FONT);
        for (int i = 0; i < PUZZLE_SIZE_ROW; i++) {
            int yDisplacement = (i + 1) * CELL_PIXELS - TEXT_OFFSET;
            for (int j = 0; j < PUZZLE_SIZE_COL; j++) {
                
                    int xDisplacement = j * CELL_PIXELS + TEXT_OFFSET;
                    g.drawString("" + modelTablero.Color(), xDisplacement, yDisplacement);
               
            }
        }
    }

    public void repaint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
