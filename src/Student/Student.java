package Student;
import java.util.*;

public class Student {
    private String name;
    private int studentClass;
    Scanner o = new Scanner(System.in);


    public String getName() {
        return name;
    }
    public void setName() {
        boolean checkName = false;
        do{
            System.out.print("Input student name [Alphabet only!]: ");
            String name = o.nextLine();
    
            for(int i = 0; i < name.length(); i++){
                if((name.charAt(i) < 'A' && name.charAt(i) > 'Z') && (name.charAt(i) < 'a' && name.charAt(i) > 'z') && name.charAt(i) != ' '){
                    checkName = false;
                    break;
                }
                else
                    checkName = true;
            }
    
            if(checkName == true)
                this.name = name;
            else
                System.out.println("Input a valid value!...");
    
            System.out.println();
    
        } while(checkName == false);

    }

    public int getStudentClass() {
        return studentClass;
    }
    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }
    
}
