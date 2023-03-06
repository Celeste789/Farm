package com.celes.proyecto.repositories;

import com.celes.proyecto.entities.Chicken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChickenRepository extends CrudRepository<Chicken, Long> {
    List<Chicken> findAll();
}


