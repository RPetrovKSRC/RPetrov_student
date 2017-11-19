package patterns;

public class Main {
    public static void main(String[] args) {

        Factory factory1 = FactorySingleton.getFactory("JP");
        Factory factory2 = FactorySingleton.getFactory("EN");

        Car car1 = factory1.createCar();
        Car car2 = factory2.createCar();

        System.out.println("car1 " + car1.drive(1000, 10) + " km");
        System.out.println("car2 " + car2.drive(1000, 10) + " km");

//        Pizza margarita = new Pizza
//                .Builder(200)
//                .cheeze("Моцарелла")
//                .meat("chiken")
//                .build();
//
//        System.out.println("End");
    }
}
