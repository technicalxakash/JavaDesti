package www.com.abstraction;

abstract class Plane {
    void takeOff() {
        System.out.println("Plane is taking off...");
    }

    abstract void fly();

    void land() {
        System.out.println("Plane is landing...");
    }
}

class CargoPlane extends Plane {
    void fly() {
        System.out.println("Cargo plane flies at low altitude.");
    }

    void carryGoods() {
        System.out.println("Cargo plane carries goods.");
    }
}

class PassengerPlane extends Plane {
    void fly() {
        System.out.println("Passenger plane flies at medium altitude.");
    }

    void carryHumans() {
        System.out.println("Passenger plane carries passengers.");
    }
}

class FighterPlane extends Plane {
    void fly() {
        System.out.println("Fighter plane flies at high altitude.");
    }

    void carryWeapons() {
        System.out.println("Fighter plane carries weapons.");
    }
}

class Airport {
    void permit(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        CargoPlane cargo = new CargoPlane();
        PassengerPlane passenger = new PassengerPlane();
        FighterPlane fighter = new FighterPlane();
        Airport airport = new Airport();

        System.out.println("===== Cargo Plane =====");
        airport.permit(cargo);
        cargo.carryGoods();

        System.out.println("\n===== Passenger Plane =====");
        airport.permit(passenger);
        passenger.carryHumans();

        System.out.println("\n===== Fighter Plane =====");
        airport.permit(fighter);
        fighter.carryWeapons();
    }
}
