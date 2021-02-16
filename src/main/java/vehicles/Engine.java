package vehicles;

public class Engine {
    private double size;
    private int horsePower;

    public Engine(double size, int horsePower) {
        this.size = size;
        this.horsePower = horsePower;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
