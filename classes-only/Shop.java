public class Shop {
    public static void tryParachute(Car car) throws Exception {
        if (car.flies()) {
            System.out.println("take a parachute");
            car.fly();
        } else {
            System.out.println("no wings, no parachute!");
        }
    }
}
