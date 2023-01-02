public class Main {
    public static void main(String[] args) {

    PassCar passCar1 = new PassCar("BMW", "", 3.8F, true);
    PassCar passCar2 = new PassCar("Audi", "A6", 3.8F, false);
    PassCar passCar3 = new PassCar("Mercedes", "S100", 3.8F, true);
    PassCar passCar4 = new PassCar("Nissan", "Patrol", 3.8F, false);

    Truck truck1 = new Truck("BMW", "", 3.8F, false);
    Truck truck2 = new Truck("Audi", "A6", 3.8F, false);
    Truck truck3 = new Truck("Mercedes", "S100", 3.8F, true);
    Truck truck4 = new Truck("Nissan", "Patrol", 3.8F, false);

    Bus bus1 = new Bus("BMW", "", 3.8F, false);
    Bus bus2 = new Bus("Audi", "A6", 3.8F, false);
    Bus bus3 = new Bus("Mercedes", "S100", 3.8F, true);
    Bus bus4 = new Bus("Nissan", "Patrol", 3.8F, false);

    bus4.setMODEL("abc");

        System.out.println(passCar1.toString());
        System.out.println(passCar2.toString());

        passCar1.stopMoving();
        System.out.println(passCar1.toString());

        passCar2.stopMoving();

        System.out.println(bus4.toString());
    }
}