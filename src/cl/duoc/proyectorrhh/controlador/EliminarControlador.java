/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.controlador;

import cl.duoc.proyectorrhh.modelo.Personal;
import cl.duoc.proyectorrhh.servicio.buscar;
import cl.duoc.proyectorrhh.servicio.eliminar;

/**
 *
 * @author GarlefS
 */
public class EliminarControlador {
    
    public boolean eliminarControlador(Personal a){
        
        buscar bus = new buscar();
        if(bus.buscar1(a)){
            eliminar elim =new eliminar();
            return elim.eliminar(a);
            
        }else{
            return false;
        }
    }
}
