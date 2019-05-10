package com.harima.nbp.repository;

import com.harima.nbp.models.Caso;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CasoRepository extends PagingAndSortingRepository<Caso, Long> {
}
