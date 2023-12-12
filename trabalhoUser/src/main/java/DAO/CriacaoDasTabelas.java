/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author batis
 */
public class  CriacaoDasTabelas {
     public static void createNewTable() {
        // SQLite connection string
         String url = "jdbc:sqlite:meuBancoDeDados.db";
        
        // SQL statement for creating a new table
        String sql = """
                     CREATE TABLE IF NOT EXISTS Usuarios(
                         id integer PRIMARY KEY AUTOINCREMENT,
                         name text NOT NULL,
                         email text NOT NULL
                         usuario text NOT NULL
                         senha text NOT NULL
                         tipoUsuario text NOT NULL
                         autorizado boolean NOT NULL
                         email text NOT NULL
                     );""";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
