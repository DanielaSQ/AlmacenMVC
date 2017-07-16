/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ClienteDAO {
    
    public ClienteDAO(){
        
    }

    public boolean agregar(ClienteVO clienteVO){
        try {
            Conexion conn = new Conexion(); //crea coneccion
            String sentencia = "";
            Statement estatuto = conn.getConnection().createStatement(); //obtiene con
            
            sentencia += "INSERT INTO clientes VALUES ('"
                    + clienteVO.getRut()+ "', '"
                    + clienteVO.getNombre()+ "', '"
                    + clienteVO.getDireccion()+ "', '"
                    + clienteVO.getTelefono()+ "')";
            
            estatuto.execute(sentencia);
            
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


    public ClienteVO obtenerPorRut(String rut) {
        ClienteVO clienteVO = new ClienteVO();
        
        try {
            Conexion conn = new Conexion();
            String sentencia = "SELECT * FROM clientes WHERE rut=?";
            PreparedStatement estatuto = conn.getConnection().prepareStatement(sentencia);
            estatuto.setString(1, rut);
            //String sentencia = "SELECT * FROM `clientes` WHERE rut='"+rut+"'";
            ResultSet resultado = estatuto.executeQuery();
            
            if (resultado.next()) {            
                clienteVO.setRut(resultado.getString("rut"));
                clienteVO.setNombre(resultado.getString("nombre"));
                clienteVO.setDireccion(resultado.getString("direccion"));
                clienteVO.setTelefono(resultado.getString("telefono"));
                //resultado.close();
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clienteVO;
    }

    public boolean eliminarPorRut(String rut) {
        try {
            Conexion conn = new Conexion();
            String sentencia = "DELETE FROM clientes WHERE rut=?";
            PreparedStatement estatuto = conn.getConnection().prepareStatement(sentencia);
            estatuto.setString(1, rut);
            int executeUpdateResult = estatuto.executeUpdate();
            if(executeUpdateResult == 0){
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
