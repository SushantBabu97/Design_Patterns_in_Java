package com.example.domain;

import com.sun.istack.NotNull;
//import lombok.Builder;

import javax.persistence.*;

//@Builder
@Entity
@Table(name = "institution")
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "institution_name",unique = true)
    private String institutionName;

    @Column(name = "institution_address")
    private String institutionAddress;

    public Institution(){}

    public Institution(@NotNull String institutionName){
        this.institutionName = institutionName;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return this.institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionAddress() {
        return this.institutionAddress;
    }

    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", institutionName='" + institutionName + '\'' +
                ", institutionAddress='" + institutionAddress + '\'' +
                '}';
    }
}
