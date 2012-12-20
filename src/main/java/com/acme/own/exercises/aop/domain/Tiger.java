package com.acme.own.exercises.aop.domain;

public class Tiger implements Animal {

    private String name;

    public Tiger(String name) {
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    public int getNumberOfFeet() {
        return 4;
    }

    public boolean isCarnivore() {
        return true;
    }

    public Double getWeightAtAge(double age) {
        
        double weight = 3d;
        
        weight += 57/1.5 * age;
        
        return weight;
    }

    public void howl() {
        System.out.println("Grrrrr!");
    }
    
}
