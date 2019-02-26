package builder;

public class Computer {
    private String motherBoard;
    private String videoAdapter;
    private int memory;
    private int core;


    public static class Builder {
        private Computer newComputer;

        public Builder() {
            newComputer = new Computer();
        }

        public Builder withMotherBoard(String motherBoard) {
            newComputer.motherBoard = motherBoard;
            return this;
        }

        public Builder withVideoAdapter(String videoAdapter) {
            newComputer.videoAdapter = videoAdapter;
            return this;
        }

        public Builder withMemory(int memory) {
            newComputer.memory = memory;
            return this;
        }

        public Builder withCore(int core) {
            newComputer.core = core;
            return this;
        }


        public Computer build() {
            return newComputer;
        }
    }

    @Override
    public String toString() {
        return "computer equipment:"
                + "\nmb:" + motherBoard
                + "\nvga:" + videoAdapter
                + "\nhdd:" + memory
                + "\ncore:" + core;
    }
}
