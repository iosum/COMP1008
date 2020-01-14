package Lab1;

import java.util.Date;

public class Car {
    private String model;
    private String vinNumber;
    private String make;
    private String color;
    private String engine;
    private Date year;
    private double price;
    private String transmission;



    public Car(String model, String vinNumber, String make, Date year, double price, String transmission, String color, String engine) {
        setModel(model);
        setVinNumber(vinNumber);
        setMake(make);
        setYear(year);
        setPrice(price);
        setTransmission(transmission);
        setColor(color);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0.0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("price must be greater than 0");
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String toString() {
        return String.format("%s %s");
    }
}
