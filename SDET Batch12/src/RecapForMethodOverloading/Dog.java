package RecapForMethodOverloading;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weigth;

    Dog () {
        System.out.println("No argument constructor");
    }

    Dog (String name) {
        this.name=name;
    }
    public Dog (String name, String color, String breed, int age, double weigth) {
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
        this.weigth=weigth;
    }
    void changeInfo (String name) {
        this.name=name;
    }
    void changeInfo(String name, String color) {
        this.name=name;
        this.color=color;
    }
}
