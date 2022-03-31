package com.example;

import com.example.CreationalPattern.BuilderPattern.BuilderImplementation;
import com.example.CreationalPattern.FactoryPattern.toShowInfo;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);

        //Factory Design
        System.out.println("\nThis is Factory Design.\n");
        toShowInfo showinfo = new toShowInfo();
        showinfo.factoryDisplay();

        //Builder Design
        System.out.println("\nThis is Builder Design\n");
        BuilderImplementation implementation = new BuilderImplementation();
        implementation.implementer();
    }
}
