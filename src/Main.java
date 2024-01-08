public class Main {
    public static void main(String[] args) {
        CarTechnics CarTechnics = new CarTechnics("", 231);
        CarSnow carsnow = new CarSnow("BMW", 2003, 500, CarTechnics, CarColor.BLUE, "Germany");
        SportCar sportCar = new SportCar("Mersedes", 2001, 380, CarColor.RED, CarTechnics);

        System.out.println(carsnow.getInfo());
        System.out.println();
        System.out.println(sportCar.getInfo());
        System.out.println();
        carsnow.method();
        System.out.println();
        sportCar.method();
        System.out.println("speed");
    }
}
