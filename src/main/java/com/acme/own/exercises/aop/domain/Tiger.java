package com.acme.own.exercises.aop.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acme.own.exercises.aop.App;

public class Tiger implements Animal {

    private String name;
    private static Logger logger = LoggerFactory.getLogger(Tiger.class);
    
    public Tiger(String name) {
        logger.info("tiger constructor invoked");
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
