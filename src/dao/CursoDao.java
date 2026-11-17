package dao;

import conexion.CreateConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Curso;

public class CursoDao {

    private final CreateConection connFactory = new CreateConection();

    private Connection abrirConexion() throws SQLException {
        Connection conn = connFactory.getConnection();
        if (conn == null) {
            throw new SQLException("No fue posible conectarse a la base de datos.");
        }
        return conn;
    }

    public List<Curso> obtenerTodos() {
        List<Curso> lista = new ArrayList<>();
        String sql = "SELECT id_curso, nombre_curso, credito_curso, codigo_curso, \"año_pensum\" "
                + "FROM cursos ORDER BY id_curso ASC";

        try (Connection conn = abrirConexion();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        } catch (SQLException e) {
            System.err.println("No se pudo consultar la lista de cursos.");
        }
        return lista;
    }

    public Curso obtenerId(String id) {
        Curso curso = null;
        String sql = "SELECT id_curso, nombre_curso, credito_curso, codigo_curso, \"año_pensum\" "
                + "FROM cursos WHERE id_curso = ?";

        try (Connection conn = abrirConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    curso = mapear(rs);
                }
            }
        } catch (SQLException e) {
            System.err.println("No se pudo consultar el curso.");
        }
        return curso;
    }

    public boolean guardar(Curso curso) {
        String sql = "INSERT INTO cursos (id_curso, nombre_curso, credito_curso, codigo_curso, \"año_pensum\") "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = abrirConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, curso.getIdCurso());
            ps.setString(2, curso.getNombreCurso());
            ps.setInt(3, curso.getCreditoCurso());
            ps.setString(4, curso.getCodigoCurso());
            ps.setDate(5, java.sql.Date.valueOf(curso.getAnioPensum()));
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("No se pudo guardar el curso.");
        }
        return false;
    }

    public boolean actualizar(Curso curso) {
        String sql = "UPDATE cursos SET nombre_curso = ?, credito_curso = ?, codigo_curso = ?, \"año_pensum\" = ? "
                + "WHERE id_curso = ?";

        try (Connection conn = abrirConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, curso.getNombreCurso());
            ps.setInt(2, curso.getCreditoCurso());
            ps.setString(3, curso.getCodigoCurso());
            ps.setDate(4, java.sql.Date.valueOf(curso.getAnioPensum()));
            ps.setString(5, curso.getIdCurso());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("No se pudo actualizar el curso.");
        }
        return false;
    }

    public boolean eliminar(String id) {
        String sql = "DELETE FROM cursos WHERE id_curso = ?";

        try (Connection conn = abrirConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("No se pudo eliminar el curso.");
        }
        return false;
    }

    private Curso mapear(ResultSet rs) throws SQLException {
        return new Curso(
                rs.getString("id_curso"),
                rs.getString("nombre_curso"),
                rs.getInt("credito_curso"),
                rs.getString("codigo_curso"),
                rs.getString("año_pensum")
        );
    }
}
