package com.celes.proyecto.repositories;

import com.celes.proyecto.entities.Farm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends CrudRepository<Farm, Long> {
    public Farm findByID(long id);
}
