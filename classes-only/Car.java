public class Car {
    private int wheels;
    private int wings;

    public Car(int wheels, int wings) {
        this.wheels = wheels;
        this.wings = wings;
    }

    public boolean drives() {
        return this.wheels > 0;
    }

    public boolean flies() {
        return this.wings > 0;
    }

    public void drive() throws Exception {
        throw new Exception("implement driving");
    }

    public void fly() throws Exception {
        throw new Exception("implement flying!");
    }
}
