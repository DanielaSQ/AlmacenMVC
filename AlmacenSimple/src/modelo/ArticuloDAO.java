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
public class ArticuloDAO {
    
    public boolean agregarArticulo(ArticuloVO artVO){
        
        
        return true;
    }
    
    public ArticuloVO obtenerArticuloPorCodigo(ArticuloVO artVO){
        int codigo = artVO.getCodigo();
        ArticuloVO articulo = new ArticuloVO();
        
         
        return articulo;
    }
    
    public ArrayList<ArticuloVO> obtenerArticulos(){
        ArrayList<ArticuloVO> lista = new ArrayList();
        
        
        return lista;
    }
    
    public ArticuloVO actualizarArticulo(ArticuloVO artVO ){
        ArticuloVO articulo = new ArticuloVO();
       
        return articulo;
    }
    
    public boolean borrarArticulo(ArticuloVO artVO){
        return true;
    }
}
