package T2;

public class Cow extends Animal{

    public void eat() {
        System.out.println("Cow is eating");
    }

    public void sleep() {
        System.out.println("Cow is sleeping");
    }

    public void voice() {
        System.out.println("Mu-u");
    }

    @Override
    protected String setAnimal() {
        return "Корова ";
    }
}
