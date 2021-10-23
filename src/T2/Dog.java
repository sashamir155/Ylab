package T2;

public class Dog extends Animal{
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void voice() {
        System.out.println("Gav");
    }

    @Override
    protected String setAnimal() {
        return "Собака ";
    }
}
