package com.example.controllers;

import com.example.dtos.GradeDto;
import com.example.services.GradeServices;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/grade")
public class GradeController {
    private final GradeServices gradeServices;

    public GradeController(GradeServices gradeServices) {
        this.gradeServices = gradeServices;
    }

    @Post("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public GradeDto save(@Body GradeDto gradeDto, @PathVariable Long id){
        return gradeServices.save(gradeDto,id);
    }

    @Get("/{gradeName}")
    @Produces(MediaType.APPLICATION_JSON)
    public GradeDto findByGradeName(@PathVariable String gradeName) {
        return gradeServices.findByGradeName(gradeName);
    }
}
