/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.servicio;

import cl.duoc.proyectorrhh.modelo.Personal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Listar {
    
    public ArrayList<Personal> listarPersonal(){
        ArrayList<Personal> personal =new ArrayList<>();
        try{
            buscar bus = new buscar();
            ResultSet a = bus.buscartodos();
        while (a.next()){
                Integer id = a.getInt("id");
                Integer rut = a.getInt("rut");
                String dv = a.getString("dv");
                String fechaIngreso = a.getString("fechaingreso");
                String direccion =a.getString("direccion");
                String fechaNacimiento =a.getString("fechanacimiento");
                String nombre =a.getString("nombre");
                        
                Personal rev = new Personal(id,rut,dv,fechaIngreso, direccion, fechaNacimiento, nombre);
                personal.add(rev);                
            }
        return personal;
        }catch( SQLException evv){ return personal;}
        
    }
}
