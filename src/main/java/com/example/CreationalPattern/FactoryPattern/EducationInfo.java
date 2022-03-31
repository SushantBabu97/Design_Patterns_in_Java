package com.example.CreationalPattern.FactoryPattern;

class EducationInfo extends Person {
    private  String title = "This shows EducationInfo of person.";

    @Override
    void setDetails(String name, long number, String email, String address) {
        details.put("name",name);
        details.put("number",number);
        details.put("email",email);
        details.put("address",address);
    }

    void displayMsg() {
        System.out.println(title);
    }
}
