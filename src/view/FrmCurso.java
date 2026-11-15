/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CursoController;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import model.Curso;

/**
 *
 * @author navas
 */
public class FrmCurso extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCurso.class.getName());
    private final CursoController controlador = new CursoController();
    private final DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[]{"ID", "Nombre", "Creditos", "Codigo", "Fecha de inicio"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private String idSeleccionado = null;

    /**
     * Creates new form FrmCurso
     */
    public FrmCurso() {
        setContentPane(new PanelFondo());
        initComponents();
        jTable1.setModel(modeloTabla);
        aplicarEstilo();
        setLocationRelativeTo(null);
        configurarRestricciones();
        jTable1.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                seleccionarFila();
            }
        });
        nuevoCurso();
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
        btnNuevo = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        sepLogo = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdCurso.setText("ID del curso");

        lblNombreCurso.setText("Nombre");

        lblCreditos.setText("Creditos");

        lblCodigoCurso.setText("Codigo");

        lblAnioPensum.setText("Fecha de inicio");

        btnAgregar.setText("Insertar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Creditos", "Codigo", "Fecha de pensum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnConsultarId.setText("Consultar ID");
        btnConsultarId.addActionListener(this::btnConsultarIdActionPerformed);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        lblLogo.setText("<html><center>PEOPLE<br>MANAGERS</center></html>");

        sepLogo.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(sepLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCurso)
                            .addComponent(lblNombreCurso)
                            .addComponent(lblCreditos)
                            .addComponent(lblCodigoCurso)
                            .addComponent(lblAnioPensum))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtNombreCurso)
                            .addComponent(txtCreditos)
                            .addComponent(txtCodigoCurso)
                            .addComponent(txtAnioPensum)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnNuevo)
                        .addGap(10, 10, 10)
                        .addComponent(btnConsultarId)
                        .addGap(10, 10, 10)
                        .addComponent(btnConsultar)
                        .addGap(10, 10, 10)
                        .addComponent(btnActualizar)
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregar)
                        .addGap(10, 10, 10)
                        .addComponent(btnEliminar)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sepLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdCurso)
                                    .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombreCurso)
                                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCreditos)
                                    .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCodigoCurso)
                                    .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnioPensum)
                                    .addComponent(txtAnioPensum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnConsultarId)
                            .addComponent(btnConsultar)
                            .addComponent(btnActualizar)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
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
        if (modeloTabla.getRowCount() == 0) {
            mostrarInfo("No hay cursos registrados");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarCurso();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarIdActionPerformed
        consultarId();
    }//GEN-LAST:event_btnConsultarIdActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevoCurso();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void agregarCurso() {
        if (!camposCompletos()) {
            return;
        }
        try {
            boolean agregado = controlador.agregarCurso(
                    txtIdCurso.getText().trim(),
                    txtNombreCurso.getText().trim(),
                    Integer.parseInt(txtCreditos.getText().trim()),
                    txtCodigoCurso.getText().trim(),
                    txtAnioPensum.getText().trim());

            if (agregado) {
                cargarCursos();
                nuevoCurso();
                mostrarInfo("Curso agregado correctamente");
            } else {
                mostrarError(controlador.getMensajeError());
            }
        } catch (NumberFormatException ex) {
            mostrarError("Los creditos deben ser un numero entero");
        }
    }

    private void actualizarCurso() {
        if (idSeleccionado == null) {
            mostrarAviso("Seleccione un curso");
            return;
        }
        if (!camposCompletos()) {
            return;
        }
        try {
            boolean actualizado = controlador.actualizarCurso(
                    idSeleccionado,
                    txtNombreCurso.getText().trim(),
                    Integer.parseInt(txtCreditos.getText().trim()),
                    txtCodigoCurso.getText().trim(),
                    txtAnioPensum.getText().trim());

            if (actualizado) {
                cargarCursos();
                nuevoCurso();
                mostrarInfo("Curso actualizado correctamente");
            } else {
                mostrarError(controlador.getMensajeError());
            }
        } catch (NumberFormatException ex) {
            mostrarError("Los creditos deben ser un numero entero");
        }
    }

    private void consultarId() {
        String id = JOptionPane.showInputDialog(this, "Ingresar el ID del curso a buscar");
        if (id == null) {
            return;
        }
        if (id.trim().isEmpty()) {
            mostrarAviso("Ingrese el ID del curso a buscar");
            return;
        }
        if (!id.trim().matches("\\d{1," + Curso.ID_DIGITOS + "}")) {
            mostrarError("El ID debe ser un numero entero de hasta " + Curso.ID_DIGITOS + " digitos");
            return;
        }
        Curso curso = controlador.obtenerId(id.trim());
        if (curso == null) {
            mostrarAviso("Curso no encontrado");
        } else {
            modeloTabla.setRowCount(0);
            modeloTabla.addRow(filaDe(curso));
            mostrarCurso(curso);
        }
    }

    public void cargarCursos() {
        modeloTabla.setRowCount(0);
        for (Curso curso : controlador.obtenerCursos()) {
            modeloTabla.addRow(filaDe(curso));
        }
    }

    private Object[] filaDe(Curso curso) {
        return new Object[]{
            curso.getIdCurso(),
            curso.getNombreCurso(),
            curso.getCreditoCurso(),
            curso.getCodigoCurso(),
            curso.getAnioPensum()
        };
    }

    private void seleccionarFila() {
        int fila = jTable1.getSelectedRow();
        if (fila < 0) {
            return;
        }
        mostrarCurso(new Curso(
                String.valueOf(modeloTabla.getValueAt(fila, 0)),
                String.valueOf(modeloTabla.getValueAt(fila, 1)),
                Integer.parseInt(String.valueOf(modeloTabla.getValueAt(fila, 2))),
                String.valueOf(modeloTabla.getValueAt(fila, 3)),
                String.valueOf(modeloTabla.getValueAt(fila, 4))));
    }

    private void mostrarCurso(Curso curso) {
        txtIdCurso.setText(curso.getIdCurso());
        txtNombreCurso.setText(curso.getNombreCurso());
        txtCreditos.setText(Integer.toString(curso.getCreditoCurso()));
        txtCodigoCurso.setText(curso.getCodigoCurso());
        txtAnioPensum.setText(curso.getAnioPensum());
        idSeleccionado = curso.getIdCurso();
        txtIdCurso.setEditable(false);
        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

    private void eliminarCurso() {
        if (idSeleccionado == null) {
            mostrarAviso("Seleccione un curso");
            return;
        }
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "Desea eliminar el curso " + idSeleccionado + "?",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION);
        if (respuesta != JOptionPane.YES_OPTION) {
            return;
        }
        boolean eliminado = controlador.eliminarCurso(idSeleccionado);
        if (eliminado) {
            cargarCursos();
            nuevoCurso();
            mostrarInfo("Curso eliminado correctamente");
        } else {
            mostrarError(controlador.getMensajeError());
        }
    }

    private boolean camposCompletos() {
        JTextField[] campos = {txtIdCurso, txtNombreCurso, txtCreditos, txtCodigoCurso, txtAnioPensum};
        String[] nombres = {"ID del curso", "Nombre", "Creditos", "Codigo", "Fecha de inicio"};
        for (int i = 0; i < campos.length; i++) {
            if (campos[i].getText().trim().isEmpty()) {
                mostrarAviso("Complete el campo: " + nombres[i]);
                campos[i].requestFocusInWindow();
                return false;
            }
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

    private void nuevoCurso() {
        limpiarCampos();
        idSeleccionado = null;
        txtIdCurso.setEditable(true);
        jTable1.clearSelection();
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtIdCurso.requestFocusInWindow();
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarAviso(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    private void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    private void aplicarEstilo() {
        Estilo.logo(lblLogo);
        Estilo.separador(sepLogo);
        for (JLabel etiqueta : new JLabel[]{lblIdCurso, lblNombreCurso, lblCreditos, lblCodigoCurso, lblAnioPensum}) {
            Estilo.etiqueta(etiqueta);
        }
        for (JTextField campo : new JTextField[]{txtIdCurso, txtNombreCurso, txtCreditos, txtCodigoCurso, txtAnioPensum}) {
            Estilo.campo(campo);
        }
        Estilo.boton(btnNuevo, Iconos.mas());
        Estilo.boton(btnConsultarId, Iconos.lupa());
        Estilo.boton(btnConsultar, Iconos.lupa());
        Estilo.boton(btnActualizar, Iconos.actualizar());
        Estilo.boton(btnAgregar, Iconos.guardar());
        Estilo.boton(btnEliminar, Iconos.basurero());
        Estilo.tabla(jScrollPane1, jTable1);
        pack();
    }

    private void configurarRestricciones() {
        restringir(txtIdCurso, "\\d*", Curso.ID_DIGITOS);
        restringir(txtCreditos, "\\d*", 2);
        restringir(txtNombreCurso, ".*", Curso.LONGITUD_MAX);
        restringir(txtCodigoCurso, ".*", Curso.LONGITUD_MAX);
        restringir(txtAnioPensum, "[0-9-]*", 10);
    }

    private static void restringir(JTextField campo, String patron, int max) {
        ((AbstractDocument) campo.getDocument()).setDocumentFilter(new FiltroTexto(patron, max));
    }

    private static class FiltroTexto extends DocumentFilter {

        private final String patron;
        private final int max;

        FiltroTexto(String patron, int max) {
            this.patron = patron;
            this.max = max;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String texto, AttributeSet attr) throws BadLocationException {
            replace(fb, offset, 0, texto, attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int largo, String texto, AttributeSet attr) throws BadLocationException {
            String actual = fb.getDocument().getText(0, fb.getDocument().getLength());
            String nuevo = actual.substring(0, offset) + (texto == null ? "" : texto) + actual.substring(offset + largo);
            if (nuevo.length() <= max && nuevo.matches(patron)) {
                super.replace(fb, offset, largo, texto, attr);
            } else {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
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
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnioPensum;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblIdCurso;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JSeparator sepLogo;
    private javax.swing.JTextField txtAnioPensum;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
