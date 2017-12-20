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
public class buscar {
    
    
    public Boolean buscar1(Personal personal){
     Boolean estado = false;
        try {
           
            ResultSet resultado = null;
            int eje = 0;
            
            String query3 = "select id from clientegp ";
            Connection test=Conexion.obtenerInstancia();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query3);
            
            while (resultado.next() && eje ==0){
                int id2 = resultado.getInt("id");
                if (id2 == personal.getId()){
                    estado = true;
                    eje = 1;
                }
            
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE, null, ex);
        }

        return estado;
    
    
    }
    
     public ResultSet buscartodos(){
     Boolean estado = false;
      ResultSet resultado = null;
        try {
           
           
            int eje = 0;
            
            String query3 = "select * from clientegp";
            Connection test=Conexion.obtenerInstancia();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query3);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    
    
    }
   
      public ResultSet buscarsolouno(Personal personal){
    
      ResultSet resultado = null;
        try {
           
           
            int eje = 0;
            
            String query3 = "select * from clientegp where id="+personal.getId();
            Connection test=Conexion.obtenerInstancia();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query3);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    
    
    } 
     
     
}   
    
    
