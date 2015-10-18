public class Volkshagen extends Car implements FlyingCar {
    public Volkshagen() {
        super(4, 2);
    }

    public void fly() {
        System.out.println("watch me fly");
    }
}
