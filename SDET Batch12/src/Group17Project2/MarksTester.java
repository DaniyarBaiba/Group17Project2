package Group17Project2;

public class MarksTester {
    public static void main(String[] args) {
        System.out.println("Average of student A : " + new A(95,96,97).getPercentage());
        System.out.println("Average of student B : "+new B(100,80, 90).getPercentage());
    }
}
//We have to calculate the average of marks obtained
//        in three subjects by student A and by student B.
//        Create   class   'Marks'   with   an   abstract   method
//        'getPercentage' that will be returning the average
//        percentage   of   marks.   Provide   implementation   of
//abstract   method   in   classes   'A'   and   'B'.   The
//        constructor of student A takes the marks in three
//        subjects as its parameters and the marks in four
//        subjects as its parameters for student B. Test your
//        code