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
public class ClienteDAO {
    
    public boolean agregarCliente(ArticuloVO artVO){
        
        return true;
    }
    
    
    public ClienteVO obtenerClientePorRut(ClienteVO cliVO){
        String rut = cliVO.getRut();
        ClienteVO cliente = new ClienteVO();
         
        return cliente;
    }
    
    
    public ArrayList<ClienteVO>obtenerCliente(){
      ArrayList<ClienteVO> lista = new ArrayList<>();
      
      return lista;
    }
    
    
    public ClienteVO actualizarCliente(ClienteVO cliVO ){
        ClienteVO cliente = new ClienteVO();
       
        return cliente;
    }
    
    
    public boolean borrarCliente(ClienteVO artVO){
        return true;
    }
}
