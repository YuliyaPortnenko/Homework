public class Main {
    public static void main(String[] args) {
        BMWCar bmw = new BMWCar(
        50000,
        300,
         "320i",
                4,
                "special wheel"
        );

//        Car car = new Car(
//                400000,
//                250,
//                "Tavriya 123",
//                5
//        );

        Tesla tesla = new Tesla(
                1000000,
                320,
                "Mode X",
                4,
                100
        );

        //System.out.println("car = " + car.getMode());
        System.out.println("bmw = " + bmw.getMode());
        System.out.println("bmw = " + tesla.getMode());

        tesla.sell();
        bmw.sell();
        tesla.buy();



    }
}

