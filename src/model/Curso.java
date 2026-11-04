package model;

public class Curso {

    private int idCurso;
    private String nombreCurso;
    private int creditoCurso;
    private String codigoCurso;
    private String anioPensum;

    public Curso(int idCurso, String nombreCurso, int creditoCurso, String codigoCurso, String anioPensum) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.creditoCurso = creditoCurso;
        this.codigoCurso = codigoCurso;
        this.anioPensum = anioPensum;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditoCurso() {
        return creditoCurso;
    }

    public void setCreditoCurso(int creditoCurso) {
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
        this.anioPensum = anioPensum;
    }
}
