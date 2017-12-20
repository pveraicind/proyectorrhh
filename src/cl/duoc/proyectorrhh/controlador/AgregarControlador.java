/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.controlador;

import cl.duoc.proyectorrhh.modelo.Personal;
import cl.duoc.proyectorrhh.servicio.Agregar;

/**
 *
 * @author USUARIO
 */
public class AgregarControlador {
    
    public boolean agregarPersona( Personal a){
        Agregar ins = new Agregar();
        if(ins.agregarcliente(a)){
            
            return true;
        }
        return false;
    }
}
