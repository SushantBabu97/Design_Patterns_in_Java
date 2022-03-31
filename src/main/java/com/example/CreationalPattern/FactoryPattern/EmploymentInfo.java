package com.example.CreationalPattern.FactoryPattern;

public class EmploymentInfo extends Person {
    @Override
    void setDetails(String name, long number, String email, String address) {
        details.put("name",name) ;
        details.put("number",number);
        details.put("email",email);
        details.put("address",address);
    }

}
