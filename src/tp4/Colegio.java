/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

import Vistas.Principal;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author crist
 */
public class Colegio {
    
        private static Set<Materia> materias = new HashSet<>();
        private static Set<Alumno> alumnos = new HashSet<>();



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia m1 = new Materia(1, "Web 2", 2025);
        Materia m2 = new Materia(2, "Matematicas", 2024);
        Materia m3 = new Materia(3, "Laboratorio 1", 2023);
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        materias.add(m1);
                materias.add(m2);
                        materias.add(m3);
                        alumnos.add(a1);
                        alumnos.add(a2);


        new Principal().setVisible(true);
    }
    
    public static HashSet<Alumno> getAlumnos(){
        return (HashSet<Alumno>) alumnos;
    }
    
    public static HashSet<Materia> getMaterias(){
        return (HashSet<Materia>) materias;
    }
    
}
