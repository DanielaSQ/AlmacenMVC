/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ArticuloDAO;
import modelo.ArticuloVO;
import modelo.ClienteDAO;
import modelo.ClienteVO;
import modelo.VentaDAO;
import modelo.VentaVO;

/**
 *
 * @author Daniela
 */
public class Coordinador {
    
    //Coordinar Clientes
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
    
    
    //Coordinar Articulos
    public boolean agregarArticulo(ArticuloVO articuloVO) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        boolean resultado = articuloDAO.agregarArticulo(articuloVO); 
        return resultado;
    }
    
    public ArticuloVO obtenerArticulo(int codigo){
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.obtenerArticuloPorCodigo(codigo);
    }

    public boolean eliminarArticulo(int codigo) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.eliminarPorCodigo(codigo);
    }
    
    //Coordinar Ventas
    public boolean agregarVenta(VentaVO ventaVO) {
        VentaDAO ventaDAO = new VentaDAO();
        boolean resultado = ventaDAO.agregarVenta(ventaVO); 
        return resultado;
    }
    
    public VentaVO obtenerVenta(int nroDocto){
        VentaDAO ventaDAO = new VentaDAO();
        return ventaDAO.obtenerVentaporNro(nroDocto);
    }

    public boolean eliminarVenta( int nroDocto) {
        VentaDAO ventaDAO = new VentaDAO();
        return ventaDAO.eliminarVenta(nroDocto);
    }
    
}
