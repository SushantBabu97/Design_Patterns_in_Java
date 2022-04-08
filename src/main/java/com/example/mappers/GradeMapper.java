package com.example.mappers;

import com.example.domain.Grade;
import com.example.domain.Institution;
import com.example.dtos.GradeDto;
import com.example.dtos.InstitutionDto;

public class GradeMapper {
    public static GradeDto toDto(Grade grade) {
        GradeDto gradeDto = new GradeDto();
        InstitutionDto institutionDto = new InstitutionDto();
        gradeDto.setGradeId(grade.getId());
        gradeDto.setGradeName(grade.getGradeName());
        gradeDto.setClassTeacher(grade.getClassTeacher());
        gradeDto.setStudentNumber(grade.getStudentNumber());
        gradeDto.setInstitution(grade.getInstitution());

        return gradeDto;
    }

    public static Grade toEntity(GradeDto gradeDto){
        Grade grade = new Grade();
        grade.setId(gradeDto.getGradeId());
        grade.setGradeName(gradeDto.getGradeName());
        grade.setClassTeacher(gradeDto.getClassTeacher());
        grade.setStudentNumber(gradeDto.getStudentNumber());
        grade.setInstitution(gradeDto.getInstitution());

        return grade;
    }
}
