/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Daniela
 */
public class VentaDAO {
    
    public boolean agregarVenta(VentaVO venVO){
        
        return true;
    }
    
    
    public VentaVO obtenerVentaporNro(VentaVO venVO){
        int nroDocto = venVO.getNroDocto();
        VentaVO venta = new VentaVO();
         
        return venta;
    }
    
    
    public ArrayList<VentaVO>obtenerVenta(){
      ArrayList<VentaVO> lista = new ArrayList<>();
      
      return lista;
    }
    
    
    public VentaVO actualizarVenta(VentaVO venVO ){
        VentaVO venta = new VentaVO();
       
        return venta;
    }
    
    
    public boolean borrarVenta(VentaVO venVO){
        return true;
    }
}
    

