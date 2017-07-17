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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class VentaDAO {
    
    public boolean agregarVenta(VentaVO venVO){
       try {
            Conexion conn = new Conexion();
            String sentencia = "";
            Statement estatuto = conn.getConnection().createStatement();
            
            sentencia += "INSERT INTO venta VALUES ('"
                    + venVO.getNroDocto()+ "', '"
                    + venVO.getFecha()+ "', '"
                    + venVO.getRut()+ "', '"
                    + venVO.getCodigoArticulo()+ "', '"
                    + venVO.getCantidad()+ "')";
            
            estatuto.execute(sentencia);
            
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    public VentaVO obtenerVentaporNro(int nroDocto){
        VentaVO ventaVO = new VentaVO();
        
        try {
            Conexion conn = new Conexion();
            String sentencia = "SELECT * FROM ventas WHERE nro_docto=?";
            PreparedStatement estatuto = conn.getConnection().prepareStatement(sentencia);
            estatuto.setInt(1, nroDocto);
            ResultSet resultado = estatuto.executeQuery();
            
            if (resultado.next()) {            
                ventaVO.setNroDocto(resultado.getInt("nro_docto"));
                ventaVO.setFecha(resultado.getString("fecha"));
                ventaVO.setRut(resultado.getString("rut"));
                ventaVO.setCodigoArticulo(resultado.getInt("codigo_articulo"));
                ventaVO.setCantidad(resultado.getInt("cantidad"));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventaVO;
    }
    
    
    public VentaVO actualizarVenta(VentaVO venVO ){
        VentaVO venta = new VentaVO();
       
        return venta;
    }
    
    
    public boolean eliminarVenta(int nroDocto){
        try {
            Conexion conn = new Conexion();
            String sentencia = "DELETE FROM ventas WHERE nroDocto=?";
            PreparedStatement estatuto = conn.getConnection().prepareStatement(sentencia);
            estatuto.setInt(1,nroDocto);
            int executeUpdateResult = estatuto.executeUpdate();
            
            if(executeUpdateResult == 0){
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
        
        
   
}
    

