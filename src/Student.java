import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", grade='" + grade + '\'' + '}';
    }

}

class StudentManager {
    private ArrayList<Student> studentList;

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Alice", 20, "A"));
        manager.addStudent(new Student("Bob", 21, "B"));
        manager.addStudent(new Student("Charlie", 19, "A"));

        System.out.println("Students:");
        manager.iterateStudents();

        Student studentToRemove = manager.getStudent(1);
        if (studentToRemove != null) {
            boolean removed = manager.removeStudent(studentToRemove);
            if (removed) {
                System.out.println("\nStudent removed successfully.");
            } else {
                System.out.println("\nStudent removal failed.");
            }
        }

        System.out.println("\nSize of student list: " + manager.getSize());

    }
    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean removeStudent(Student student) {
        return studentList.remove(student);
    }

    public Student getStudent(int index) {
        if (index >= 0 && index < studentList.size()) {
            return studentList.get(index);
        }
        return null;
    }

    public void iterateStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public int getSize() {
        return studentList.size();
    }
}
