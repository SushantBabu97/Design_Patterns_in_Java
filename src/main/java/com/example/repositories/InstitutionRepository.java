package com.example.repositories;

import com.example.domain.Institution;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;

@Repository
public interface InstitutionRepository extends CrudRepository<Institution,Long> {
    Optional<Institution> findByInstitutionName(String institutionName);
}
