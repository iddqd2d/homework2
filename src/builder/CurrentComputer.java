package builder;

public class CurrentComputer {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .withCore(3)
                .withMemory(500)
                .withMotherBoard("ASUS")
                .withVideoAdapter("Radeon")
                .build();

        System.out.println(myComputer);
    }
}
