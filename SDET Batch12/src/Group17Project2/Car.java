package Group17Project2;

class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public Car() {

    }

    void calculateSalePrice() {
        System.out.println("The price of the car is " + carPrice + " and it is " + color);
    }
}

class Sedan extends Car {
    int length;

    public Sedan(double carPrice, int length) {
        this.carPrice = carPrice;
        this.length = length;
    }

    @Override
    void calculateSalePrice() {
        double finalPrice1;
        if (length > 20) {
            finalPrice1 = carPrice - (carPrice * 0.05);
            System.out.println("The price of a sedan is " + finalPrice1);
        } else {
            finalPrice1 = carPrice - (carPrice * 0.1);
            System.out.println("The price of a sedan is " + finalPrice1);
        }
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, double weight) {
        this.carPrice = carPrice;
        this.weight = weight;
    }

    @Override
    void calculateSalePrice() {
        double finalPrice;
        if (weight > 2000) {
            finalPrice = carPrice - (carPrice * 0.1);
            System.out.println("The price of a truck is " + finalPrice);
        } else {
            finalPrice = carPrice - (carPrice * 0.2);
            System.out.println("The price of a truck is " + finalPrice);
        }
    }
}

