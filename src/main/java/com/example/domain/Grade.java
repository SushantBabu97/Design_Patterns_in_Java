package com.example.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;

    @Column(name = "grade_name", nullable = false, unique = true)
    private String gradeName;

    @Column(name = "student_number")
    private int studentNumber;

    @Column(name = "class_teacher")
    private String classTeacher;

    @ManyToOne(targetEntity = Institution.class)
    @JoinColumn(name = "INSTITUTION_ID")
    private Institution institution;

    public Grade() {
    }

    public Grade(@NotNull String gradeName) {
        this.gradeName = gradeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                ", studentNumber=" + studentNumber +
                ", classTeacher='" + classTeacher + '\'' +
                ", institution=" + institution +
                '}';
    }
}
