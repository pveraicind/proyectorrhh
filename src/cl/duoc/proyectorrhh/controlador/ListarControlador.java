/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.controlador;

import cl.duoc.proyectorrhh.modelo.Personal;
import cl.duoc.proyectorrhh.servicio.Listar;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ListarControlador {
    
    public ArrayList<Personal> listarTodosControlador(){
        
        Listar list =new Listar();
        return list.listarTodos();
        
    }
    
    public Personal listarSoloUnoControlador(Personal b){
        
        Listar list =new Listar();
        return list.listarSoloUno(b);
    }
    
    
}
