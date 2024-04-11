/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;
/**
 *
 * @author daviferreira
 */
public class Conexao {
    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_biblioteca", "postgres", "postgres");
        
        return con;
    }
}
