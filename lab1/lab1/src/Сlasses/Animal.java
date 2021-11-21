package Сlasses;

import java.util.Objects;

public class Animal {

    protected String code;
    protected int age;

    private static final int max_age = 25;

    Animal(){
        this.code = "";
        this.age = 0;
    }

    Animal(String code, Integer age){
        this.code = code.toUpperCase();
        this.age = age;
    }

    public void set_code(String code){
        this.code = code;
    }

    public String get_code(){
        return this.code;
    }

    public boolean set_age(int age){
        if (age >= 0 && age <= max_age){
            this.age = age;
            return true;
        }
        else{
            return false;
        }
    }

    public Integer get_age(){
        return this.age;
    }

    public String toString(){
        return String.format("UNKNOWN ANIMAL\n->Code: %s\n->Age: %d\n", code, age);
    }

    public boolean equals(Animal a){
        return (this == a);
    }

    public int hashCode(){
        return Objects.hash(code, age);
    }
}
