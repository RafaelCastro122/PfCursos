/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CursoController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
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
public class FrmCurso extends javax.swing.JFrame implements VistaCurso {

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
        initComponents();
        controlador.setVista(this);
        jTable1.setModel(modeloTabla);
        configurarEncabezadoTabla();
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
        txtIdCurso.setBackground(new Color(230, 236, 242));
        habilitarBoton(btnAgregar, false);
        habilitarBoton(btnActualizar, true);
        habilitarBoton(btnEliminar, true);
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
        controlador.eliminarCurso(idSeleccionado);
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
        txtIdCurso.setBackground(Color.WHITE);
        jTable1.clearSelection();
        habilitarBoton(btnAgregar, true);
        habilitarBoton(btnActualizar, false);
        habilitarBoton(btnEliminar, false);
        txtIdCurso.requestFocusInWindow();
    }

    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        mostrarInfo(mensaje);
    }

    @Override
    public void limpiar() {
        nuevoCurso();
    }

    @Override
    public void refrescarTabla() {
        cargarCursos();
    }

    private void mostrarAviso(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    private void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    private void configurarEncabezadoTabla() {
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean seleccionada,
                    boolean foco, int fila, int columna) {
                super.getTableCellRendererComponent(tabla, valor, false, false, fila, columna);
                setBackground(new Color(15, 52, 96));
                setForeground(Color.WHITE);
                setFont(new Font("Segoe UI", Font.BOLD, 13));
                setBorder(BorderFactory.createEmptyBorder(7, 10, 7, 10));
                return this;
            }
        });
    }

    private void habilitarBoton(JButton boton, boolean habilitado) {
        boton.setEnabled(habilitado);
        boton.setBackground(habilitado ? new Color(15, 52, 96) : new Color(203, 212, 222));
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
