package JavaClass19;

import jdk.swing.interop.SwingInterOpUtils;

public class Facebook {
    private String userName;
    private String password;
    private int age;
    void setAge(int personAge){
        if (personAge > 13 && personAge<120) {
            age=personAge;
        } else {
            System.out.println("Not "+"allowed it's not a horse");
        }
    }
    int getAge(String userPassword) {
        if (userPassword.equals(password)) {
            return age;
        } else {
            return -1;
        }
    }
}
