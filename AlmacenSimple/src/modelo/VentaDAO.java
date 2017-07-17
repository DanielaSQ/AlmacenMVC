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
            String sentenciaArticulos = "";//para actualizar existencias
            Statement estatuto = conn.getConnection().createStatement();
                        
            sentencia += "INSERT INTO ventas VALUES ('"
                    + venVO.getNroDocto()+ "', '"
                    + venVO.getFecha()+ "', '"
                    + venVO.getRut()+ "', '"
                    + venVO.getCodigoArticulo()+ "', '"
                    + venVO.getCantidad()+ "')";
            estatuto.execute(sentencia);
                        
            //calcular cantidad restante
            ArticuloDAO articuloDAO = new ArticuloDAO();
            ArticuloVO articuloVO = new ArticuloVO();
            articuloVO = articuloDAO.obtenerArticuloPorCodigo(venVO.getCodigoArticulo());
            int totalRestante = articuloVO.getCantidadExistente() - venVO.getCantidad();
            
            //actualizar existencias en BD
            sentenciaArticulos += "UPDATE articulo SET cantidad_existencia=? "
                    + "WHERE codigo=?";
            PreparedStatement estatutoArticulos = conn.getConnection().prepareStatement(sentenciaArticulos);
            estatutoArticulos.setInt(1, totalRestante);
            estatutoArticulos.setInt(2, venVO.getCodigoArticulo());            
            estatutoArticulos.executeUpdate();
            
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
    
    public boolean eliminarVenta(int nroDocto){
        try {
            Conexion conn = new Conexion();
            String sentencia = "DELETE FROM ventas WHERE nro_docto=?";
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
    

