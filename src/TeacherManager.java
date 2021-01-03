import java.util.ArrayList;

public class TeacherManager {
    public static final int SALARY = 8000000;
    ArrayList<Teacher> teachersList = new ArrayList<>();

    public void addNewTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }

    public void displayTeacher() {
        ArrayList<Teacher> displayTeacher = new ArrayList<>();
        for (Teacher teacher : teachersList) {
            int currentSalary = teacher.currentSalary();
            if (currentSalary >= SALARY) {
                displayTeacher.add(teacher);
            }
        }
        if (displayTeacher.isEmpty()) {
            System.out.println("Not found teachers has greater than or equal of salary to 8000000VND");
        }
        else System.out.println(displayTeacher);
    }
}
