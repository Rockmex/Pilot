package CoreJava.OOP;

import java.util.*;

// Implement the (in-class) PARKING LOT OOP design system -> your implementation should include main method and is runnable.
public class ParkingLot {

    private final int capacity;
    private int occupied;
    private int smallLotCapacity;
    private int mediumLotCapacity;
    private int largeLotCapacity;
    private long smallLotPrice;
    private long mediumLotPrice;
    private long largeLotPrice;
    private Set<Lot> smallLots = new HashSet<>();
    private Set<Lot> mediumLots = new HashSet<>();
    private Set<Lot> largeLots = new HashSet<>();
    private Map<Car, Lot> map = new HashMap<>();

    public ParkingLot(int capacity, int smallLotCapacity, int mediumLotCapacity, int largeLotCapacity, long smallLotPrice, long mediumLotPrice, long largeLotPrice ) {
        this.capacity = capacity;
        this.occupied = 0;
        this.smallLotCapacity = smallLotCapacity;
        this.mediumLotCapacity = mediumLotCapacity;
        this.largeLotCapacity = largeLotCapacity;
        this.smallLotPrice = smallLotPrice;
        this.mediumLotPrice = mediumLotPrice;
        this.largeLotPrice = largeLotPrice;
    }

    public void Park(Car car) {
        if (occupied == capacity) {
            System.out.println("Parking lot is full!");
        } else {
            String carType = car.getCarType();
            switch (carType) {
                case "small":
                    if (smallLots.size() == smallLotCapacity) {
                        System.out.println("Small lots are full!");
                    } else {
                        Lot lot = new Lot(smallLots.size() + 1, "small", new Date(), car);
                        smallLots.add(lot);
                        occupied++;
                        map.put(car, lot);
                        System.out.println("Car " + car + " is Parked at lot " + lot.getLotType() + lot.getLotId());
                    }
                    break;
                case "medium":
                    if (mediumLots.size() == mediumLotCapacity) {
                        System.out.println("Medium lots are full!");
                    } else {
                        Lot lot = new Lot(mediumLots.size() + 1, "medium", new Date(), car);
                        mediumLots.add(lot);
                        occupied++;
                        map.put(car, lot);
                        System.out.println("Car " + car + " is Parked at lot " + lot.getLotType() + lot.getLotId());
                    }
                    break;
                case "large":
                    if (largeLots.size() == largeLotCapacity) {
                        System.out.println("Large lots are full!");
                    } else {
                        Lot lot = new Lot(largeLots.size() + 1, "large", new Date(), car);
                        largeLots.add(lot);
                        occupied++;
                        map.put(car, lot);
                        System.out.println("Car " + car + " is Parked at lot " + lot.getLotType() + lot.getLotId());
                    }
                    break;
            }
        }
    }

    public void Checkout(Car car) {
        Lot lot = map.get(car);
        long hoursParked = ((new Date().getTime() - lot.getStartTime().getTime()) / (1000 * 60 * 60)) % 24;
        long cost;
        String carType = car.getCarType();
        if (carType.equalsIgnoreCase("small")) {
            cost = smallLotPrice * hoursParked;
            smallLots.remove(lot);
        } else if (carType.equalsIgnoreCase("medium")) {
            cost = mediumLotPrice * hoursParked;
            mediumLots.remove(lot);
        } else {
            cost = largeLotPrice * hoursParked;
            largeLots.remove(lot);
        }
        map.remove(car);
        occupied--;
        System.out.println("You parked " + hoursParked + " hours in a " + carType + " lot. Your payment is: " + cost + " dollars.");
    }



}

class Lot {
    private int lotId;
    private String lotType;
    private Date startTime;
    private Car car;

    public Lot(int lotId, String lotType, Date startTime, Car car) {
        this.lotId = lotId;
        this.lotType = lotType;
        this.startTime = startTime;
        this.car = car;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public String getLotType() {
        return lotType;
    }

    public void setLotType(String lotType) {
        this.lotType = lotType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

class Car {
    private String carPlate;
    private String carColor;
    private String carBrand;
    private String carType;

    @Override
    public String toString() {
        return carType + " " + carColor + " " + carBrand + " (" + carPlate + ")";
    }

    public Car(String carPlate, String carColor, String carBrand, String carType) {
        this.carPlate = carPlate;
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.carType = carType;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

class Run {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(300, 100, 100, 100, 10, 20, 30);
        Car car1 = new Car("P1234", "Red", "BMW", "small");
        Car car2 = new Car("P1235", "White", "BMW", "medium");
        Car car3 = new Car("P1236", "Black", "Benz", "small");
        Car car4 = new Car("P1237", "Black", "Honda", "large");
        parkingLot.Park(car1);
        parkingLot.Park(car2);
        parkingLot.Park(car3);
        parkingLot.Park(car4);
        parkingLot.Checkout(car3);
    }
}
