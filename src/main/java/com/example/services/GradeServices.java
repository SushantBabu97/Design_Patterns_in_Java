package com.example.services;

import com.example.domain.Grade;
import com.example.domain.Institution;
import com.example.dtos.GradeDto;
import com.example.mappers.GradeMapper;
import com.example.repositories.GradeRepository;
import com.example.repositories.InstitutionRepository;
import io.micronaut.transaction.annotation.ReadOnly;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Singleton
public class GradeServices {

    private final GradeRepository gradeRepository;
    private final InstitutionRepository institutionRepository;

    @Inject
    public GradeServices(GradeRepository gradeRepository, InstitutionRepository institutionRepository) {
        this.gradeRepository = gradeRepository;
        this.institutionRepository = institutionRepository;
    }

    public GradeDto save(@NotNull GradeDto gradeDto, @NotNull Long id){
        Optional<Institution> institution = institutionRepository.findById(id);
        if(institution.isPresent()){
            gradeDto.setInstitution(institution.get());
            Grade grade = GradeMapper.toEntity(gradeDto);
            grade = gradeRepository.save(grade);
            return GradeMapper.toDto(grade);
        }
        else{
            throw new RuntimeException("No such institution id found.") ;        }

    }

    @ReadOnly
    public GradeDto findByGradeName(@NotNull String gradeName) {
        Optional<Grade> grade = gradeRepository.findByGradeName(gradeName);
        if (grade.isEmpty()) {
            throw new RuntimeException();
        }
        return GradeMapper.toDto(grade.get());
    }
}
