package materialsjonery.Car;

public class Car {
    private String color;
    private int maxSpeed;
    private String brand;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is : %d, car brand is: %s", color, maxSpeed, brand));
    }
//    Car car1 =new Car();
//        this.car1 = car1;
//        car1.setBrand("Mersedes");
//        car1.setColor("white");
//        car1.setMaxSpeed(250);
//        car1.printCarParameters();


//    Car car2 =new Car()
//        this.car2 = car2;
//        car2.setBrand("Mersedes");
//        car2.setColor("white");
//        car2.setMaxSpeed(250);
//        car2.printCarParameters();



}

