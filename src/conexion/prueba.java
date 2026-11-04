package conexion;

import java.sql.Connection;

public class prueba {
    public static void main(String[] args) {
        CreateConection conn = new CreateConection();
        Connection c = conn.getConnection();

        if (c != null) {
            System.out.println("Conexion lista: " + c);
        } else {
            System.out.println("La conexion fallo (devolvio null)");
        }
    }
}