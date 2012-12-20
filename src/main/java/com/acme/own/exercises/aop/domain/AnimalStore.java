package com.acme.own.exercises.aop.domain;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalStore {

    @Autowired(required = false)
    private List<Animal> animalList;

    private static Logger logger = LoggerFactory.getLogger(AnimalStore.class);

    public AnimalStore() {
        logger.info("animalstore constructor invoked");
    }

    public void listAllAnimals() {

        if (animalList != null) {
            for (Animal a : animalList) {
                System.out.println(a.getName());
            }
        }
    }

}
