
public class ventana1 extends javax.swing.JFrame {


    public ventana1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 245, 246));

        Inicio.setBackground(new java.awt.Color(252, 219, 167));

        jLabel1.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 116, 197));
        jLabel1.setText("C");

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 236, 84));
        jLabel2.setText("O");

        jLabel3.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(226, 111, 111));
        jLabel3.setText("N");

        jLabel4.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(56, 159, 163));
        jLabel4.setText("E");

        jLabel5.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 116, 197));
        jLabel5.setText("C");

        jLabel6.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(206, 57, 57));
        jLabel6.setText("T");

        jLabel7.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(182, 54, 184));
        jLabel7.setText("A");

        jLabel8.setFont(new java.awt.Font("Lobster Two", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 196, 180));
        jLabel8.setText("4");

        comenzar.setBackground(new java.awt.Color(171, 213, 219));
        comenzar.setFont(new java.awt.Font("Ubuntu Mono", 2, 24)); // NOI18N
        comenzar.setText("COMENZAR");
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comenzar)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(84, 84, 84)
                .addComponent(comenzar)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed

        ventana2 ventana2 = new ventana2();//carga las imágenes
        this.setVisible(false);
        ventana2.setVisible(true);//la muestra
    }//GEN-LAST:event_comenzarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton comenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
