package com.example.CreationalPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Institution {
    private List<Department> departmentList= new ArrayList<Department>();
    private String name;  //final

    public Institution(String name){
        this.name = name;
    }

    public void addDepartments(Department dept){
        departmentList.add(dept);
    }

    public List<Department> getDepartmentList(){
        return departmentList;
    }

    public String getName() {
        return name;
    }
}
