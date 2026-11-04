/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CursoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Curso;

/**
 *
 * @author navas
 */
public class FrmCurso extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCurso.class.getName());
    private final CursoController controlador = new CursoController();
    private final DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[]{"ID", "Nombre", "Creditos", "Codigo", "Fecha de pensum"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form FrmCurso
     */
    public FrmCurso() {
        initComponents();
        jTable1.setModel(modeloTabla);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdCurso = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        lblCreditos = new javax.swing.JLabel();
        lblCodigoCurso = new javax.swing.JLabel();
        lblAnioPensum = new javax.swing.JLabel();
        txtIdCurso = new javax.swing.JTextField();
        txtNombreCurso = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        txtCodigoCurso = new javax.swing.JTextField();
        txtAnioPensum = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConsultarId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Cursos");

        lblIdCurso.setText("ID del curso");
        lblNombreCurso.setText("Nombre");
        lblCreditos.setText("Creditos");
        lblCodigoCurso.setText("Codigo");
        lblAnioPensum.setText("Fecha de pensum (AAAA-MM-DD)");

        btnAgregar.setText("Insertar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Nombre", "Creditos", "Codigo", "Fecha de pensum"}
        ));
        jScrollPane1.setViewportView(jTable1);

        btnConsultarId.setText("Consultar ID");
        btnConsultarId.addActionListener(this::btnConsultarIdActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultarId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCurso)
                            .addComponent(lblNombreCurso)
                            .addComponent(lblCreditos)
                            .addComponent(lblCodigoCurso)
                            .addComponent(lblAnioPensum))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtNombreCurso)
                            .addComponent(txtCreditos)
                            .addComponent(txtCodigoCurso)
                            .addComponent(txtAnioPensum))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdCurso)
                            .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCurso)
                            .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCreditos)
                            .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoCurso)
                            .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnioPensum)
                            .addComponent(txtAnioPensum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultarId)
                            .addComponent(btnConsultar)
                            .addComponent(btnActualizar)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarCurso();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarCurso();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cargarCursos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarCurso();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarIdActionPerformed
        consultarId();
    }//GEN-LAST:event_btnConsultarIdActionPerformed

    private void agregarCurso() {
        try {
            if (!camposCompletos()) {
                return;
            }
            boolean agregado = controlador.agregarCurso(
                    Integer.parseInt(txtIdCurso.getText().trim()),
                    txtNombreCurso.getText().trim(),
                    Integer.parseInt(txtCreditos.getText().trim()),
                    txtCodigoCurso.getText().trim(),
                    txtAnioPensum.getText().trim());

            if (agregado) {
                cargarCursos();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Curso agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el curso. Revise el ID y la fecha.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El ID y los creditos deben ser numeros enteros");
        }
    }

    private void actualizarCurso() {
        try {
            if (!camposCompletos()) {
                return;
            }
            boolean actualizado = controlador.actualizarCurso(
                    Integer.parseInt(txtIdCurso.getText().trim()),
                    txtNombreCurso.getText().trim(),
                    Integer.parseInt(txtCreditos.getText().trim()),
                    txtCodigoCurso.getText().trim(),
                    txtAnioPensum.getText().trim());

            if (actualizado) {
                cargarCursos();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Curso actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "El id no existe por favor ingresar uno valido");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El ID y los creditos deben ser numeros enteros");
        }
    }

    private void consultarId() {
        String id = JOptionPane.showInputDialog("Ingresar el ID del curso a buscar");
        if (id == null) {
            return;
        }
        try {
            int codigo = Integer.parseInt(id.trim());
            modeloTabla.setRowCount(0);
            Curso curso = controlador.obtenerId(codigo);
            if (curso == null) {
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "El id no existe por favor ingresar uno valido");
            } else {
                mostrarCurso(curso);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El ID debe ser entero");
        }
    }

    public void cargarCursos() {
        modeloTabla.setRowCount(0);
        for (Curso curso : controlador.obtenerCursos()) {
            modeloTabla.addRow(new Object[]{
                curso.getIdCurso(),
                curso.getNombreCurso(),
                curso.getCreditoCurso(),
                curso.getCodigoCurso(),
                curso.getAnioPensum()
            });
        }
    }

    private void mostrarCurso(Curso curso) {
        modeloTabla.addRow(new Object[]{
            curso.getIdCurso(),
            curso.getNombreCurso(),
            curso.getCreditoCurso(),
            curso.getCodigoCurso(),
            curso.getAnioPensum()
        });
        txtIdCurso.setText(Integer.toString(curso.getIdCurso()));
        txtNombreCurso.setText(curso.getNombreCurso());
        txtCreditos.setText(Integer.toString(curso.getCreditoCurso()));
        txtCodigoCurso.setText(curso.getCodigoCurso());
        txtAnioPensum.setText(curso.getAnioPensum());
    }

    private void eliminarCurso() {
        String id = JOptionPane.showInputDialog("Codigo del curso a eliminar");
        if (id == null) {
            return;
        }
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "Desea eliminar este curso",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION);
        if (respuesta != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            boolean eliminado = controlador.eliminarCurso(Integer.parseInt(id.trim()));
            if (eliminado) {
                cargarCursos();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Curso eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "El id no existe por favor ingresar uno valido");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El ID debe ser entero");
        }
    }

    private boolean camposCompletos() {
        if (txtIdCurso.getText().trim().isEmpty()
                || txtNombreCurso.getText().trim().isEmpty()
                || txtCreditos.getText().trim().isEmpty()
                || txtCodigoCurso.getText().trim().isEmpty()
                || txtAnioPensum.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            return false;
        }
        try {
            java.sql.Date.valueOf(txtAnioPensum.getText().trim());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "La fecha debe tener el formato AAAA-MM-DD");
            return false;
        }
        return true;
    }

    private void limpiarCampos() {
        txtIdCurso.setText("");
        txtNombreCurso.setText("");
        txtCreditos.setText("");
        txtCodigoCurso.setText("");
        txtAnioPensum.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, "No se pudo iniciar la ventana", ex);
        }
        java.awt.EventQueue.invokeLater(() -> new FrmCurso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarId;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnioPensum;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblIdCurso;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JTextField txtAnioPensum;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
