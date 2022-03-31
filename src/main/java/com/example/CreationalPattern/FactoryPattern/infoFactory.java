package com.example.CreationalPattern.FactoryPattern;

import java.util.Locale;

class infoFactory {
    public static Person getInfoOf(String infoOf){
        infoOf.toLowerCase();
        switch (infoOf) {
            case "education":
                return new EducationInfo();
            case "contact":
                return new ContactInfo();
            case "employment":
                return new EmploymentInfo();
        }
        return null;
    }
}
