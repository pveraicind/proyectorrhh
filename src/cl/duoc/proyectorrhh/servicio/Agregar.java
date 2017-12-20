/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.servicio;

import cl.duoc.proyectorrhh.modelo.Personal;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author USUARIO
 */
public class Agregar {
    private Boolean bolita;
    
            public Boolean agregarcliente( Personal personal){
                
                try {
                    bolita = true;
                    System.out.println("Insertar registro...");
                    Statement dec;
                    dec=Conexion.obtenerInstancia().createStatement();
                    String query1="insert into clientesgp (id, rut, dv,fechaingreso,direccion,fechanacimiento,nombre) VALUES ( '"+personal.getId()+"', '"+personal.getRut()+"','"+personal.getDv()+"','"+personal.getFechaIngreso()+"','"+personal.getDireccion()+"','"+personal.getFechaNacimiento()+"','"+personal.getNombre() +"')";
                    dec.executeUpdate(query1);
                } catch (SQLException ex) {
                    
                    bolita = false;
               
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }
        return bolita;
            }
    
}
