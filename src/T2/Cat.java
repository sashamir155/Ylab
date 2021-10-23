package T2;

public class Cat extends Animal{

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void voice() {
        System.out.println("Meow");
    }

    @Override
    protected String setAnimal() {
        return "Кошка ";
    }

}
