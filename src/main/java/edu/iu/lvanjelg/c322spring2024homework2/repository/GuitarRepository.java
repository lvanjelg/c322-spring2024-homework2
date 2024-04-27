package edu.iu.lvanjelg.c322spring2024homework2.repository;

import edu.iu.lvanjelg.c322spring2024homework2.model.Guitar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends CrudRepository<Guitar, Integer> {
    Guitar findBySerialNumber(String serialNumber);
}
