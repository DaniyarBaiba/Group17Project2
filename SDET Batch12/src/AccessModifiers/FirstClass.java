package AccessModifiers;

public class FirstClass {
    private String name="Naughty Tarik";
    int age=50; // default access
    protected double weigth=50;
    public String color="white";

    public static void main(String[] args) {
        FirstClass am=new FirstClass();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weigth);
        System.out.println(am.color);
        //there are 4 types of access in java that we can define using three kw:



    }
}
