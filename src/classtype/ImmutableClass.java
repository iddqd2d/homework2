package classtype;

public class ImmutableClass {
    private final String name;

    ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        ImmutableClass ic = new ImmutableClass("I`m immutable class");
    }
}
