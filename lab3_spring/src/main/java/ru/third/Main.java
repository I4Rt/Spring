package ru.third;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main (String[] args){

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);
        Dao<Furniture> furnitureDao = context.getBean("furnitureDao", FurnitureDAO.class);
        Furniture armchair = new Furniture(1, "armchair", 2019, 1200, 900, 900);
        furnitureDao.insert(armchair);
        context.close();


    }
}
