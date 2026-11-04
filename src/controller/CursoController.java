package controller;

import dao.CursoDao;
import java.util.List;
import model.Curso;

public class CursoController {

    private final CursoDao dao = new CursoDao();

    public Curso obtenerId(int id) {
        return dao.obtenerId(id);
    }

    public List<Curso> obtenerCursos() {
        return dao.obtenerTodos();
    }

    public boolean agregarCurso(int id, String nombre, int creditos, String codigo, String anioPensum) {
        Curso curso = new Curso(id, nombre, creditos, codigo, anioPensum);
        return dao.guardar(curso);
    }

    public boolean actualizarCurso(int id, String nombre, int creditos, String codigo, String anioPensum) {
        Curso curso = new Curso(id, nombre, creditos, codigo, anioPensum);
        return dao.actualizar(curso);
    }

    public boolean eliminarCurso(int id) {
        return dao.eliminar(id);
    }
}
