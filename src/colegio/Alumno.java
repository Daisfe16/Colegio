/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;


import java.util.HashSet;
import javax.swing.JOptionPane;



/**
 *
 * @author Isaias
 */
public class Alumno {
   private int legajo;
   private String apellido;
   private String nombre;
   private HashSet<Materia>materias=new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean agregarMateria(Materia m){
       if(materias.contains(m)){
        return false;      
       }else{
           materias.add(m);
           return true;
       }
    }
       
        
    
    public int cantidadDeMaterias(){
     return  materias.size();
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }
    
    
}
