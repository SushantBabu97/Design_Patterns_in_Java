package com.example.services;

import com.example.domain.Institution;
import com.example.dtos.InstitutionDto;
import com.example.mappers.InstitutionMapper;
import com.example.repositories.InstitutionRepository;
import io.micronaut.transaction.annotation.ReadOnly;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class InstitutionServices {

    private final InstitutionRepository institutionRepository;

    @Inject
    public InstitutionServices(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    public List<InstitutionDto> getAllInstitution() {
        List<Institution> institutionList = new ArrayList<>();
        institutionRepository.findAll().forEach(institutionList::add);
        return InstitutionMapper.toDtoList(institutionList);
    }

    public InstitutionDto save(@NotNull InstitutionDto institutionDto) {
        Institution institution = InstitutionMapper.toEntity(institutionDto);
        institution = institutionRepository.save(institution);
        return InstitutionMapper.toDto(institution);
    }

    @ReadOnly
    public InstitutionDto findByInstitutionId(@NotNull Long institutionId) {
        Optional<Institution> institution = institutionRepository.findById(institutionId);
        if (institution.isEmpty()) {
            throw new RuntimeException();
        }
        return InstitutionMapper.toDto(institution.get());
    }

    @ReadOnly
    public InstitutionDto findByInstitutionName(@NotNull String institutionName) {
        Optional<Institution> institution = institutionRepository.findByInstitutionName(institutionName);
        if (institution.isEmpty()) {
            throw new RuntimeException();
        }
        return InstitutionMapper.toDto(institution.get());
    }
}
