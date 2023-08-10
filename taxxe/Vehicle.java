package taxxe;

public class Vehicle {
    private int id, capacity;
    private double price;
    private String owner, description;

    Vehicle() {

    }

    Vehicle(int carId, int capacity, double price, String owner, String description) {
        id = carId;
        this.capacity = capacity;
        this.price = price;
        this.owner = owner;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double tinhThue() {
        double carTax;
        if (capacity < 100) {
            carTax = (price * 1) / 100;
        } else if (capacity > 200) {
            carTax = (price * 5) / 100;
        } else {
            carTax = (price * 3) / 100;
        }
        return carTax;
    }

    public void inThue() {
        System.out.printf("%6d %5d %10.1f %10s %8s %10.0f \n", id, capacity, price, owner, description, tinhThue());
    }
}
