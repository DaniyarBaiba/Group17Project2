package Class17;

public class HealthyDog {
    static String name; //instance
    String color; //instance
    static int numbersOfLegs; static

    void eat () {
        int noOfTimes=3; //local
        System.out.println(name+" eat "+noOfTimes);
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); //local
        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numbersOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="Tomy";
        dog2.color="Navi blue";
        HealthyDog.numbersOfLegs=4;
        dog2.eat();


    }
}
