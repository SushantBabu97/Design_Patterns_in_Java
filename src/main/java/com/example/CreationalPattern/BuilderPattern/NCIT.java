package com.example.CreationalPattern.BuilderPattern;

public class NCIT extends Institution{
    private String address;
    public NCIT(String name,String address) {
        super(name);
        this.address=address;
    }

    public void display(){
        System.out.println(getName()+" is located at "+address);
    }
}
