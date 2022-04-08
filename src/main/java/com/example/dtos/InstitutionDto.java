package com.example.dtos;

import com.example.domain.Institution;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InstitutionDto {
    @NotBlank
    private String name;

    @NotBlank
    private String address;

    @NotNull
    private  Long id;

    public InstitutionDto() {
    }

    public InstitutionDto(Institution institution) {
        this.name = institution.getInstitutionName();
        this.address = institution.getInstitutionAddress();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
