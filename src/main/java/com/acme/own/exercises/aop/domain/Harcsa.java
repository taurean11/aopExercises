package com.acme.own.exercises.aop.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acme.own.exercises.aop.App;

public class Harcsa implements Animal {

    private String name;
    private static Logger logger = LoggerFactory.getLogger(Harcsa.class);
    
    public Harcsa(String name) {
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    public int getNumberOfFeet() {
        return 0;
    }

    public boolean isCarnivore() {
        return true;
    }

    public Double getWeightAtAge(double age) {
        
        double weight = 0.000001d;
        
        weight += 50d/20d * age;
        
        return weight;
    }

    public void bluBlu() {
        logger.info("blu-blu-blu...");
    }
    
}
