/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Alumno;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author fabri
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        materias.add(m);
       
    }
    public int cantidadMaterias(){
        return materias.size();
        
        
    }
}
