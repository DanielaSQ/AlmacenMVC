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
public class ArticuloDAO {
    
    public boolean agregarArticulo(ArticuloVO artVO){
        try {
            Conexion conn = new Conexion();
            String sentencia = "";
            Statement estatuto = conn.getConnection().createStatement();
            
            sentencia += "INSERT INTO articulo VALUES ('"
                    + artVO.getCodigo()+ "', '"
                    + artVO.getDetalle()+ "', '"
                    + artVO.getCategoria()+ "', '"
                    + artVO.getCantidadExistente()+ "', '"
                    + artVO.getPrecioVenta()+ "')";
            
            estatuto.execute(sentencia);
            
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public ArticuloVO obtenerArticuloPorCodigo(int codigo){
       ArticuloVO articuloVO = new ArticuloVO();
        
        try {
            Conexion conn = new Conexion();
            String sentencia = "SELECT * FROM articulo WHERE codigo=?";
            PreparedStatement estatuto = conn.getConnection().prepareStatement(sentencia);
            estatuto.setInt(1, codigo);
            ResultSet resultado = estatuto.executeQuery();
            
            if (resultado.next()) {            
                articuloVO.setCodigo(resultado.getInt("codigo"));
                articuloVO.setDetalle(resultado.getString("detalle"));
                articuloVO.setCategoria(resultado.getString("categoria"));
                articuloVO.setCantidadExistente(resultado.getInt("cantidadExistencia"));
                articuloVO.setPrecioVenta(resultado.getInt("precioVenta"));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return articuloVO;
    }
    
    public ArrayList<ArticuloVO> obtenerArticulos(){
        ArrayList<ArticuloVO> lista = new ArrayList();
        
        
        return lista;
    }
    
    public ArticuloVO actualizarArticulo(ArticuloVO artVO ){
        ArticuloVO articulo = new ArticuloVO();
       
        return articulo;
    }
    
    public boolean eliminarPorCodigo(int codigo){
        
        try {
            Conexion conn = new Conexion();
            String sentencia = "DELETE FROM articulo WHERE codigo=?";
            PreparedStatement estatuto = conn.getConnection().prepareStatement(sentencia);
            estatuto.setInt(1,codigo);
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
