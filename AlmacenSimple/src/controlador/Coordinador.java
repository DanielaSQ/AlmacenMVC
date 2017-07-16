/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ClienteDAO;
import modelo.ClienteVO;

/**
 *
 * @author Daniela
 */
public class Coordinador {
    
    public boolean agregarCliente(ClienteVO clienteVO) {
        ClienteDAO clienteDAO = new ClienteDAO();
        boolean resultado = clienteDAO.agregar(clienteVO); 
        return resultado;
    }
    
    public ClienteVO obtenerCliente(String rut){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.obtenerPorRut(rut);
    }

    public boolean eliminarCliente(String rut) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.eliminarPorRut(rut);
    }
    
}
