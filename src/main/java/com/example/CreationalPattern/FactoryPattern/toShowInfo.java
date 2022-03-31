package com.example.CreationalPattern.FactoryPattern;

public class toShowInfo {
    public void factoryDisplay(){
        infoFactory infos = new infoFactory();

        EducationInfo edu = new EducationInfo();
        edu.displayMsg();
        Person person1 = infoFactory.getInfoOf("education");
        person1.setDetails("NCIT",4231, "ncit@ncit.edu.np","Balkumari,Laitpur");
        person1.getDetails();

    }
}
