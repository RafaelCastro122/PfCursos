package controller;

import dao.CursoDao;
import java.util.ArrayList;
import java.util.List;
import model.Curso;
import view.FrmCurso;

public class CursoController {

    private CursoDao dao = new CursoDao();
    private FrmCurso vista;
    private String mensajeError = "";

    public void setVista(FrmCurso vista) {
        this.vista = vista;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    private boolean error(String mensaje) {
        mensajeError = mensaje;
        if (vista != null) {
            vista.mostrarError(mensaje);
        }
        return false;
    }

    private boolean exito(String mensaje) {
        mensajeError = "";
        if (vista != null) {
            vista.cargarCursos();
            vista.limpiarFormulario();
            vista.mostrarMensaje(mensaje);
        }
        return true;
    }

    public Curso obtenerId(String id) {
        try {
            return dao.obtenerId(Curso.completarId(id));
        } catch (RuntimeException ex) {
            error("Error al consultar la base de datos");
            return null;
        }
    }

    public List<Curso> obtenerCursos() {
        try {
            return dao.obtenerTodos();
        } catch (RuntimeException ex) {
            error("Error al consultar la base de datos");
            return new ArrayList<>();
        }
    }

    public boolean agregarCurso(String id, String nombre, int creditos, String codigo, String anioPensum) {
        try {
            Curso curso = new Curso(Curso.completarId(id), nombre, creditos, codigo, anioPensum);
            curso.validar();
            if (dao.obtenerId(curso.getIdCurso()) != null) {
                return error("El curso ya existe");
            }
            if (!dao.guardar(curso)) {
                return error("No se pudo guardar el curso. Revise la conexion a la base de datos");
            }
            return exito("Curso agregado correctamente");
        } catch (IllegalArgumentException ex) {
            return error(ex.getMessage());
        } catch (RuntimeException ex) {
            return error("Error al guardar en la base de datos");
        }
    }

    public boolean actualizarCurso(String id, String nombre, int creditos, String codigo, String anioPensum) {
        try {
            Curso curso = new Curso(Curso.completarId(id), nombre, creditos, codigo, anioPensum);
            curso.validar();
            if (!dao.actualizar(curso)) {
                return error("El curso no existe");
            }
            return exito("Curso actualizado correctamente");
        } catch (IllegalArgumentException ex) {
            return error(ex.getMessage());
        } catch (RuntimeException ex) {
            return error("Error al actualizar en la base de datos");
        }
    }

    public boolean eliminarCurso(String id) {
        try {
            if (!dao.eliminar(Curso.completarId(id))) {
                return error("El curso no existe");
            }
            return exito("Curso eliminado correctamente");
        } catch (RuntimeException ex) {
            return error("Error al eliminar en la base de datos");
        }
    }
}
