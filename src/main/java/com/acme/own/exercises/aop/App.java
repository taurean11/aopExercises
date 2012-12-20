package com.acme.own.exercises.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acme.own.exercises.aop.domain.Animal;
import com.acme.own.exercises.aop.domain.Tiger;

/**
 * Hello world!
 *
 */
public class App 
{
    
    private static Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        logger.info("Hello!");
        
        Animal tiger = new Tiger("tigris");
        
        ((Tiger)tiger).howl();
        
        
        
    }
}
