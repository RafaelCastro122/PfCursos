/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CursoController;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import model.Curso;

/**
 *
 * @author navas
 */
public class FrmCurso extends javax.swing.JFrame {

    private CursoController controlador = new CursoController();
    private DefaultTableModel modeloTabla;
    private String idSeleccionado = null;

    /**
     * Creates new form FrmCurso
     */
    public FrmCurso() {
        initComponents();
        setLocationRelativeTo(null);
        controlador.setVista(this);
        modeloTabla = (DefaultTableModel) jTable1.getModel();

        jTable1.getTableHeader().setBackground(new Color(15, 52, 96));
        jTable1.getTableHeader().setForeground(Color.WHITE);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));

        ponerFiltro(txtIdCurso, "[0-9]*", 3);
        ponerFiltro(txtCreditos, "[0-9]*", 2);
        ponerFiltro(txtNombreCurso, ".*", 100);
        ponerFiltro(txtCodigoCurso, ".*", 100);
        ponerFiltro(txtAnioPensum, "[0-9-]*", 10);

        jTable1.getSelectionModel().addListSelectionListener(e -> seleccionarFila());

        limpiarFormulario();
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

        lblIdCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdCurso.setForeground(new java.awt.Color(15, 52, 96));
        lblIdCurso.setText("ID del curso");

        lblNombreCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreCurso.setForeground(new java.awt.Color(15, 52, 96));
        lblNombreCurso.setText("Nombre");

        lblCreditos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(15, 52, 96));
        lblCreditos.setText("Creditos");

        lblCodigoCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoCurso.setForeground(new java.awt.Color(15, 52, 96));
        lblCodigoCurso.setText("Codigo");

        lblAnioPensum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAnioPensum.setForeground(new java.awt.Color(15, 52, 96));
        lblAnioPensum.setText("Fecha de inicio");

        txtIdCurso.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCurso.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(185, 199, 214), 1, true), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        txtIdCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdCurso.setForeground(new java.awt.Color(15, 52, 96));

        txtNombreCurso.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCurso.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(185, 199, 214), 1, true), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        txtNombreCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreCurso.setForeground(new java.awt.Color(15, 52, 96));

        txtCreditos.setBackground(new java.awt.Color(255, 255, 255));
        txtCreditos.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(185, 199, 214), 1, true), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        txtCreditos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCreditos.setForeground(new java.awt.Color(15, 52, 96));

        txtCodigoCurso.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoCurso.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(185, 199, 214), 1, true), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        txtCodigoCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoCurso.setForeground(new java.awt.Color(15, 52, 96));

        txtAnioPensum.setBackground(new java.awt.Color(255, 255, 255));
        txtAnioPensum.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(185, 199, 214), 1, true), javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
        txtAnioPensum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAnioPensum.setForeground(new java.awt.Color(15, 52, 96));

        btnAgregar.setBackground(new java.awt.Color(15, 52, 96));
        btnAgregar.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar_gris.png"))); // NOI18N
        btnAgregar.setFocusPainted(false);
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnAgregar.setIconTextGap(6);
        btnAgregar.setOpaque(true);
        btnAgregar.setText("Insertar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnActualizar.setBackground(new java.awt.Color(15, 52, 96));
        btnActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar_gris.png"))); // NOI18N
        btnActualizar.setFocusPainted(false);
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizar.setIconTextGap(6);
        btnActualizar.setOpaque(true);
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnConsultar.setBackground(new java.awt.Color(15, 52, 96));
        btnConsultar.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa_gris.png"))); // NOI18N
        btnConsultar.setFocusPainted(false);
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnConsultar.setIconTextGap(6);
        btnConsultar.setOpaque(true);
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnEliminar.setBackground(new java.awt.Color(15, 52, 96));
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basurero_gris.png"))); // NOI18N
        btnEliminar.setFocusPainted(false);
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basurero.png"))); // NOI18N
        btnEliminar.setIconTextGap(6);
        btnEliminar.setOpaque(true);
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 52, 96), 1, true));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFillsViewportHeight(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(15, 52, 96));
        jTable1.setGridColor(new java.awt.Color(220, 229, 238));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Creditos", "Codigo", "Fecha de inicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(26);
        jTable1.setSelectionBackground(new java.awt.Color(169, 222, 223));
        jTable1.setSelectionForeground(new java.awt.Color(15, 52, 96));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        btnConsultarId.setBackground(new java.awt.Color(15, 52, 96));
        btnConsultarId.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        btnConsultarId.setContentAreaFilled(false);
        btnConsultarId.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa_gris.png"))); // NOI18N
        btnConsultarId.setFocusPainted(false);
        btnConsultarId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarId.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnConsultarId.setIconTextGap(6);
        btnConsultarId.setOpaque(true);
        btnConsultarId.setText("Consultar ID");
        btnConsultarId.addActionListener(this::btnConsultarIdActionPerformed);

        btnNuevo.setBackground(new java.awt.Color(15, 52, 96));
        btnNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_gris.png"))); // NOI18N
        btnNuevo.setFocusPainted(false);
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        btnNuevo.setIconTextGap(6);
        btnNuevo.setOpaque(true);
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(15, 52, 96));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        lblLogo.setText("<html><center>PEOPLE<br>MANAGERS</center></html>");
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sepLogo.setBackground(new java.awt.Color(79, 184, 189));
        sepLogo.setForeground(new java.awt.Color(79, 184, 189));
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
                .addGap(25, 25, 25)
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
        if (modeloTabla.getRowCount() == 0) {
            mostrarMensaje("No hay cursos registrados");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarCurso();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarIdActionPerformed
        consultarId();
    }//GEN-LAST:event_btnConsultarIdActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void agregarCurso() {
        if (!camposCompletos()) {
            return;
        }
        try {
            controlador.agregarCurso(
                    txtIdCurso.getText().trim(),
                    txtNombreCurso.getText().trim(),
                    Integer.parseInt(txtCreditos.getText().trim()),
                    txtCodigoCurso.getText().trim(),
                    txtAnioPensum.getText().trim());
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
            controlador.actualizarCurso(
                    idSeleccionado,
                    txtNombreCurso.getText().trim(),
                    Integer.parseInt(txtCreditos.getText().trim()),
                    txtCodigoCurso.getText().trim(),
                    txtAnioPensum.getText().trim());
        } catch (NumberFormatException ex) {
            mostrarError("Los creditos deben ser un numero entero");
        }
    }

    private void eliminarCurso() {
        if (idSeleccionado == null) {
            mostrarAviso("Seleccione un curso");
            return;
        }
        int respuesta = JOptionPane.showConfirmDialog(this,
                "Desea eliminar el curso " + idSeleccionado + "?",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            controlador.eliminarCurso(idSeleccionado);
        }
    }

    private void consultarId() {
        String id = JOptionPane.showInputDialog(this, "Ingresar el ID del curso a buscar");
        if (id == null) {
            return;
        }
        id = id.trim();
        if (id.isEmpty()) {
            mostrarAviso("Ingrese el ID del curso a buscar");
            return;
        }
        if (!id.matches("[0-9]{1,3}")) {
            mostrarError("El ID debe ser un numero entero de hasta 3 digitos");
            return;
        }
        Curso curso = controlador.obtenerId(id);
        if (curso == null) {
            mostrarAviso("Curso no encontrado");
            return;
        }
        modeloTabla.setRowCount(0);
        agregarFila(curso);
        mostrarCurso(curso);
    }

    public void cargarCursos() {
        modeloTabla.setRowCount(0);
        for (Curso curso : controlador.obtenerCursos()) {
            agregarFila(curso);
        }
    }

    private void agregarFila(Curso curso) {
        Object[] fila = {
            curso.getIdCurso(),
            curso.getNombreCurso(),
            curso.getCreditoCurso(),
            curso.getCodigoCurso(),
            curso.getAnioPensum()
        };
        modeloTabla.addRow(fila);
    }

    private void seleccionarFila() {
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            return;
        }
        txtIdCurso.setText(String.valueOf(modeloTabla.getValueAt(fila, 0)));
        txtNombreCurso.setText(String.valueOf(modeloTabla.getValueAt(fila, 1)));
        txtCreditos.setText(String.valueOf(modeloTabla.getValueAt(fila, 2)));
        txtCodigoCurso.setText(String.valueOf(modeloTabla.getValueAt(fila, 3)));
        txtAnioPensum.setText(String.valueOf(modeloTabla.getValueAt(fila, 4)));
        modoEditar();
    }

    private void mostrarCurso(Curso curso) {
        txtIdCurso.setText(curso.getIdCurso());
        txtNombreCurso.setText(curso.getNombreCurso());
        txtCreditos.setText(String.valueOf(curso.getCreditoCurso()));
        txtCodigoCurso.setText(curso.getCodigoCurso());
        txtAnioPensum.setText(curso.getAnioPensum());
        modoEditar();
    }

    private void modoEditar() {
        idSeleccionado = txtIdCurso.getText();
        txtIdCurso.setEditable(false);
        txtIdCurso.setBackground(new Color(230, 236, 242));
        activarBoton(btnAgregar, false);
        activarBoton(btnActualizar, true);
        activarBoton(btnEliminar, true);
    }

    public void limpiarFormulario() {
        txtIdCurso.setText("");
        txtNombreCurso.setText("");
        txtCreditos.setText("");
        txtCodigoCurso.setText("");
        txtAnioPensum.setText("");
        idSeleccionado = null;
        txtIdCurso.setEditable(true);
        txtIdCurso.setBackground(Color.WHITE);
        jTable1.clearSelection();
        activarBoton(btnAgregar, true);
        activarBoton(btnActualizar, false);
        activarBoton(btnEliminar, false);
        txtIdCurso.requestFocusInWindow();
    }

    private boolean camposCompletos() {
        if (txtIdCurso.getText().trim().isEmpty()) {
            mostrarAviso("Complete el campo: ID del curso");
            txtIdCurso.requestFocusInWindow();
            return false;
        }
        if (txtNombreCurso.getText().trim().isEmpty()) {
            mostrarAviso("Complete el campo: Nombre");
            txtNombreCurso.requestFocusInWindow();
            return false;
        }
        if (txtCreditos.getText().trim().isEmpty()) {
            mostrarAviso("Complete el campo: Creditos");
            txtCreditos.requestFocusInWindow();
            return false;
        }
        if (txtCodigoCurso.getText().trim().isEmpty()) {
            mostrarAviso("Complete el campo: Codigo");
            txtCodigoCurso.requestFocusInWindow();
            return false;
        }
        if (txtAnioPensum.getText().trim().isEmpty()) {
            mostrarAviso("Complete el campo: Fecha de inicio");
            txtAnioPensum.requestFocusInWindow();
            return false;
        }
        return true;
    }

    private void activarBoton(JButton boton, boolean activo) {
        boton.setEnabled(activo);
        if (activo) {
            boton.setBackground(new Color(15, 52, 96));
        } else {
            boton.setBackground(new Color(203, 212, 222));
        }
    }

    private void ponerFiltro(JTextField campo, String permitidos, int maximo) {
        AbstractDocument documento = (AbstractDocument) campo.getDocument();
        documento.setDocumentFilter(new FiltroTexto(permitidos, maximo));
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarAviso(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
