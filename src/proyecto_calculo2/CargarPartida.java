package proyecto_calculo2;

import javax.swing.JOptionPane;

/**
 *
 * @author MRobot404
 */
public class CargarPartida extends javax.swing.JFrame {

    public static int nivelo;

    /**
     * Creates new form CargarPartida
     */
    public CargarPartida() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AvanzarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Escribe tu nombre:");

        AvanzarButton.setText("Avanzar");
        AvanzarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AvanzarButton)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(AvanzarButton)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        int msj = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea salir?");
        if (msj == JOptionPane.YES_OPTION) {

            Main ver = new Main();
            ver.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void AvanzarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarButtonActionPerformed

        String nombre = NombreField.getText();
        boolean ingresado = false;
        for (Jugadores j : NewMain.players) {
            if (j.getNombre().equals(nombre)) {

                nivelo = j.getNivel();

                ingresado = true;

                break;

            }

        }

        if (ingresado == true) {
            switch (nivelo) {
                 case 0:
                    Nivel1 ver = new Nivel1();
                    ver.setVisible(true);
                    this.dispose();
                    break;
                case 1:
                    Nivel1 ver2 = new Nivel1();
                    ver2.setVisible(true);
                    this.dispose();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado");
        }
    }//GEN-LAST:event_AvanzarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvanzarButton;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
