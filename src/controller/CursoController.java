package controller;

import dao.CursoDao;
import java.util.ArrayList;
import java.util.List;
import model.Curso;

public class CursoController {

    private final CursoDao dao = new CursoDao();
    private String mensajeError = "";

    public String getMensajeError() {
        return mensajeError;
    }

    public Curso obtenerId(String id) {
        try {
            return dao.obtenerId(Curso.normalizarId(id));
        } catch (RuntimeException ex) {
            mensajeError = "Error al consultar la base de datos";
            return null;
        }
    }

    public List<Curso> obtenerCursos() {
        try {
            return dao.obtenerTodos();
        } catch (RuntimeException ex) {
            mensajeError = "Error al consultar la base de datos";
            return new ArrayList<>();
        }
    }

    public boolean agregarCurso(String id, String nombre, int creditos, String codigo, String anioPensum) {
        try {
            Curso curso = new Curso(Curso.normalizarId(id), nombre, creditos, codigo, anioPensum);
            curso.validar();
            if (dao.obtenerId(curso.getIdCurso()) != null) {
                mensajeError = "El curso ya existe";
                return false;
            }
            if (!dao.guardar(curso)) {
                mensajeError = "No se pudo guardar el curso. Revise la conexion a la base de datos";
                return false;
            }
            return true;
        } catch (IllegalArgumentException ex) {
            mensajeError = ex.getMessage();
            return false;
        } catch (RuntimeException ex) {
            mensajeError = "Error al guardar en la base de datos";
            return false;
        }
    }

    public boolean actualizarCurso(String id, String nombre, int creditos, String codigo, String anioPensum) {
        try {
            Curso curso = new Curso(Curso.normalizarId(id), nombre, creditos, codigo, anioPensum);
            curso.validar();
            if (!dao.actualizar(curso)) {
                mensajeError = "El curso no existe";
                return false;
            }
            return true;
        } catch (IllegalArgumentException ex) {
            mensajeError = ex.getMessage();
            return false;
        } catch (RuntimeException ex) {
            mensajeError = "Error al actualizar en la base de datos";
            return false;
        }
    }

    public boolean eliminarCurso(String id) {
        try {
            if (!dao.eliminar(Curso.normalizarId(id))) {
                mensajeError = "El curso no existe";
                return false;
            }
            return true;
        } catch (RuntimeException ex) {
            mensajeError = "Error al eliminar en la base de datos";
            return false;
        }
    }
}
