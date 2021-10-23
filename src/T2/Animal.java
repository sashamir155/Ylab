package T2;

import java.io.IOException;
import java.util.Scanner;

public abstract class Animal {
    public abstract void eat();

    public abstract void sleep();

    public abstract void voice();

    String animal;

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void action(){
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();
            if (action.equals("voice")) {
                System.out.println(setAnimal() + "не может подать голос, она спит");
            } else if (action.equals("eat")) {
                System.out.println(setAnimal() + "проснулась");
            } else try {
                throw new IOException();

        } catch (IOException e) {
            System.out.println("Вы ввели недопустимую команду. Введите voice или eat");
        }
    }

    protected abstract String setAnimal();
}
