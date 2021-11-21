package Сlasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {



    public static void run(){

        int choise = 1;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner in = new Scanner(System.in);
        animals.add(new Animal("cz1", 5));
        animals.add(new Mammal("cz1", 5));
        animals.add(new Bird("cz1", 5));
        animals.add(new Bird("cz1", 5));
        animals.add(new SeaMammal("cz1", 5));
        while (choise != 0){
            System.out.println("1. Create animal");
            System.out.println("2. Create mammal");
            System.out.println("3. Create bird");
            System.out.println("4. Create sea mammal");
            System.out.println("5. Print the animal's list");
            System.out.println("6. Search by code");
            System.out.println("7. Compare animals");
            System.out.println("0. Exit");
            try {
                choise = in.nextInt();
            } catch (Exception e) {
                System.out.println("NaN");
                break;
            }

            String temp_str = "";
            int temp_int;

            switch(choise){

                case 1:
                    Animal new_animal = new Animal();
                    System.out.println("Input code:");
                    temp_str = in.next().toString().toUpperCase();
                    System.out.println("Input age (int):");
                    try {
                        temp_int = in.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("NaN");
                        break;
                    }
                    new_animal.set_code(temp_str);
                    if(new_animal.set_age(temp_int)){
                        animals.add(new_animal);
                    }
                    else{
                        System.out.println("Age error");
                    }
                    break;

                case 2:
                    Animal new_mammal = new Mammal();
                    System.out.println("Input code:");
                    temp_str = in.next().toString().toUpperCase();
                    System.out.println("Input age (int):");
                    try {
                        temp_int = in.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("NaN");
                        break;
                    }
                    new_mammal.set_code(temp_str);
                    if(new_mammal.set_age(temp_int)){
                        animals.add(new_mammal);
                    }
                    else{
                        System.out.println("Age error");
                    }
                    break;
                case 3:
                    Animal new_bird = new Bird();
                    System.out.println("Input code:");
                    temp_str = in.next().toString().toUpperCase();
                    System.out.println("Input age (int):");
                    try {
                        temp_int = in.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("NaN");
                        break;
                    }
                    new_bird.set_code(temp_str);
                    if(new_bird.set_age(temp_int)){
                        animals.add(new_bird);
                    }
                    else{
                        System.out.println("Age error");
                    }
                    break;

                case 4:
                    Animal new_sea_mammal = new Bird();
                    System.out.println("Input code:");
                    temp_str = in.next().toString().toUpperCase();
                    System.out.println("Input age (int):");
                    try {
                        temp_int = in.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("NaN");
                        break;
                    }
                    new_sea_mammal.set_code(temp_str);
                    if(new_sea_mammal.set_age(temp_int)){
                        animals.add(new_sea_mammal);
                    }
                    else{
                        System.out.println("Age error");
                    }
                    break;
                case 5:
                    for (int i = 0; i < animals.size(); i++){
                        //System.out.println(animals.get(i).to_string());
                        //System.out.println(animals.get(i).toString());
                        System.out.println(animals.get(i));
                    }
                    break;
                case 6:
                    System.out.println("Input code:");
                    temp_str = in.next();

                    for(int  i = 0; i < animals.size(); i++){
                        if (animals.get(i).get_code().equals(temp_str.toUpperCase())){
                            System.out.println(animals.get(i).toString());
                        }
                        if (i == (animals.size() - 1) && !(animals.get(i).get_code().equals(temp_str.toUpperCase()))){
                            System.out.println("No Results\n");
                        }
                    }
                    break;
                case 7:
                    Animal a1 = null;
                    Animal a2 = null;
                    System.out.println("Input the first id:");
                    temp_int = in.nextInt();
                    a1 = animals.get(temp_int);
                    System.out.println("Input the second id:");
                    temp_int = in.nextInt();
                    a2 = animals.get(temp_int);

                    if (a1.equals(a2)){
                        System.out.println("MATCH\n");
                    }
                    else{
                        System.out.println("NOT A MATCH\n");
                    }
                    break;
                case 0:
                    break;
            }
        }
    }
}
