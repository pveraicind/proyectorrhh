/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.servicio;

import cl.duoc.proyectorrhh.modelo.Personal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class eliminar {
    
    public Boolean eliminar( Personal persona){
      ResultSet resultado = null;
       Boolean bolita = false;
        try {
            String query1 = "delete from clientesgp where id="+persona.getId();
            Connection test=Conexion.obtenerInstancia();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
            
        } catch (SQLException ex) {
            bolita = false;                        
            Logger.getLogger(eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    } 
    
}
