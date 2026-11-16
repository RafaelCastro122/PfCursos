package view;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class FiltroTexto extends DocumentFilter {

    private String permitidos;
    private int maximo;

    public FiltroTexto(String permitidos, int maximo) {
        this.permitidos = permitidos;
        this.maximo = maximo;
    }

    @Override
    public void insertString(FilterBypass fb, int posicion, String texto, AttributeSet attr) throws BadLocationException {
        replace(fb, posicion, 0, texto, attr);
    }

    @Override
    public void replace(FilterBypass fb, int posicion, int borrados, String texto, AttributeSet attr) throws BadLocationException {
        if (texto == null) {
            texto = "";
        }
        int largoFinal = fb.getDocument().getLength() - borrados + texto.length();
        if (largoFinal > maximo) {
            return;
        }
        if (!permitidos.isEmpty()) {
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (permitidos.indexOf(caracter) == -1) {
                    return;
                }
            }
        }
        super.replace(fb, posicion, borrados, texto, attr);
    }
}
