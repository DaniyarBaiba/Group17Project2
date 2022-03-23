package JavaClass22;

public class MetjodOverloading2 {
    void printInfo(String name, int age, double weigth) {
        System.out.println(name+""+age+""+weigth);
    }
    void printInfo(int age, String name, double weigth) {
        System.out.println(name+""+age+""+weigth);
    }
    void printInfo(int age,  double weigth, String name) {
        System.out.println(name+""+age+""+weigth);
    }
    void printInfo( double weigth, int age, String name) {
        System.out.println(name+""+age+""+weigth);
    }

    public static void main(String[] args) {
        MetjodOverloading2 metjodOverloading2=new MetjodOverloading2();
        metjodOverloading2.printInfo(28.0, 16, "Aizhan");
    }
}
