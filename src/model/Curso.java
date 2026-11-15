package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Objects;

public class Curso {

    public static final int CREDITOS_MIN = 1;
    public static final int CREDITOS_MAX = 10;
    public static final int LONGITUD_MAX = 100;

    private static final DateTimeFormatter FORMATO_FECHA =
            DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(ResolverStyle.STRICT);

    public static final int ID_DIGITOS = 3;

    private String idCurso;
    private String nombreCurso;
    private int creditoCurso;
    private String codigoCurso;
    private String anioPensum;

    public Curso(String idCurso, String nombreCurso, int creditoCurso, String codigoCurso, String anioPensum) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.creditoCurso = creditoCurso;
        this.codigoCurso = codigoCurso;
        this.anioPensum = anioPensum;
    }

    public void validar() {
        validarId(idCurso);
        validarNombre(nombreCurso);
        validarCreditos(creditoCurso);
        validarFecha(anioPensum);
    }

    public static void validarId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID es obligatorio");
        }
        if (!id.matches("\\d{" + ID_DIGITOS + "}")) {
            throw new IllegalArgumentException("El ID debe tener " + ID_DIGITOS + " digitos (ej. 096)");
        }
        if (id.equals("000")) {
            throw new IllegalArgumentException("El ID no puede ser 000");
        }
    }

    public static String normalizarId(String id) {
        if (id == null) {
            return null;
        }
        String limpio = id.trim();
        if (limpio.matches("\\d{1," + ID_DIGITOS + "}")) {
            return "0".repeat(ID_DIGITOS - limpio.length()) + limpio;
        }
        return limpio;
    }

    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (nombre.length() > LONGITUD_MAX) {
            throw new IllegalArgumentException("El nombre no puede tener mas de " + LONGITUD_MAX + " caracteres");
        }
        if (!nombre.matches("[\\p{L} ]+")) {
            throw new IllegalArgumentException("El nombre solo puede contener letras y espacios");
        }
    }

    public static void validarCreditos(int creditos) {
        if (creditos < CREDITOS_MIN || creditos > CREDITOS_MAX) {
            throw new IllegalArgumentException("Los creditos deben estar entre " + CREDITOS_MIN + " y " + CREDITOS_MAX);
        }
    }

    public static void validarFecha(String fecha) {
        LocalDate f;
        try {
            f = LocalDate.parse(fecha == null ? "" : fecha.trim(), FORMATO_FECHA);
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("La fecha debe tener el formato AAAA-MM-DD y ser una fecha valida");
        }
        if (f.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser futura");
        }
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        validarId(idCurso);
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        validarNombre(nombreCurso);
        this.nombreCurso = nombreCurso;
    }

    public int getCreditoCurso() {
        return creditoCurso;
    }

    public void setCreditoCurso(int creditoCurso) {
        validarCreditos(creditoCurso);
        this.creditoCurso = creditoCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getAnioPensum() {
        return anioPensum;
    }

    public void setAnioPensum(String anioPensum) {
        validarFecha(anioPensum);
        this.anioPensum = anioPensum;
    }

    @Override
    public String toString() {
        return idCurso + " - " + nombreCurso + " (" + creditoCurso + " creditos, " + codigoCurso + ", " + anioPensum + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Curso)) {
            return false;
        }
        return Objects.equals(idCurso, ((Curso) o).idCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso);
    }
}
