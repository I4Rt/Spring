package Сlasses;

public class Mammal extends Animal{

    private static final int max_age = 150;

    Mammal(){
        this.code = "";
        this.age = 0;
    }

    Mammal(String code, Integer age){
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
        return String.format("UNKNOWN MAMMAL\n->Code: %s\n->Age: %d\n", code, age);
    }

    @Override
    public boolean equals(Animal a) {
        if (a == null) return false;
        if (!(a instanceof Bird)) return false;
        if (a.get_code() == this.code && a.get_age() == this.age) return true;
        return false;
    }
}
