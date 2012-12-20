package com.acme.own.exercises.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acme.own.exercises.aop.domain.Animal;
import com.acme.own.exercises.aop.domain.AnimalStore;
import com.acme.own.exercises.aop.domain.Tiger;

/**
 * Hello world!
 * 
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        // logger.info("Hello!");

        // Animal tiger = new Tiger("tigris");

        // ((Tiger)tiger).howl();

        // logger.info(String.format("Weight at 0 age: %f",
        // tiger.getWeightAtAge(0)));
        // logger.info(String.format("Weight at 1 age: %f",
        // tiger.getWeightAtAge(1)));
        // logger.info(String.format("Weight at 1,5 age: %f",
        // tiger.getWeightAtAge(1.5)));
        // logger.info(String.format("Weight at 5 age: %f",
        // tiger.getWeightAtAge(5)));

        logger.info("before ctx");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        logger.info("after ctx");
        
        AnimalStore animalStore = ctx.getBean(AnimalStore.class);
        
        animalStore.listAllAnimalWeightByAge(0.314d);
        animalStore.listAllAnimalWeightByAge(1.41d);
        animalStore.listAllAnimalWeightByAge(2.73d);
        animalStore.listAllAnimalWeightByAge(27.3d);
        animalStore.listAllAnimalWeightByAge(273d);
    }
}
