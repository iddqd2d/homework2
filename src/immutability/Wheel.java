package immutability;

public class Wheel implements Cloneable {
    private int size;


    Wheel(int size) {
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
