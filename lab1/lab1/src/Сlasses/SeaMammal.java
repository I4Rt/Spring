package Сlasses;

public class SeaMammal extends Mammal{

    private static final int max_age = 25;


    SeaMammal(){
        this.code = "";
        this.age = 0;
    }

    SeaMammal(String code, Integer age){
        this.code = code.toUpperCase();
        this.age = age;
    }

    @Override
     public boolean set_age(int age){
        if (age >= 0 && age <= max_age){
            this.age = age;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("UNKNOWN SEA MAMMAL\n->Code: %s\n->Age: %d\n", code, age);
    }
}
