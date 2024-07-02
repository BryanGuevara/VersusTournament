/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import ventanas.arbol.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import javax.swing.JOptionPane;
import ventanas.arbol.EnArbol4;

/**
 *
 * @author MINEDUCYT
 */
public class Inicio extends javax.swing.JFrame {

    DefaultTableModel participantes;
    int x = 1;

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);

        participantes = new DefaultTableModel();
        participantes.addColumn("ID / Participante");
        TableParticipantes.setModel(participantes);

        try {
            Participantes.eliminarTodos();
            actualizarTablaParticipantes();
        } catch (NumberFormatException ex) {
            System.err.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableParticipantes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TxtId = new javax.swing.JTextField();
        TxtParticipante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableParticipantes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 340));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 40));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 40));
        getContentPane().add(TxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 40));

        TxtParticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtParticipanteKeyReleased(evt);
            }
        });
        getContentPane().add(TxtParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, 40));

        jLabel1.setText("ID a Eliminar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, -1));

        jLabel2.setText("Nombre del Participante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 140, -1));

        jButton3.setText("En Arbol");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 180, 50));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = TxtParticipante.getText();
        if (!nombre.isEmpty()) {
            Participante p = new Participante(x++, nombre);
            Participantes.añadirParticipante(p);
            actualizarTablaParticipantes();
            TxtParticipante.setText("");
        }
        actualizarTablaParticipantes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int id = Integer.parseInt(TxtId.getText());
            Participantes.eliminarParticipantePorId(id);
            actualizarTablaParticipantes();
            TxtId.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID inválido");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int tamaño = participantes.getRowCount();

        if (tamaño <= 2) {
            JOptionPane.showMessageDialog(null, "Necesitas almenos 3 para que cuente como torneo");
        } else if (tamaño <= 4) {
            new EnArbol4().setVisible(true);
            this.dispose();
        } else if (tamaño <= 6) {
            new EnArbol6().setVisible(true);
            this.dispose();
        } else if (tamaño <= 8) {
            new EnArbol8().setVisible(true);
            this.dispose();
        } else if (tamaño <= 12) {
            new EnArbol12().setVisible(true);
            this.dispose();
        } else if (tamaño <= 14) {
            new EnArbol14().setVisible(true);
            this.dispose();
        } else if (tamaño <= 16) {
            new EnArbol16().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TxtParticipanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtParticipanteKeyReleased
        if (TxtParticipante.getText().length() == 13) {
            JOptionPane.showMessageDialog(null, "El nombre no puede superar los 12 caracteres");
            TxtParticipante.setText("");
        }

        String test = TxtParticipante.getText();

        if (test.equals("Test16")) {
            JOptionPane.showMessageDialog(null, "Prueba 16 activada");
            Participante p = new Participante(x++, "Luigi");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Mario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kirby");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Samus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Cap. Falcon");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kid Ikarus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Wario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "DK");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Bowser");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Peach");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Toad");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Falco");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Fox");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Link");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Sonic");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Dedede");
            Participantes.añadirParticipante(p);
            TxtParticipante.setText("");
            actualizarTablaParticipantes();
        }

        
        if (test.equals("Test14")) {
            JOptionPane.showMessageDialog(null, "Prueba 14 activada");
            Participante p = new Participante(x++, "Luigi");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Mario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kirby");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Samus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Cap. Falcon");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kid Ikarus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Wario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "DK");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Bowser");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Peach");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Toad");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Falco");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Fox");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Link");
            Participantes.añadirParticipante(p);
            TxtParticipante.setText("");
            actualizarTablaParticipantes();
        }
        
        if (test.equals("Test12")) {
            JOptionPane.showMessageDialog(null, "Prueba 12 activada");
            Participante p = new Participante(x++, "Luigi");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Mario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kirby");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Samus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Cap. Falcon");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kid Ikarus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Wario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "DK");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Bowser");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Peach");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Toad");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Falco");
            Participantes.añadirParticipante(p);
            TxtParticipante.setText("");
            actualizarTablaParticipantes();
        }
        
        if (test.equals("Test6")) {
            JOptionPane.showMessageDialog(null, "Prueba 6 activada");
            Participante p = new Participante(x++, "Luigi");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Mario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kirby");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Samus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Cap. Falcon");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kid Ikarus");
            Participantes.añadirParticipante(p);
            TxtParticipante.setText("");
            actualizarTablaParticipantes();
        }
        if (test.equals("Test8")) {
            JOptionPane.showMessageDialog(null, "Prueba 8 activada");
            Participante p = new Participante(x++, "Luigi");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Mario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kirby");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Samus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Cap. Falcon");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kid Ikarus");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Wario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "DK");
            Participantes.añadirParticipante(p);
            TxtParticipante.setText("");
            actualizarTablaParticipantes();
        }
        if (test.equals("Test4")) {
            JOptionPane.showMessageDialog(null, "Prueba 4 activada");
            Participante p = new Participante(x++, "Luigi");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Mario");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Kirby");
            Participantes.añadirParticipante(p);
            p = new Participante(x++, "Samus");
            Participantes.añadirParticipante(p);
            TxtParticipante.setText("");
            actualizarTablaParticipantes();
        }
    }//GEN-LAST:event_TxtParticipanteKeyReleased

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
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private void actualizarTablaParticipantes() {
        participantes.setRowCount(0);
        for (Participante p : Participantes.getParticipantes()) {
            participantes.addRow(new Object[]{p.getId() + " - " + p.getNombre()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JTable TableParticipantes;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtParticipante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
