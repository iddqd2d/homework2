package immutability;

public final class Car {
    private final String name;
    private final Wheel wheel;

    Car(String name, Wheel wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public Wheel getWheel() {
        try {
            return (Wheel) wheel.clone();
        } catch (CloneNotSupportedException ex) {
            ex.fillInStackTrace();
        }
        return null;
    }


}
