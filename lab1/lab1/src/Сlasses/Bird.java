package Сlasses;

public class Bird extends Animal{

    private static final int max_age = 10;


    Bird(){
        this.code = "";
        this.age = 0;
    }

    Bird(String code, Integer age){
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
        return String.format("UNKNOWN BIRD\n->Code: %s\n->Age: %d\n", code, age);
    }

    @Override
    public boolean equals(Animal a) {
        if (a == null) return false;
        if (!(a instanceof Mammal)) return false;
        if (a.get_code() == this.code && a.get_age() == this.age) return true;
        return false;
    }
}
