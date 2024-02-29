package object1;

public class Car {
    private String color;
    private String model;
    private int year;
    private int mileage;

    public Car(String color, String model, int year, int mileage) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
