public class Car {
    private String name;
    private int yearOfRelease;
    private CarColor CarColor;
    private CarTechnics CarTechnics;

    public Car (String name, int yearOfRelease, CarColor CarColor, CarTechnics CarTechnics) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.CarColor = CarColor;
        this.CarTechnics = CarTechnics;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public CarColor getCarColor() {
        return CarColor;
    }

    public CarTechnics getCarTechnics() {
        return CarTechnics;
    }

    public String getInfo() {
        return "\nCar color" + CarColor +
                "\nName" + name +
                "\nYear of Release" + yearOfRelease +
                "\nCar Technics address" + CarTechnics.getAddress() +
                "\nCar Technics number" + CarTechnics.getNumber();
    }

}

