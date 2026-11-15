package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import javax.swing.JPanel;

public class PanelFondo extends JPanel {

    public PanelFondo() {
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double w = getWidth();
        double h = getHeight();

        g2.setPaint(new GradientPaint(0, 0, Color.WHITE, 0, (float) h, Estilo.FONDO));
        g2.fillRect(0, 0, getWidth(), getHeight());

        Path2D arribaTurquesa = new Path2D.Double();
        arribaTurquesa.moveTo(w * 0.55, 0);
        arribaTurquesa.curveTo(w * 0.70, h * 0.10, w * 0.86, h * 0.04, w, h * 0.32);
        arribaTurquesa.lineTo(w, 0);
        arribaTurquesa.closePath();
        g2.setPaint(new GradientPaint((float) (w * 0.55), 0, Estilo.TURQUESA_CLARO, (float) w, 0, Estilo.TURQUESA));
        g2.fill(arribaTurquesa);

        Path2D arribaAzul = new Path2D.Double();
        arribaAzul.moveTo(w * 0.70, 0);
        arribaAzul.curveTo(w * 0.80, h * 0.12, w * 0.92, h * 0.05, w, h * 0.24);
        arribaAzul.lineTo(w, 0);
        arribaAzul.closePath();
        g2.setColor(Estilo.AZUL);
        g2.fill(arribaAzul);

        Path2D izquierda = new Path2D.Double();
        izquierda.moveTo(0, h * 0.52);
        izquierda.curveTo(w * 0.08, h * 0.66, w * 0.22, h * 0.84, w * 0.48, h * 0.88);
        izquierda.lineTo(w * 0.48, h);
        izquierda.lineTo(0, h);
        izquierda.closePath();
        g2.setPaint(new GradientPaint(0, (float) (h * 0.52), Estilo.TURQUESA, 0, (float) h, Estilo.TURQUESA_CLARO));
        g2.fill(izquierda);

        Path2D abajoTurquesa = new Path2D.Double();
        abajoTurquesa.moveTo(0, h * 0.80);
        abajoTurquesa.curveTo(w * 0.30, h * 0.97, w * 0.62, h * 0.70, w, h * 0.80);
        Path2D bordeBlanco = (Path2D) abajoTurquesa.clone();
        abajoTurquesa.lineTo(w, h);
        abajoTurquesa.lineTo(0, h);
        abajoTurquesa.closePath();
        g2.setPaint(new GradientPaint(0, 0, Estilo.TURQUESA, (float) w, 0, Estilo.TURQUESA_CLARO));
        g2.fill(abajoTurquesa);
        g2.setColor(new Color(255, 255, 255, 180));
        g2.setStroke(new BasicStroke(2f));
        g2.draw(bordeBlanco);

        Path2D abajoAzul = new Path2D.Double();
        abajoAzul.moveTo(0, h * 0.86);
        abajoAzul.curveTo(w * 0.30, h * 1.0, w * 0.65, h * 0.80, w, h * 0.86);
        abajoAzul.lineTo(w, h);
        abajoAzul.lineTo(0, h);
        abajoAzul.closePath();
        g2.setColor(Estilo.AZUL);
        g2.fill(abajoAzul);

        g2.dispose();
    }
}
