
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

        jLabel1 = new javax.swing.JLabel();
        Partida_Nueva = new javax.swing.JButton();
        Cargar_Partida = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 306, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargar_Partida)
                    .addComponent(Partida_Nueva))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(Partida_Nueva)
                .addGap(54, 54, 54)
                .addComponent(Cargar_Partida)
                .addContainerGap(49, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar_Partida;
    private javax.swing.JButton Partida_Nueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
