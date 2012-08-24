/*
 * Aplicacion de cifrado/descifrado
 * con el algoritmo RC4
 */
package rc4;

/**
 *
 * @author ThElFlacox
 */
public class Frame extends javax.swing.JFrame {

    private Rc4 cifrador;
    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        t_clave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_msj = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_cifrado = new javax.swing.JTextArea();
        lCen = new javax.swing.JLabel();
        lIzq = new javax.swing.JLabel();
        lDer = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        t_plano = new javax.swing.JRadioButton();
        t_hexa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cifra4");
        setBackground(new java.awt.Color(50, 50, 50));
        setBounds(new java.awt.Rectangle(20, 50, 800, 600));

        t_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_claveActionPerformed(evt);
            }
        });
        t_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_claveKeyTyped(evt);
            }
        });

        t_msj.setColumns(20);
        t_msj.setRows(5);
        t_msj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_msjKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(t_msj);

        t_cifrado.setEditable(false);
        t_cifrado.setColumns(20);
        t_cifrado.setRows(5);
        jScrollPane2.setViewportView(t_cifrado);

        lCen.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lCen.setText("Clave");

        lIzq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lIzq.setText("Mensaje");

        lDer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lDer.setText("Mensaje cifrado");

        boton.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        boton.setText("Cifrar");
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
        });
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        buttonGroup1.add(t_plano);
        t_plano.setSelected(true);
        t_plano.setText("Cifrar");
        t_plano.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t_planoItemStateChanged(evt);
            }
        });
        t_plano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_planoActionPerformed(evt);
            }
        });

        buttonGroup1.add(t_hexa);
        t_hexa.setText("Descifrar");
        t_hexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_hexaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_clave, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lCen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(lDer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(t_plano)
                .addGap(71, 71, 71)
                .addComponent(t_hexa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lCen)
                                .addComponent(lIzq)
                                .addComponent(lDer))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(t_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_plano)
                    .addComponent(t_hexa))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_claveActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        
    }//GEN-LAST:event_botonActionPerformed

    private void t_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_claveKeyTyped
        if(t_clave.getText().length() > 32){
            evt.consume();
        }
    }//GEN-LAST:event_t_claveKeyTyped

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
        if(t_clave.getText().length() == 0 || t_msj.getText().length() == 0){
            evt.consume();
        }else{
            String clave = t_clave.getText();
            String mensaje = t_msj.getText();
            String cifrado = "";
            String res;
            String cero = "0"; 
            cifrador = new Rc4(clave);
            cifrador.ksa();
            
            if(t_plano.isSelected()){
                for(int v=0;v<mensaje.length();v++){
                    int r = mensaje.charAt(v) ^ cifrador.prga();
                    res = Integer.toHexString(r);
                    if(res.length()<2){
                        res = cero.concat(res);
                    }
                    cifrado = cifrado.concat(res);
                }
            }else{
                cifrado = cifrador.decode(mensaje);
            }
            
            t_cifrado.setText(cifrado);
        }
    }//GEN-LAST:event_botonMouseClicked

    private void t_planoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_planoActionPerformed
        if(t_plano.isSelected()){
            lIzq.setText("Mensaje");
            lIzq.repaint();
            lDer.setText("Mensaje cifrado");
            lDer.repaint();
            boton.setText("Cifrar");
            boton.repaint();
            t_cifrado.setText(null);
            t_cifrado.repaint();
        }
    }//GEN-LAST:event_t_planoActionPerformed

    private void t_hexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_hexaActionPerformed
        if(t_hexa.isSelected()){
            lIzq.setText("Mensaje cifrado");
            lIzq.repaint();
            lDer.setText("Mensaje original");
            lDer.repaint();
            boton.setText("Descifrar");
            boton.repaint();
            t_cifrado.setText(null);
            t_cifrado.repaint();
        }
    }//GEN-LAST:event_t_hexaActionPerformed

    private void t_planoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t_planoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_t_planoItemStateChanged

    private void t_msjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_msjKeyTyped
        if(t_msj.getText().length() > 255){
            evt.consume();
        }
    }//GEN-LAST:event_t_msjKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lCen;
    private javax.swing.JLabel lDer;
    private javax.swing.JLabel lIzq;
    private javax.swing.JTextArea t_cifrado;
    private javax.swing.JTextField t_clave;
    private javax.swing.JRadioButton t_hexa;
    private javax.swing.JTextArea t_msj;
    private javax.swing.JRadioButton t_plano;
    // End of variables declaration//GEN-END:variables
}
