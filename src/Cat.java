
import java.io.*;

public class Cat {
    private  int Age;
    private  String catsName;
    private String ownersName;

    public Cat(int age, String owner, String name) {
        Age = age;
        catsName = name;
        ownersName = owner;
        System.out.println("Я родился!");
    }

    void meow() {
        if (Age == 1) {
            System.out.println("Meow!");
        } else {
            System.out.println("Bark");
        }
    }

    void jump() {
        System.out.println("Forward!");
    }

    void lapUp() {
        System.out.println("Yummy!!!");
    }

    String getName() {
        return catsName;
    }

    int getAge() {
        return Age;
    }


}
