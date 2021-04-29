
package proyecto_calculo2;
// @author MRobot404

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.processing.FilerException;
import javax.swing.JOptionPane;
import static proyecto_calculo2.NewMain.players;


public class NuevaPartida extends javax.swing.JFrame {
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        Avanzar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        NombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreFieldKeyReleased(evt);
            }
        });

        Avanzar.setText("Ingresar");
        Avanzar.setToolTipText("");
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        jMenu1.setText("Regresar");
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
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Avanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(Avanzar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public NuevaPartida() {
        initComponents();
        setLocationRelativeTo(null);
        Avanzar.setEnabled(true);
        ImportarCSV();
    }
    
    
    public static void ExportarCSV(ArrayList<Jugadores> players) {
        String salidaArchivo = "Jugadores.csv";
        boolean existe = new File(salidaArchivo).exists();
        if (existe) {
            File archivoUsuarios = new File(salidaArchivo);
            archivoUsuarios.delete();
        }

        try {
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            salidaCSV.write("ID");
            salidaCSV.write("Nivel");
            salidaCSV.write("Nombre");
            salidaCSV.write("Vidas");
            salidaCSV.endRecord();

            for (Jugadores j : NewMain.players) {
                salidaCSV.write(String.valueOf(j.getID()));
                salidaCSV.write(String.valueOf(j.getNivel()));
                salidaCSV.write(j.getNombre());
                salidaCSV.write(String.valueOf(j.getVidas()));
                salidaCSV.endRecord();
            }
            salidaCSV.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void ImportarCSV() {

        try {
            CsvReader leerUsuario = new CsvReader("Jugadores.csv");
            leerUsuario.readHeaders();
            while (leerUsuario.readRecord()) {
                int id = Integer.parseInt(leerUsuario.get(0));
                int niveles = Integer.parseInt(leerUsuario.get(1));
                String nombres = leerUsuario.get(2);
                int vida = Integer.parseInt(leerUsuario.get(3));
                NewMain.players.add(new Jugadores(nombres, id, niveles, vida));
            }
            leerUsuario.close();

            for (Jugadores e : NewMain.players) {
                System.out.println(e.getID() + " " + e.getNombre() + " " + e.getNivel() + " " + e.getVidas());
            }

        } catch (FilerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Validar() {
        if (NombreField.getText().isEmpty()) {
            Avanzar.setEnabled(false);
        } else {
            Avanzar.setEnabled(true);
        }
    }
    
    
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        int msj = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea salir?");
        if (msj == JOptionPane.YES_OPTION) {

            Main ver = new Main();
            ver.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void NombreFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreFieldKeyReleased
        Validar();
    }//GEN-LAST:event_NombreFieldKeyReleased

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        String nombre = NombreField.getText();
        boolean ingresado = false;
        for (Jugadores j : NewMain.players) {
            if (j.getNombre().equals(nombre)) {
                ingresado = true;
                break;
            }
        }
        if (ingresado == true) {
            JOptionPane.showMessageDialog(rootPane, "Elija otro nombre de usuario");
        } else {

            int id = (NewMain.players.size());
            int nivel = 0;
            String name = nombre;
            int vidas = (10);
            NewMain.players.add(new Jugadores(name, id, nivel, vidas));
            JOptionPane.showMessageDialog(this, "Datos cargados exitosamente, bienvenido");
            NombreField.setText("");
            ExportarCSV(players);
            Nivel1 ver = new Nivel1();
            ver.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_AvanzarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avanzar;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
