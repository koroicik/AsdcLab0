package ASDCLab0;



import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        list = WorkingClass.readFromFIle();

        WorkingClass.showStudentArrayList(list);
        Student student = new Student(list.get(49));


        try {
            Student newStudent = student.clone();
            System.out.println(newStudent);
            System.out.println(newStudent.equals(student));
        } catch (CloneNotSupportedException e) {
            System.out.println("We have a big problem!");
            e.printStackTrace();
        }

        Student secondStudent = new Student(list.get(48));

        try {
            Student newStudent = secondStudent.copy();
            System.out.println(newStudent);
            System.out.println(newStudent.equals(secondStudent));
        } catch (Exception e) {
            System.out.println("We have a big problem!");
            e.printStackTrace();
        }
    }
}