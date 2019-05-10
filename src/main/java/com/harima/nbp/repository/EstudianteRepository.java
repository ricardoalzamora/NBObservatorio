package com.harima.nbp.repository;

import com.harima.nbp.models.Estudiante;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends PagingAndSortingRepository<Estudiante, Long> {
}
