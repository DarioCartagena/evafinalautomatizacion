/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author JOSE DARIO CARTAGENA
 */
public class DatabaseConnectionTest {

    @Test
    public void testConnection() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            assertNotNull(conn, "La conexión a la base de datos debería ser exitosa");
            conn.close();
        } catch (Exception e) {
            fail("La conexión a la base de datos falló: " + e.getMessage());
        }
    }
}
