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

    private void cerrar(ResultSet rs, PreparedStatement ps, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List<Curso> obtenerTodos() {
        List<Curso> lista = new ArrayList<>();
        String sql = "SELECT id_curso, nombre_curso, credito_curso, codigo_curso, \"año_pensum\" "
                + "FROM cursos ORDER BY id_curso ASC";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = connFactory.getConnection();
            if (conn == null) {
                return lista;
            }
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso(
                        rs.getInt("id_curso"),
                        rs.getString("nombre_curso"),
                        rs.getInt("credito_curso"),
                        rs.getString("codigo_curso"),
                        rs.getString("año_pensum")
                );
                lista.add(curso);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            cerrar(rs, ps, conn);
        }
        return lista;
    }

    public Curso obtenerId(int id) {
        Curso curso = null;
        String sql = "SELECT id_curso, nombre_curso, credito_curso, codigo_curso, \"año_pensum\" "
                + "FROM cursos WHERE id_curso = ?";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = connFactory.getConnection();
            if (conn == null) {
                return null;
            }
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                curso = new Curso(
                        rs.getInt("id_curso"),
                        rs.getString("nombre_curso"),
                        rs.getInt("credito_curso"),
                        rs.getString("codigo_curso"),
                        rs.getString("año_pensum")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            cerrar(rs, ps, conn);
        }
        return curso;
    }

    public boolean guardar(Curso curso) {
        String sql = "INSERT INTO cursos (id_curso, nombre_curso, credito_curso, codigo_curso, \"año_pensum\") "
                + "VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = connFactory.getConnection();
            if (conn == null) {
                return false;
            }
            ps = conn.prepareStatement(sql);
            ps.setInt(1, curso.getIdCurso());
            ps.setString(2, curso.getNombreCurso());
            ps.setInt(3, curso.getCreditoCurso());
            ps.setString(4, curso.getCodigoCurso());
            ps.setDate(5, java.sql.Date.valueOf(curso.getAnioPensum()));
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            cerrar(null, ps, conn);
        }
        return false;
    }

    public boolean actualizar(Curso curso) {
        String sql = "UPDATE cursos SET nombre_curso = ?, credito_curso = ?, codigo_curso = ?, \"año_pensum\" = ? "
                + "WHERE id_curso = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = connFactory.getConnection();
            if (conn == null) {
                return false;
            }
            ps = conn.prepareStatement(sql);
            ps.setString(1, curso.getNombreCurso());
            ps.setInt(2, curso.getCreditoCurso());
            ps.setString(3, curso.getCodigoCurso());
            ps.setDate(4, java.sql.Date.valueOf(curso.getAnioPensum()));
            ps.setInt(5, curso.getIdCurso());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            cerrar(null, ps, conn);
        }
        return false;
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM cursos WHERE id_curso = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = connFactory.getConnection();
            if (conn == null) {
                return false;
            }
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            cerrar(null, ps, conn);
        }
        return false;
    }
}
