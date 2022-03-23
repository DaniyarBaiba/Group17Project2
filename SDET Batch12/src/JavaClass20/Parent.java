package JavaClass20;

public class Parent {
    private String name; //private members dont participate in inheritance
    int age;
    protected double weigth;
    public String color;
}
class child extends Parent {
    void printInfo() {
        //System.out.println(name);
        System.out.println(age);
        System.out.println(weigth);
        System.out.println(color);
    }
}

