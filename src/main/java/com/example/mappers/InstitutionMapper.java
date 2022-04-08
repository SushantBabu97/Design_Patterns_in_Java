package com.example.mappers;

import com.example.domain.Institution;
import com.example.dtos.InstitutionDto;

import java.util.List;
import java.util.stream.Collectors;

public class InstitutionMapper {
    public static InstitutionDto toDto(Institution institution) {
        InstitutionDto institutionDto = new InstitutionDto();
        institutionDto.setId(institution.getId());
        institutionDto.setName(institution.getInstitutionName());
        institutionDto.setAddress(institution.getInstitutionAddress());

        return institutionDto;
    }

    public static Institution toEntity(InstitutionDto institutionDto){
        Institution institution = new Institution();
        institution.setId(institutionDto.getId());
        institution.setInstitutionName(institutionDto.getName());
        institution.setInstitutionAddress(institutionDto.getAddress());

        return institution;
    }

    public static List<InstitutionDto> toDtoList(List<Institution> institutionList) {
        return institutionList.stream().map(InstitutionMapper::toDto).collect(Collectors.toList());
    }

}
