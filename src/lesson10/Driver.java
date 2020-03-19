package lesson10;

public class Driver extends Human {
    private String car;

    public Driver(String name, int age, String car) {
        super(name, age);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
