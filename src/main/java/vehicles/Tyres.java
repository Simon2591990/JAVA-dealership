package vehicles;

public class Tyres {
    private int numberOfTyres;
    private String brand;

    public Tyres(int numberOfTyres, String brand) {
        this.numberOfTyres = numberOfTyres;
        this.brand = brand;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
