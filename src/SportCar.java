public class SportCar extends Car {
    private int speed;

    public SportCar(String name, int yearOfRelease, int speed, CarColor CarColor, CarTechnics CarTechnics) {
        super(name, yearOfRelease, CarColor, CarTechnics);
        this.speed = speed;

    }

    public final void method() {
        System.out.println("The Car is for sale");
    }

    public void method(String method) {
        System.out.println(method);
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nspeed " + speed;
    }

}
