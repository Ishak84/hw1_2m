public final class CarSnow extends SportCar {
    private String production;

    public CarSnow(String name, int yearOfRelease, int speed, CarTechnics CarTechnics, CarColor CarColor, String production) {
        super(name, yearOfRelease, speed, CarColor, CarTechnics);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nproduction " + production;
    }

}
