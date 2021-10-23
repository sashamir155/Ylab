package T2;

import java.util.Scanner;

public class Main_task {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.sleep();
        dog.voice();
        cow.eat();

        cow.action();
        cat.action();
    }
}
