package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.util.function.Consumer;
import javax.swing.Icon;

final class Iconos {

    private Iconos() {
    }

    static Icon mas() {
        return new IconoBoton(2.4f, g -> {
            g.drawLine(8, 3, 8, 13);
            g.drawLine(3, 8, 13, 8);
        });
    }

    static Icon lupa() {
        return new IconoBoton(2f, g -> {
            g.drawOval(2, 2, 9, 9);
            g.drawLine(10, 10, 14, 14);
        });
    }

    static Icon actualizar() {
        return new IconoBoton(1.8f, g -> {
            g.drawArc(2, 2, 12, 12, 30, 150);
            g.drawArc(2, 2, 12, 12, 210, 150);
            g.fillPolygon(new int[]{0, 5, 2}, new int[]{7, 7, 11}, 3);
            g.fillPolygon(new int[]{11, 16, 14}, new int[]{9, 9, 5}, 3);
        });
    }

    static Icon guardar() {
        return new IconoBoton(1.6f, g -> {
            g.drawRoundRect(2, 2, 12, 12, 3, 3);
            g.fillRect(5, 3, 5, 3);
            g.drawRect(5, 9, 6, 5);
        });
    }

    static Icon basurero() {
        return new IconoBoton(1.6f, g -> {
            g.drawLine(2, 4, 14, 4);
            g.drawLine(6, 2, 10, 2);
            Path2D cuerpo = new Path2D.Double();
            cuerpo.moveTo(3.5, 4);
            cuerpo.lineTo(4.5, 14.5);
            cuerpo.lineTo(11.5, 14.5);
            cuerpo.lineTo(12.5, 4);
            g.draw(cuerpo);
            g.drawLine(7, 7, 7, 12);
            g.drawLine(9, 7, 9, 12);
        });
    }

    static Icon logo() {
        return new Logo();
    }

    private static class IconoBoton implements Icon {

        private final float grosor;
        private final Consumer<Graphics2D> dibujo;

        IconoBoton(float grosor, Consumer<Graphics2D> dibujo) {
            this.grosor = grosor;
            this.dibujo = dibujo;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.translate(x, y);
            g2.setColor(c.isEnabled() ? Color.WHITE : Estilo.TEXTO_DESHABILITADO);
            g2.setStroke(new BasicStroke(grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            dibujo.accept(g2);
            g2.dispose();
        }

        @Override
        public int getIconWidth() {
            return 16;
        }

        @Override
        public int getIconHeight() {
            return 16;
        }
    }

    private static class Logo implements Icon {

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.translate(x, y);

            g2.setColor(Estilo.TURQUESA);
            g2.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            Path2D flecha = new Path2D.Double();
            flecha.moveTo(6, 74);
            flecha.quadTo(55, 72, 100, 22);
            g2.draw(flecha);
            g2.fill(estrella(105, 15, 10, 4));

            persona(g2, 22, 50, 0.8, Estilo.TURQUESA);
            persona(g2, 56, 34, 1.0, Estilo.AZUL);
            persona(g2, 88, 52, 0.8, Estilo.AZUL);
            g2.dispose();
        }

        private void persona(Graphics2D g, int cx, int arriba, double s, Color color) {
            int cabeza = (int) (16 * s);
            int ancho = (int) (28 * s);
            int alto = (int) (30 * s);
            int cuerpoY = arriba + (int) (20 * s);
            g.setColor(Estilo.FONDO);
            g.fillRoundRect(cx - ancho / 2, cuerpoY, ancho, alto, ancho / 2, ancho / 2);
            g.setColor(color);
            g.fillOval(cx - cabeza / 2, arriba, cabeza, cabeza);
            g.setStroke(new BasicStroke((float) (4.5 * s), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.drawRoundRect(cx - ancho / 2, cuerpoY, ancho, alto, ancho / 2, ancho / 2);
        }

        private Polygon estrella(int cx, int cy, int radioExt, int radioInt) {
            Polygon p = new Polygon();
            for (int i = 0; i < 10; i++) {
                double ang = Math.PI / 2 + i * Math.PI / 5;
                int r = (i % 2 == 0) ? radioExt : radioInt;
                p.addPoint(cx + (int) Math.round(r * Math.cos(ang)), cy - (int) Math.round(r * Math.sin(ang)));
            }
            return p;
        }

        @Override
        public int getIconWidth() {
            return 120;
        }

        @Override
        public int getIconHeight() {
            return 92;
        }
    }
}
