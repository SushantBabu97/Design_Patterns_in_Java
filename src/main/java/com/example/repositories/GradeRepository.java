package com.example.repositories;

import com.example.domain.Grade;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Integer> {
    Optional<Grade> findByGradeName(@NotNull String gradeName);
}
