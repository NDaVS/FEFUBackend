import java.io.*;

class Puppy {

    int puppyAge;

    Puppy(String name) {
        System.out.println("Передаваемое имя: " + name);
    }

    void setAge(int age) {
        puppyAge = age;
    }

    int getAge() {
        System.out.println("Возраст щенка: " + puppyAge);
        return puppyAge;
    }

}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(2, "Nyan", "Eva");
        cat.jump();
        cat.lapUp();
        cat.meow();

    }

}
