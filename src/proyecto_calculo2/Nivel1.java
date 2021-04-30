package proyecto_calculo2;

import javax.swing.Icon;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Nivel1 extends javax.swing.JFrame {

    private Jugadores modificar;
    public static int vidas;
    public static boolean ganar;
    public static int id;
    public static String nombre;
    public static int nivel;

    public Nivel1() {
        initComponents();
        setLocationRelativeTo(null);
        vidas();

    }

    public void vidas() {
        for (Jugadores j : NewMain.players) {
            vidas = j.getVidas();
            jLabel2.setText(String.valueOf(vidas));
        }

    }

    public void vidasmomentaneas() {
        jLabel2.setText(String.valueOf(vidas));
    }

    public void perderVidas() {
        if (ganar == false) {
            vidas = vidas - 1;
            System.out.println(vidas);
            ganar = true;
        } else {
            ganar = true;
        }

        if (vidas == 0) {
            JOptionPane.showMessageDialog(rootPane, "Game over");
            eliminarpartida();
        }

    }

    public void obtenerNombre() {
        for (Jugadores j : NewMain.players) {
            nombre = j.getNombre();
        }
    }

    public void eliminarpartida() {

        int i = -1;
        for (int j = 0; j < NewMain.players.size(); j++) {
            if (NewMain.players.get(j).getNombre().equals(nombre)) {
                i = j;
                break;
            }

        }
        if (i >= 0) {
            NewMain.players.remove(i);
            JOptionPane.showMessageDialog(this, "Jugador eliminado exitosamente");
            NuevaPartida.ExportarCSV(NewMain.players);
            int msj = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea salir?");
            if (msj == JOptionPane.YES_OPTION) {

                NuevaPartida ver = new NuevaPartida();
                ver.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, " no encontrado");
        }

    }

    public void BuscarDatos() {
        modificar = null;
        for (Jugadores v : NewMain.players) {
            if (v.getNombre().equals(nombre)) {
                modificar = v;
                break;
            }

        }

        if (modificar != null) {
            id = modificar.getID();
            nombre = modificar.getNombre();
            nivel = modificar.getNivel();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Vendedor no encontrado");
        }
    }

    public void ModificarDatos() {
        if (modificar != null) {
            modificar.setNombre(nombre);
            modificar.setID(id);
            modificar.setNivel(nivel + 1);

            modificar.setVidas(vidas);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe buscar un producto por nombre");
        }
    }

    public void ModificarVidas() {
        if (modificar != null) {
            modificar.setNombre(nombre);
            modificar.setID(id);
            modificar.setNivel(nivel);

            modificar.setVidas(vidas);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe buscar un producto por nombre");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Vidas:");

        jLabel2.setFont(new java.awt.Font("Mortal Kombat 4", 0, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Problema1.PNG"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Psolucion2.PNG"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Psolucion1.PNG"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P1solucion3.PNG"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(118, 118, 118)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ganar = false;
        perderVidas();
        vidasmomentaneas();
        ganar = true;

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ganar = false;
        perderVidas();
        vidasmomentaneas();
        ganar = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        obtenerNombre();
        JOptionPane.showMessageDialog(rootPane, nombre + " Wins");
        BuscarDatos();
        ModificarDatos();
        NuevaPartida.ExportarCSV(NewMain.players);
         Nivel2 ver=new Nivel2();
            ver.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        int msj = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea dejar de jugar :( ?");
        if (msj == JOptionPane.YES_OPTION) {
            obtenerNombre();
            BuscarDatos();
            ModificarVidas();
            NuevaPartida.ExportarCSV(NewMain.players);
            this.dispose();
           
        }
    }//GEN-LAST:event_jMenu1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
