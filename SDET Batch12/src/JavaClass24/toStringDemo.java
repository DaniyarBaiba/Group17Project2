package JavaClass24;

public class toStringDemo {
    String name;
    int age;
    toStringDemo (String name, int age) {
        this.name=name;
        this.age=age;
    }
@Override
public String toString () {
        return name+" "+age;
}
    public static void main(String[] args) {
        toStringDemo toStringDemo=new toStringDemo("aizhan", 20);
        System.out.println(toStringDemo.toString());

    }
}
