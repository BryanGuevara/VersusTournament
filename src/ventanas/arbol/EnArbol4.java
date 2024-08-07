/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas.arbol;

import clases.Ganadores;
import clases.Participante;
import clases.Participantes;
import java.awt.Color;
import java.awt.Image;
import java.util.Collections;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ventanas.Inicio;
import javax.swing.JTextField;

/**
 *
 * @author MINEDUCYT
 */
public class EnArbol4 extends javax.swing.JFrame {

    DefaultTableModel participantes;
    Ganadores ganador = new Ganadores();

    public EnArbol4() {
        initComponents();
        this.setLocationRelativeTo(null);

        participantes = new DefaultTableModel();
        participantes.addColumn("Participante");
        TableParticipantes.setModel(participantes);

        ImageIcon wallpaper = new ImageIcon("src/img/Wallpaper2.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(LabelWallpaper.getWidth(),
                LabelWallpaper.getHeight(), Image.SCALE_DEFAULT));
        LabelWallpaper.setIcon(icon);

        Final.setVisible(false);

        cargarParticipantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableParticipantes = new javax.swing.JTable();
        Nombre2 = new javax.swing.JTextField();
        Nombre1 = new javax.swing.JTextField();
        Nombre3 = new javax.swing.JTextField();
        Nombre4 = new javax.swing.JTextField();
        Nombre5 = new javax.swing.JTextField();
        Nombre6 = new javax.swing.JTextField();
        Punto1 = new javax.swing.JTextField();
        Punto2 = new javax.swing.JTextField();
        Punto3 = new javax.swing.JTextField();
        Punto4 = new javax.swing.JTextField();
        Punto5 = new javax.swing.JTextField();
        Punto6 = new javax.swing.JTextField();
        Ganador = new javax.swing.JTextField();
        SemiFinal = new javax.swing.JButton();
        Final = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Reset1 = new javax.swing.JButton();
        LabelWallpaper = new javax.swing.JLabel();
        GanadorPunto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableParticipantes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 100));

        Nombre2.setEditable(false);
        Nombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(0, 0, 0));
        Nombre2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nombre2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, 30));

        Nombre1.setEditable(false);
        Nombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(0, 0, 0));
        Nombre1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nombre1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 90, 30));

        Nombre3.setEditable(false);
        Nombre3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre3.setForeground(new java.awt.Color(0, 0, 0));
        Nombre3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nombre3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 90, 30));

        Nombre4.setEditable(false);
        Nombre4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre4.setForeground(new java.awt.Color(0, 0, 0));
        Nombre4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nombre4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 30));

        Nombre5.setEditable(false);
        Nombre5.setBackground(new java.awt.Color(56, 56, 56));
        Nombre5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre5.setForeground(new java.awt.Color(0, 0, 0));
        Nombre5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nombre5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, 30));

        Nombre6.setEditable(false);
        Nombre6.setBackground(new java.awt.Color(56, 56, 56));
        Nombre6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nombre6.setForeground(new java.awt.Color(0, 0, 0));
        Nombre6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nombre6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 90, 30));

        Punto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Punto1.setForeground(new java.awt.Color(0, 0, 0));
        Punto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Punto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));

        Punto2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Punto2.setForeground(new java.awt.Color(0, 0, 0));
        Punto2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Punto2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Punto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 30, 30));

        Punto3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Punto3.setForeground(new java.awt.Color(0, 0, 0));
        Punto3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Punto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Punto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 30, 30));

        Punto4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Punto4.setForeground(new java.awt.Color(0, 0, 0));
        Punto4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Punto4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Punto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 30, 30));

        Punto5.setEditable(false);
        Punto5.setBackground(new java.awt.Color(56, 56, 56));
        Punto5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Punto5.setForeground(new java.awt.Color(0, 0, 0));
        Punto5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Punto5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Punto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 30, 30));

        Punto6.setEditable(false);
        Punto6.setBackground(new java.awt.Color(56, 56, 56));
        Punto6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Punto6.setForeground(new java.awt.Color(0, 0, 0));
        Punto6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Punto6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Punto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 30, 30));

        Ganador.setEditable(false);
        Ganador.setBackground(new java.awt.Color(56, 56, 56));
        Ganador.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Ganador.setForeground(new java.awt.Color(255, 255, 255));
        Ganador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ganador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, 60));

        SemiFinal.setBackground(new java.awt.Color(56, 56, 56));
        SemiFinal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SemiFinal.setForeground(new java.awt.Color(255, 255, 255));
        SemiFinal.setText("SemiFinal");
        SemiFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SemiFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemiFinalActionPerformed(evt);
            }
        });
        getContentPane().add(SemiFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 210, 70));

        Final.setBackground(new java.awt.Color(56, 56, 56));
        Final.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Final.setForeground(new java.awt.Color(255, 255, 255));
        Final.setText("Final");
        Final.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalActionPerformed(evt);
            }
        });
        getContentPane().add(Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 210, 70));

        Reset.setBackground(new java.awt.Color(56, 56, 56));
        Reset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Nuevo");
        Reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 110, 70));

        Reset1.setBackground(new java.awt.Color(56, 56, 56));
        Reset1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Reset1.setForeground(new java.awt.Color(255, 255, 255));
        Reset1.setText("Otro Torneo");
        Reset1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(Reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 100, 70));

        LabelWallpaper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 300));

        GanadorPunto.setEditable(false);
        GanadorPunto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        GanadorPunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(GanadorPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SemiFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemiFinalActionPerformed
        JTextField[] nombres = {Nombre1, Nombre2, Nombre3, Nombre4};
        JTextField[] puntos = {Punto1, Punto2, Punto3, Punto4};
        JTextField[] resultadoNombres = {Nombre5, Nombre6};
        JTextField[] resultadoPuntos = {Punto5, Punto6};

        String Resultado = ganador.Calculos(nombres, puntos, resultadoNombres, resultadoPuntos);

        if (Resultado.equals("")) {
            JOptionPane.showMessageDialog(null, "Bienvenidos a la final, que sera entre los participantes\n" + Nombre5.getText() + " VS " + Nombre6.getText());
            SemiFinal.setVisible(false);
            Final.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, Resultado);
        }
    }//GEN-LAST:event_SemiFinalActionPerformed

    private void FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalActionPerformed
        JTextField[] nombres = {Nombre5, Nombre6};
        JTextField[] puntos = {Punto5, Punto6};
        JTextField[] resultadoNombres = {Ganador};
        JTextField[] resultadoPuntos = {GanadorPunto};

        String Resultado = ganador.Calculos(nombres, puntos, resultadoNombres, resultadoPuntos);

        Ganador.setBackground(new Color(56, 56, 56));

        if (Resultado.equals("")) {
            JOptionPane.showMessageDialog(null, "Felicidades a Gandor del Torneo " + Ganador.getText());
            Final.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, Resultado);
        }
    }//GEN-LAST:event_FinalActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ResetActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        new EnArbol4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Reset1ActionPerformed

    private void cargarParticipantes() {
        int x = 1;
        List<Participante> data = Participantes.getParticipantes();
        for (Participante p : data) {
            participantes.addRow(new Object[]{p.getNombre()});
        }
        Collections.shuffle(data);

        for (Participante p : data) {
            switch (x) {
                case 1 ->
                    Nombre1.setText(p.getNombre());
                case 2 ->
                    Nombre2.setText(p.getNombre());
                case 3 ->
                    Nombre3.setText(p.getNombre());
                case 4 ->
                    Nombre4.setText(p.getNombre());
                default -> {
                }
            }
            x++;
        }
        if (Nombre4.getText().isEmpty()) {
            Nombre4.setText("(No hay)");
            Punto3.setEditable(false);
            Punto4.setEditable(false);
            Punto3.setText("0");
            Punto4.setText("0");
        }
    }

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
            java.util.logging.Logger.getLogger(EnArbol4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnArbol4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnArbol4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnArbol4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnArbol4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Final;
    private javax.swing.JTextField Ganador;
    private javax.swing.JTextField GanadorPunto;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JTextField Nombre3;
    private javax.swing.JTextField Nombre4;
    private javax.swing.JTextField Nombre5;
    private javax.swing.JTextField Nombre6;
    private javax.swing.JTextField Punto1;
    private javax.swing.JTextField Punto2;
    private javax.swing.JTextField Punto3;
    private javax.swing.JTextField Punto4;
    private javax.swing.JTextField Punto5;
    private javax.swing.JTextField Punto6;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Reset1;
    private javax.swing.JButton SemiFinal;
    private javax.swing.JTable TableParticipantes;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
