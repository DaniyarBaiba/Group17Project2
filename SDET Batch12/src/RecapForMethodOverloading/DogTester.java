package RecapForMethodOverloading;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        Dog dog2=new Dog("Tommy", "Green", "Redbull", 15,25.5);
        System.out.println(dog2);

    }
}