/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.servicio;

import cl.duoc.proyectorrhh.modelo.Personal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class modificar {
    
    public Boolean modificacliente(Personal persona){
    
       ResultSet resultado = null;
       Boolean bolita = false;
                String query1 = "update cliente from clientesgp where id="+persona.getId();
            Connection test=Conexion.obtenerInstancia();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
    
    }
    
}
