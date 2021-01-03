import java.util.Scanner;

public class Main {
    public static TeacherManager teacherManager = new TeacherManager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new teacher");
            System.out.println("2. Display teachers who has greater than or equal of salary to 8000000VND");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewTeacher();
                    break;
                case 2:
                    teacherManager.displayTeacher();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    public static void addNewTeacher() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter birthday");
        String birthday = scanner.nextLine();
        System.out.println("Enter country");
        String country = scanner.nextLine();
        System.out.println("Enter fixedSalary");
        int fixedSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter bonusSalary");
        int bonusSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter penaltySalary");
        int penaltySalary = Integer.parseInt(scanner.nextLine());
        Teacher teacher = new Teacher(name, birthday, country, fixedSalary, bonusSalary, penaltySalary);
        teacherManager.addNewTeacher(teacher);
    }

}
