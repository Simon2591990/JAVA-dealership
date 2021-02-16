package vehicles;

public abstract class Vehicle {

    private double price;
    private String color;
    private Engine engine;
    private Tyres tyres;
    private VehicleType vehicleType;

    public Vehicle(double price, String color, Engine engine, Tyres tyres, VehicleType vehicleType) {
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.tyres = tyres;
        this.vehicleType = vehicleType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
