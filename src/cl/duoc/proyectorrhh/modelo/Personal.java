/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.proyectorrhh.modelo;

/**
 *
 * @author USUARIO
 */
public class Personal {
    
    private Integer id, rut;
    private String dv,fechaIngreso,direccion,fechaNacimiento,nombre;

    //Constructores
    public Personal() {
    }

    public Personal(Integer id, Integer rut, String dv, String fechaIngreso, String direccion, String fechaNacimiento, String nombre) {
        this.id = id;
        this.rut = rut;
        this.dv = dv;
        this.fechaIngreso = fechaIngreso;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    

    
    //Seters
    public void setId(Integer id) {
        this.id = id;
    }
    public void setDv(String dv) {
        this.dv = dv;
    }
        public void setRut(Integer rut) {
        this.rut = rut;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
//Geters
    public Integer getId() {
        return id;
    }
    public Integer getRut() {
        return rut;
    }
    public String getDv() {
        return dv;
    }    
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    
    
}
