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
public class modificar {
    
    public Boolean modificacliente(Personal persona){
      Boolean bolita;
        bolita = false;
        try {
            ResultSet resultado = null;
           
            String query1 = "update clientesgp set rut='"+ persona.getRut()+"',dv='"+persona.getDv()+"',fechaingreso='"+persona.getFechaIngreso()+"',direccion='"+persona.getDireccion()+"',fechanacimiento='"+persona.getFechaNacimiento()+"',nombre='"+persona.getNombre()+" where id="+persona.getId();
            Connection test=Conexion.obtenerInstancia();
            Statement dec=test.createStatement();
            resultado=dec.executeQuery(query1);
            bolita = true;
        } catch (SQLException ex) {
            Logger.getLogger(modificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bolita;
    
    }
    
}
