package com.example.dtos;

import com.example.domain.Grade;
import com.example.domain.Institution;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class GradeDto {
    @NotNull
    private int gradeId;

    @NotBlank
    @Size(max = 10)
    private String gradeName;

    @NotNull
    private int studentNumber;

    @NotBlank
    @Size(max = 30)
    private String classTeacher;

    @NotNull
    private Institution institution;

    public GradeDto() {
    }

    public GradeDto(Grade grade) {
        this.gradeName = grade.getGradeName();
        this.studentNumber = grade.getStudentNumber();
        this.classTeacher = grade.getClassTeacher();
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
}
