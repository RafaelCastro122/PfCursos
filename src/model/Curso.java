package model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Curso {

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
        if (!id.matches("[0-9]{3}")) {
            throw new IllegalArgumentException("El ID debe tener 3 digitos (ej. 096)");
        }
        if (id.equals("000")) {
            throw new IllegalArgumentException("El ID no puede ser 000");
        }
    }

    public static String completarId(String id) {
        if (id == null) {
            return null;
        }
        id = id.trim();
        if (id.matches("[0-9]{1,3}")) {
            while (id.length() < 3) {
                id = "0" + id;
            }
        }
        return id;
    }

    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (nombre.length() > 100) {
            throw new IllegalArgumentException("El nombre no puede tener mas de 100 caracteres");
        }
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            throw new IllegalArgumentException("El nombre solo puede contener letras y espacios");
        }
    }

    public static void validarCreditos(int creditos) {
        if (creditos < 1 || creditos > 10) {
            throw new IllegalArgumentException("Los creditos deben estar entre 1 y 10");
        }
    }

    public static void validarFecha(String fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha debe tener el formato AAAA-MM-DD y ser una fecha valida");
        }
        LocalDate fechaCurso;
        try {
            fechaCurso = LocalDate.parse(fecha.trim());
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("La fecha debe tener el formato AAAA-MM-DD y ser una fecha valida");
        }
        if (fechaCurso.isAfter(LocalDate.now())) {
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
    public boolean equals(Object objeto) {
        if (objeto instanceof Curso) {
            Curso otro = (Curso) objeto;
            return idCurso != null && idCurso.equals(otro.getIdCurso());
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (idCurso == null) {
            return 0;
        }
        return idCurso.hashCode();
    }
}
