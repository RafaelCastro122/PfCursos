package conexion;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreateConection {
    static Properties config = new Properties();
    String hostname, port, database, username, password;
    
    public CreateConection() {
        InputStream archivo = null;
        try {
            archivo = CreateConection.class.getResourceAsStream("/conexion/db_confing.properties");
            if (archivo == null) {
                throw new IOException("No se encontro db_confing.properties");
            }
            config.load(archivo);
        } catch (IOException ex) {
            throw new IllegalStateException("No se pudo cargar la configuracion: " + ex.getMessage(), ex);
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar la configuracion: " + ex.getMessage());
            }
        }
        loadProperties();
    }
    
    public Connection getConnection() {
    try {
        String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + database;

        Connection c = DriverManager.getConnection(jdbcUrl, username, password);
        System.out.println("Conectado exitosamente");
        return c;
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return null;
}
    
    public void loadProperties () {
        this.hostname = config.getProperty("hostname");
        this.port     = config.getProperty("port");
        this.database = config.getProperty("database");
        this.username = config.getProperty("username");
        this.password = config.getProperty("password");
    }
    
    
}
