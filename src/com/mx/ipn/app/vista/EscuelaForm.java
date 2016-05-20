package com.mx.ipn.app.vista;

import com.mx.ipn.app.controlador.Cliente;
import com.mx.ipn.app.modelo.squirrel.Escuela;
import javax.swing.JOptionPane;

public class EscuelaForm extends javax.swing.JFrame {

    private Cliente cliente;
    private int id;

    public EscuelaForm(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        this.id = 0;
    }

    EscuelaForm(Cliente cliente, Escuela escuela) {
        initComponents();
        this.cliente = cliente;
        id = escuela.getIdescuela();
        etiquetaId.setText(String.valueOf(id));
        textoNombre.setText(escuela.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaNOmbre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiquetaId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escuela Formulario");

        etiquetaNOmbre.setText("Nombre:");

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(Cancelar)
                        .addGap(44, 44, 44)
                        .addComponent(aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNOmbre)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaId)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textoNombre))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etiquetaId))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNOmbre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(Cancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        if (id == 0) {
            agregar();
        } else {
            actualizar();
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel etiquetaId;
    private javax.swing.JLabel etiquetaNOmbre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables

    private void agregar() {
        Escuela escuela = new Escuela();
        escuela.setNombre(textoNombre.getText());
        if (cliente.pedirAgregarEscuela(escuela)) {
            JOptionPane.showMessageDialog(null, "Agregado con exito");
            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar");
        }
    }

    private void actualizar() {
        Escuela escuela = new Escuela();
        escuela.setIdescuela(id);
        escuela.setNombre(textoNombre.getText());
        if (cliente.pedirActualizarEscuela(escuela)) {
            JOptionPane.showMessageDialog(null, "Agregado con exito");
            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
    }
}
