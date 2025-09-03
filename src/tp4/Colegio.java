/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author crist
 */
public class Colegio {
    
        private Set<Materia> materias;
        private  Set<Alumno> alumnos;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia m1 = new Materia(1, "Web 2", 2025);
        Materia m2 = new Materia(2, "Matematicas", 2024);
        Materia m3 = new Materia(3, "Laboratorio 1", 2023);
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        new Principal().setVisible(true);

    }
    
}
