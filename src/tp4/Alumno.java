/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author crist
 */
public class Alumno {
    private final int legajo;
    private final String apellido;
    private final String nombre;
    private final Set<Materia> materias;
    
    public String agregarMateria(Materia m){
        if (materias.add(m)) return ("Inscripto en " + m.getNomMateria());
        return ("Ya inscripto a " + m.getNomMateria());
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }

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

    public Set<Materia> getMaterias() {
        return materias;
    }

    
}
