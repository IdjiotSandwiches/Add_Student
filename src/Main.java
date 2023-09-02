import java.util.*;
import Student.*;

public class Main {
    static Scanner o = new Scanner(System.in);

    static Vector<ClassOne> classOne = new Vector<>();
    static Vector<ClassTwo> classTwo = new Vector<>();
    static Vector<ClassThree> classThree = new Vector<>();
    public static void main(String[] args) {
        cls();
        int input;
        
        do {
            input = mainMenu();
            switch(input){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 0:
                    o.close();
                    exitScreen();
                    break;
            }

        } while(input != 0);
        
    }

    // Main Menu
    static int mainMenu() {
        cls();
        do {
            System.out.println("Student Adding System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("0. Exit");
            System.out.print(">> ");
            int input = o.nextInt();

            if(input >= 0 && input <= 2)
                return input;
            else
                System.out.println("Input a valid value!...");

            System.out.println();
                
        } while(true);
    }

    // Add Student Menu
    static int addStudentMenu() {
        do {
            System.out.println("Student Classes:");
            System.out.println("1. Class One");
            System.out.println("2. Class Two");
            System.out.println("3. Class Three");
            System.out.print(">> ");
            int input = o.nextInt();

            if(input >= 0 && input <= 3)
                return input;
            else
                System.out.println("Input a valid value!...");

            System.out.println();

        } while(true);
    }

    static void addStudent() {
        cls();
        int input = addStudentMenu();
        cls();
        switch(input){
            case 1:
                classOne.add(new ClassOne());
                break;
            case 2:
                classTwo.add(new ClassTwo());
                break;
            case 3:
                classThree.add(new ClassThree());
                break;
        }
        
    }

    // View Students
    static int viewStudentMenu() {
        do {
            cls();
            System.out.println("View by: ");
            System.out.println("1. Class One");
            System.out.println("2. Class Two");
            System.out.println("3. Class Three");
            System.out.println("4. View All");
            System.out.print(">> ");
            int input = o.nextInt();

            if(input >= 0 && input <= 4)
                return input;
            else
                System.out.println("Input a valid value!...");

            System.out.println();

        } while(true);
    }
    
    static void viewStudent() {
        // Declare student using Student class to add all data from other extended classes
        Vector<Student> student = new Vector<>();
        for(ClassOne classOne : classOne)
            student.add(classOne);
        for(ClassTwo classTwo : classTwo)
            student.add(classTwo);
        for(ClassThree classThree : classThree)
            student.add(classThree);

        // Sort student data
        Collections.sort(student, new Comparator<Student>() {
            public int compare(Student a, Student b){
                return a.getName().compareTo(b.getName());
            }
        });

        int input = viewStudentMenu();
        // Catch newline
        o.nextLine();
        
        cls();

        System.out.println("Name            Class");

        switch(input){
            case 1:
                if(classOne.isEmpty())
                    System.out.println("List is Empty!");
                else{
                    for (ClassOne classOne : classOne) 
                        System.out.printf("%-15s %-2d\n", classOne.getName(), classOne.getStudentClass());
                }

                System.out.print("Press ENTER to continue...");
                o.nextLine();
                break;

            case 2:
                if(classTwo.isEmpty())
                    System.out.println("List is Empty!");
                else{
                    for (ClassTwo classTwo : classTwo) 
                        System.out.printf("%-15s %-2d\n", classTwo.getName(), classTwo.getStudentClass());
                }
                
                System.out.print("Press ENTER to continue...");
                o.nextLine();
                break;

            case 3:
                if(classThree.isEmpty())
                    System.out.println("List is Empty!");
                else{
                    for (ClassThree classThree : classThree) 
                        System.out.printf("%-15s %-2d\n", classThree.getName(), classThree.getStudentClass());
                }

                System.out.print("Press ENTER to continue...");
                o.nextLine();
                break;

            case 4:
                if(student.isEmpty())
                    System.out.println("List is Empty!");
                else{
                    for(Student students : student)
                        System.out.printf("%-15s %-2d\n", students.getName(), students.getStudentClass());
                }

                System.out.print("Press ENTER to continue...");
                o.nextLine();
                break;
        }

    }

    // Exit Screen
    static void exitScreen() {
        System.out.println("Bye...");
        System.exit(0);
    }

    // ClearScreen
    static void cls() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  

}
