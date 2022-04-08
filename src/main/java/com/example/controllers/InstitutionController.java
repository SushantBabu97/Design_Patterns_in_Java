package com.example.controllers;

import com.example.dtos.InstitutionDto;
import com.example.services.InstitutionServices;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/institution")
public class InstitutionController {

    private final InstitutionServices institutionServices;

    @Inject
    public InstitutionController(InstitutionServices institutionServices) {
        this.institutionServices = institutionServices;
    }

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public InstitutionDto save(@Body InstitutionDto institutionDto){
        return institutionServices.save(institutionDto);
    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public List<InstitutionDto> getInstitutions(){
        return institutionServices.getAllInstitution();
    }

    @Get("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public InstitutionDto findByInstitutionId(@PathVariable Long id){
        return institutionServices.findByInstitutionId(id);
    }

    @Get("/name/{institutionName}")
    @Produces(MediaType.APPLICATION_JSON)
    public InstitutionDto findByInstitutionName(@PathVariable String institutionName) {
        return institutionServices.findByInstitutionName(institutionName);
    }

}
