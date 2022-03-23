package Class17;

public class Students {
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Yazgul";
        student1.id="123";
        Students.numberOfStudents++;

        Students student2=new Students();
        student2.name="Aizhan";
        student2.id="456";
        Students.numberOfStudents++;

        Students student3=new Students();
        student3.name="Sayed";
        student3.id="545";
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);;
    }
}
