
package desings;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Principal extends javax.swing.JFrame {

    static Principal prin=new Principal();
    public Principal() {
        initComponents();
        resetColor(panelPilas);
        resetColor(panelColas);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/desings/images/icons8_Code_100px.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelPilas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pilasTXT = new javax.swing.JLabel();
        panelColas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        colasTXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(41, 204, 134));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desings/images/icons8_Code_100px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡Bienvenido/a!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 120));

        panelPilas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPilas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPilasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPilasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPilasMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desings/images/icons8_Stack_50px.png"))); // NOI18N

        pilasTXT.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        pilasTXT.setForeground(new java.awt.Color(41, 204, 134));
        pilasTXT.setText("Pilas");

        javax.swing.GroupLayout panelPilasLayout = new javax.swing.GroupLayout(panelPilas);
        panelPilas.setLayout(panelPilasLayout);
        panelPilasLayout.setHorizontalGroup(
            panelPilasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelPilasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilasTXT)
                    .addComponent(jLabel4))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelPilasLayout.setVerticalGroup(
            panelPilasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pilasTXT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelPilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 110, 100));

        panelColas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelColas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelColasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelColasMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desings/images/icons8_Conference_50px_2.png"))); // NOI18N

        colasTXT.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        colasTXT.setForeground(new java.awt.Color(41, 204, 134));
        colasTXT.setText("Colas");

        javax.swing.GroupLayout panelColasLayout = new javax.swing.GroupLayout(panelColas);
        panelColas.setLayout(panelColasLayout);
        panelColasLayout.setHorizontalGroup(
            panelColasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelColasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colasTXT)
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelColasLayout.setVerticalGroup(
            panelColasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colasTXT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelColas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 110, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelPilasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPilasMouseEntered
        setColor(panelPilas);
        setTextColor(pilasTXT);
    }//GEN-LAST:event_panelPilasMouseEntered

    private void panelPilasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPilasMouseExited
       resetColor(panelPilas);
       resetText(pilasTXT);
    }//GEN-LAST:event_panelPilasMouseExited

    private void panelColasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelColasMouseEntered
        setColor(panelColas);
        setTextColor(colasTXT);
    }//GEN-LAST:event_panelColasMouseEntered

    private void panelColasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelColasMouseExited
        resetColor(panelColas);
        resetText(colasTXT);
    }//GEN-LAST:event_panelColasMouseExited

    private void panelPilasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPilasMouseClicked
        DesingPilas pila=new DesingPilas();
        pila.setVisible(true);
        prin.dispose();
    }//GEN-LAST:event_panelPilasMouseClicked

    
    public void setColor(JPanel pane){
      pane.setBackground(new java.awt.Color(41,204,134));
    }
    
    public void setTextColor(JLabel x){
        x.setForeground(Color.white);
    }
    
    public void resetColor(JPanel pane){
      pane.setBackground(new java.awt.Color(240,240,240));
    }
    
    public void resetText(JLabel x){
        x.setForeground(new java.awt.Color(41,204,134));
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                prin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colasTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelColas;
    private javax.swing.JPanel panelPilas;
    private javax.swing.JLabel pilasTXT;
    // End of variables declaration//GEN-END:variables
}
