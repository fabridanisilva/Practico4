package Alumno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enzo
 */
public class Colegio {
    public static void main(String[] args) {
        Materia web2 = new Materia(1, "Web 2", 2);
        Materia matematicas = new Materia(2, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);

        Alumno lopez = new Alumno(1001, "López", "Martin");
        Alumno martinez = new Alumno(1002, "Martínez", "Brenda");

        lopez.agregarMateria(web2);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio1);

        martinez.agregarMateria(web2);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio1);
        martinez.agregarMateria(laboratorio1);
        
        System.out.println("Lopez esta inscripto en "+ lopez.cantidadMaterias() + " materias");
        System.out.println("Martinez esta inscripto en "+ martinez.cantidadMaterias() + " materias");

    }
}
