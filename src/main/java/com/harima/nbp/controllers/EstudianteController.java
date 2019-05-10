package com.harima.nbp.controllers;

import com.harima.nbp.models.Estudiante;
import com.harima.nbp.nums.EstadoEstudiante;
import com.harima.nbp.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Estudiante")
@CrossOrigin(origins = "*")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.obtenerEstudiantes();
    }

    @GetMapping("/estudiante/{id}")
    public Estudiante obtenerUsuario(@PathVariable Long id){
        return estudianteService.obtenerEstudiantePorId(id);
    }

    @PostMapping("/nuevoEstudiante")
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.guardarEstudiante(estudiante);
    }

    @PostMapping("/inhabilitarEstudiante/{id}")
    public Estudiante crearUsuario(@PathVariable Long id){
        Estudiante estudiante = estudianteService.obtenerEstudiantePorId(id);
        estudiante.setEstadoEstudiante(EstadoEstudiante.RETIRADO);
        return estudianteService.guardarEstudiante(estudiante);
    }
}
