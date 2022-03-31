package com.example.CreationalPattern.FactoryPattern;

import java.util.HashMap;

abstract class Person {
     protected HashMap<String,Object> details = new HashMap<>();

     abstract void setDetails(String name, long number,String email, String address);

     public void getDetails(){

         System.out.println("Name: "+details.get("name")+"\nAddress: "+details.get("address")+
                 "\nNumber: "+details.get("number")+"\nEmail: "+details.get("email"));
     }
}
