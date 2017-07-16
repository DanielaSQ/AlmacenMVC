/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniela
 */
public class Conexion {
    
    private final String bd = "almacen";
    private final String url = "jdbc:mysql://localhost/almacen";
    private final String login = "root";
    private final String password = "";
    
    public Connection connection;
    
    public Conexion() throws SQLException{
        try{
            connection = (Connection) DriverManager.getConnection(url, login, password);
            if(connection != null){
                System.out.println("conexion a la base de datos [" + bd + "] OK"); 
            }else{
                System.err.println("conexion a la base de datos [" + bd + "] ERROR"); 
            }
        }catch (SQLException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
}
