
package proyecto_calculo2;
// @author MRobot404

import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {
   public Main() {
        initComponents();
        setLocationRelativeTo(null);
        NuevaPartida.ImportarCSV();
    }

    @SuppressWarnings("unchecked")
  
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        //Botón Salir
        int msj = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea salir?");
        if (msj == JOptionPane.YES_OPTION) {
            this.dispose();
        }


    }                                   

  
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        Partida_Nueva = new javax.swing.JButton();
        Cargar_Partida = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Partida_Nueva.setText("Nueva partida");
        Partida_Nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Partida_NuevaActionPerformed(evt);
            }
        });

        Cargar_Partida.setText("Cargar partida");
        Cargar_Partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_PartidaActionPerformed(evt);
            }
        });

        jMenu3.setText("Salir ");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargar_Partida)
                    .addComponent(Partida_Nueva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Partida_Nueva)
                        .addGap(54, 54, 54)
                        .addComponent(Cargar_Partida)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cargar_PartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_PartidaActionPerformed
        // TODO add your handling code here:
        CargarPartida ver = new CargarPartida();
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cargar_PartidaActionPerformed

    private void Partida_NuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Partida_NuevaActionPerformed
        // TODO add your handling code here:
         NuevaPartida ver = new NuevaPartida();
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Partida_NuevaActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        //Botón Salir
        int msj = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea salir?");
        if (msj == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_jMenu3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar_Partida;
    private javax.swing.JButton Partida_Nueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
