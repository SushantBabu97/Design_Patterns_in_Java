package com.example.CreationalPattern.FactoryPattern;

import java.util.Locale;

class infoFactory {
    public static Person getInfoOf(String infoOf){
        String Info = infoOf.toLowerCase(); //assign to new variable and check
        switch (Info) {
            case "education":
                return new EducationInfo();
            case "contact":
                return new ContactInfo();
            case "employment":
                return new EmploymentInfo();
        }
        return null; //return exception
    }
}
