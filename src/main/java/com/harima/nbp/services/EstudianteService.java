package com.harima.nbp.services;

import com.harima.nbp.models.Estudiante;
import com.harima.nbp.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerEstudiantes(){
        return (List<Estudiante>) estudianteRepository.findAll();
    }

    public Estudiante obtenerEstudiantePorId(Long ID){
        return estudianteRepository.findById(ID).orElse(null);
    }

    public Estudiante guardarEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public EstudianteService(){}
}
