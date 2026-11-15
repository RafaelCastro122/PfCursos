package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

final class Estilo {

    static final Color AZUL = new Color(0x0F3460);
    static final Color AZUL_HOVER = new Color(0x1C4E85);
    static final Color AZUL_PRESIONADO = new Color(0x0A2747);
    static final Color TURQUESA = new Color(0x4FB8BD);
    static final Color TURQUESA_CLARO = new Color(0xA9DEDF);
    static final Color FONDO = new Color(0xE8F0F8);
    static final Color FILA_ALTERNA = new Color(0xEEF4FA);
    static final Color GRIS_DESHABILITADO = new Color(0xCBD4DE);
    static final Color TEXTO_DESHABILITADO = new Color(0x8696A7);
    static final Color BORDE_CAMPO = new Color(0xB9C7D6);
    static final Color BORDE_FOCO = new Color(0x2F6FB5);
    static final Color CAMPO_BLOQUEADO = new Color(0xE6ECF2);

    static final Font LETRA_ETIQUETA = new Font("Segoe UI", Font.BOLD, 14);
    static final Font LETRA_CAMPO = new Font("Segoe UI", Font.PLAIN, 14);
    static final Font LETRA_BOTON = new Font("Segoe UI", Font.BOLD, 12);
    static final Font LETRA_TABLA = new Font("Segoe UI", Font.PLAIN, 13);
    static final Font LETRA_ENCABEZADO = new Font("Segoe UI", Font.BOLD, 13);
    static final Font LETRA_LOGO = new Font("Segoe UI", Font.BOLD, 22);

    private Estilo() {
    }

    static void logo(JLabel l) {
        l.setIcon(Iconos.logo());
        l.setFont(LETRA_LOGO);
        l.setForeground(AZUL);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        l.setVerticalTextPosition(SwingConstants.BOTTOM);
        l.setIconTextGap(0);
    }

    static void separador(JSeparator s) {
        s.setForeground(TURQUESA);
        s.setBackground(TURQUESA);
    }

    static void etiqueta(JLabel l) {
        l.setFont(LETRA_ETIQUETA);
        l.setForeground(AZUL);
    }

    static void campo(JTextField c) {
        c.setFont(LETRA_CAMPO);
        c.setForeground(AZUL);
        c.setBackground(Color.WHITE);
        c.setBorder(bordeCampo(BORDE_CAMPO));
        c.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                c.setBorder(bordeCampo(BORDE_FOCO));
            }

            @Override
            public void focusLost(FocusEvent e) {
                c.setBorder(bordeCampo(BORDE_CAMPO));
            }
        });
        c.addPropertyChangeListener("editable", e -> c.setBackground(c.isEditable() ? Color.WHITE : CAMPO_BLOQUEADO));
    }

    private static Border bordeCampo(Color color) {
        return BorderFactory.createCompoundBorder(new LineBorder(color, 1, true),
                BorderFactory.createEmptyBorder(4, 8, 4, 8));
    }

    static void boton(JButton b, Icon icono) {
        b.setUI(new BotonRedondo());
        b.setIcon(icono);
        b.setFont(LETRA_BOTON);
        b.setForeground(Color.WHITE);
        b.setIconTextGap(6);
        b.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setFocusPainted(false);
        b.setRolloverEnabled(true);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    static void tabla(JScrollPane s, JTable t) {
        t.setFont(LETRA_TABLA);
        t.setForeground(AZUL);
        t.setRowHeight(26);
        t.setShowVerticalLines(false);
        t.setGridColor(new Color(0xDCE5EE));
        t.setSelectionBackground(TURQUESA_CLARO);
        t.setSelectionForeground(AZUL);
        t.setFillsViewportHeight(true);
        t.setBackground(FILA_ALTERNA);
        t.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean seleccionada,
                    boolean foco, int fila, int columna) {
                super.getTableCellRendererComponent(tabla, valor, seleccionada, false, fila, columna);
                setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
                if (!seleccionada) {
                    setBackground(fila % 2 == 0 ? Color.WHITE : FILA_ALTERNA);
                }
                return this;
            }
        });

        JTableHeader encabezado = t.getTableHeader();
        encabezado.setReorderingAllowed(false);
        encabezado.setBackground(AZUL);
        encabezado.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean seleccionada,
                    boolean foco, int fila, int columna) {
                super.getTableCellRendererComponent(tabla, valor, false, false, fila, columna);
                setBackground(AZUL);
                setForeground(Color.WHITE);
                setFont(LETRA_ENCABEZADO);
                setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(255, 255, 255, 70)),
                        BorderFactory.createEmptyBorder(7, 10, 7, 10)));
                return this;
            }
        });

        s.setBorder(new LineBorder(AZUL, 1, true));
        s.getViewport().setBackground(FILA_ALTERNA);
        JPanel esquina = new JPanel();
        esquina.setBackground(AZUL);
        s.setCorner(ScrollPaneConstants.UPPER_RIGHT_CORNER, esquina);
    }

    private static class BotonRedondo extends BasicButtonUI {

        @Override
        public void paint(Graphics g, JComponent c) {
            AbstractButton b = (AbstractButton) c;
            ButtonModel m = b.getModel();
            Color fondo;
            if (!m.isEnabled()) {
                fondo = GRIS_DESHABILITADO;
            } else if (m.isPressed() && m.isArmed()) {
                fondo = AZUL_PRESIONADO;
            } else if (m.isRollover()) {
                fondo = AZUL_HOVER;
            } else {
                fondo = AZUL;
            }
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(fondo);
            g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10);
            g2.dispose();
            super.paint(g, c);
        }

        @Override
        protected void paintText(Graphics g, AbstractButton b, Rectangle r, String texto) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2.setFont(b.getFont());
            g2.setColor(b.isEnabled() ? b.getForeground() : TEXTO_DESHABILITADO);
            FontMetrics fm = g2.getFontMetrics();
            g2.drawString(texto, r.x, r.y + fm.getAscent());
        }
    }
}
