package JavaClass22;

public class ClassAA {
    String name;
    int age;
    double weigth;

    public ClassAA(String name, int age, double weigth ) {
        this.name=name;
        this.age=age;
        this.weigth=weigth;

    }
    void printInfo() {
        System.out.println(name+" "+age+" "+weigth);
    }

}
class ClassBB extends ClassAA {
    public ClassBB(String name, int age, double weigth) {
        super(name, age, weigth);
    }

    }

class Test {
    public static void main(String[] args) {
        ClassBB classBB = new ClassBB("Tristan", 25, 65);
        classBB.printInfo();


    }
}