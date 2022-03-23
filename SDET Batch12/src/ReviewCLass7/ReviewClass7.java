package ReviewCLass7;

public class ReviewClass7 {

        String emnNAme="Tarik";
        int empID=12345;
        String group;                // void non returnable

    void employeeDetails () {
        System.out.println("This method shows the details of the employee");
    }
    void employeeGroup() {
        System.out.println("This method shows the group of the employee");
    }

    public static void main(String[] args) {
        ReviewClass7 obj=new ReviewClass7();
        obj.employeeGroup();
        obj.employeeDetails();
    }
}
