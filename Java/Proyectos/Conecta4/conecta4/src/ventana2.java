
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.shape.Ellipse;
import javax.swing.ImageIcon;


/**
 *
 * @author karen
 */
public class ventana2 extends javax.swing.JFrame {
    
    private  Tablero T=new Tablero();
    private  MiniMax minimax=new MiniMax();
    private ganaOpierde ventana;
    
    public ventana2() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Juego = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        columnaIngresada = new javax.swing.JTextField();
        Mover = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        iconos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Juego.setBackground(new java.awt.Color(252, 219, 167));
        Juego.setMinimumSize(new java.awt.Dimension(500, 500));
        Juego.setPreferredSize(new java.awt.Dimension(702, 440));

        jLabel1.setText("Ingrese la columna: ");

        columnaIngresada.setText("# de columna");
        columnaIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnaIngresadaActionPerformed(evt);
            }
        });

        Mover.setText("Mover");
        Mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(171, 213, 219));
        salir.setFont(new java.awt.Font("Ubuntu Mono", 2, 24)); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        iconos.setBackground(new java.awt.Color(231, 142, 168));
        iconos.setForeground(new java.awt.Color(127, 171, 199));
        iconos.setMinimumSize(new java.awt.Dimension(240, 280));

        javax.swing.GroupLayout iconosLayout = new javax.swing.GroupLayout(iconos);
        iconos.setLayout(iconosLayout);
        iconosLayout.setHorizontalGroup(
            iconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        iconosLayout.setVerticalGroup(
            iconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JuegoLayout = new javax.swing.GroupLayout(Juego);
        Juego.setLayout(JuegoLayout);
        JuegoLayout.setHorizontalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JuegoLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JuegoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(columnaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mover)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(iconos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(JuegoLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JuegoLayout.setVerticalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JuegoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(columnaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(iconos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(salir)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 public class Imagen extends javax.swing.JPanel {
 
 int x,y;
 ImageIcon img;
public Imagen(int x,int y,ImageIcon img) {
this.setSize(280, 240); //se selecciona el tamaño del panel
this.x=x;
this.y=y;
this.img=img;

}
 
//Se crea un método cuyo parámetro debe ser un objeto Graphics
 
public void paint(Graphics grafico) {
      
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
 
grafico.drawImage(img.getImage(), x*40, y*40,img.getIconWidth(),img.getIconHeight(), null);
 
setOpaque(false);
super.paintComponent(grafico);
}
}  
    
    
    private void MoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverActionPerformed
        
        ImageIcon imagen1= new ImageIcon("circulo-amarillo.png");
        ImageIcon imagen2= new ImageIcon("circulo-azul.png");
        
        
        
            int col=Integer.parseInt(columnaIngresada.getText());
            T.CambiarColor(1);//escoge el color de juego 1-->amarillo
            T.Pinta(col);//juega
                        
            Imagen Imagen1 = new Imagen(T.Columna(),T.Fila(),imagen1); 
            iconos.add(Imagen1);
            
            if(T.Finish()){
                
                ventana=new ganaOpierde(1);
                iconos.removeAll();
                this.setVisible(false);
            }
     
            T.CambiarColor(2);
            int r=minimax.minimax(T);
            if(r !=-1) T.Pinta(r);
            
            Imagen Imagen2 = new Imagen(T.Columna(),T.Fila(),imagen2);
            iconos.add(Imagen2);
            
            iconos.repaint();
            
            iconos.add(Imagen1);
            
            if(T.Finish()){
                
                ventana=new ganaOpierde(2);
                iconos.removeAll();
                this.setVisible(false);
            }
                        
        
    }//GEN-LAST:event_MoverActionPerformed

    
    class Figuras extends JPanel{
        
        public void Figuras(Graphics g){
                        
            Graphics2D g2=(Graphics2D) g;
            
            ImageIcon imagen1= new ImageIcon("circulo-amarillo.png");
            
            //Rectangle2D rectangulo=new Rectangle2D.Double(0,0,80,80);
            
            g2.drawImage(imagen1.getImage(), 0, 0,imagen1.getIconWidth(),imagen1.getIconHeight(), null);
            
           // Ellipse2D elipse= new Ellipse2D.Double();
            
            //g2.draw(elipse);
            
            setOpaque(false);
            super.paintComponents(g);
        }
        
        
    }
    
    
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        this.setVisible(false); 
        
    }//GEN-LAST:event_salirActionPerformed

    private void columnaIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnaIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnaIngresadaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Juego;
    private javax.swing.JButton Mover;
    private javax.swing.JTextField columnaIngresada;
    private javax.swing.JPanel iconos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
