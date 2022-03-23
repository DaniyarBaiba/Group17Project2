package JavaClass20;

public class Lion extends LionClass{
    boolean huntOthers=true;
    void roar () {
        System.out.println(name+" is roaring ="+color+huntOthers);
    }

    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.name="Alex";
        lion.color="pink";
        lion.sleep();
        lion.roar();
    }
}
