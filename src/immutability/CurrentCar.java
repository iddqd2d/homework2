package immutability;

public class CurrentCar {
    public static void main(String[] args) {
        Car car = new Car("Zaz", new Wheel(9));
        car.getWheel().setSize(19);
        System.out.println(car.getWheel().getSize());

    }
}
