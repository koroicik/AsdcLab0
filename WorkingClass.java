package ASDCLab0;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WorkingClass {

    private static final File file = new File("C:\\MyLesson\\src\\ASDCLab1\\DataBase.txt");


    public static List<Student> readFromFIle() {
        List<Student> list = new LinkedList<>();
        try (Reader bufferedReader = new BufferedReader(new FileReader(new File(file.toURI())));) {
            // try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\MyLesson\\src\\ASDCLab1\\DataBase.txt"));) {
            String headerOfFile = ((BufferedReader) bufferedReader).readLine();
            String line = ((BufferedReader) bufferedReader).readLine();
            String[] lineArray = new String[6];
            while (line != null) {
                lineArray = line.split(",");
                list.add(new Student(
                        Integer.parseInt(lineArray[0]),
                        lineArray[1],
                        lineArray[2],
                        Integer.parseInt(lineArray[3]),
                        Integer.parseInt(lineArray[4]),
                        Integer.parseInt(lineArray[5])
                        )
                );
                line = ((BufferedReader) bufferedReader).readLine();
            }
        } catch (Exception e) {
            System.out.println("We have an exception!");
        }
        return list;
    }

    public static void showStudentArrayList(@NotNull List<Student> list) {
        for (Student st: list) {
            System.out.println(st.toString());
        }
    }
}