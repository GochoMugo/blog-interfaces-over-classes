public class Main {
    public static void main(String args[]) {
        try {
            Car winglessCar = new Car(4, 0);
            Shop.tryParachute(winglessCar);
        } catch(Exception e) {}
    }
}
