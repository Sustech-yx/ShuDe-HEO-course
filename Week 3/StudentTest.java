package HEO_course.week3;

import java.io.*;
import java.util.*;

public class StudentTest {
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) {
        // test1();
        test2();
        // test3();
        out.close();
    }
    static void test1 () {
        Student a = null;
        out.println(a.name);
    }
    static void test2 () {
        Student a = new Student("", "", null);
        Student b = new Student("YX", "11912013", Gender.Masculinity);
        a.programming();
        // System.out.println(a.SID);
        out.println(a.name);
        out.println(a.getGender());
        out.println(a.toString());
        for (int i = 0; i < 99; i++) {
            b.study();
        }
        out.println(b.toString());
        out.println(a.compareTo(b));
        b.setSID("1234");
        out.println(b.toString());
    }
    static void test3 () {
        Student[] students = new Student[10];
        Random random = new Random();
        int t;
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("name" + i, i + "", i % 2 == 0 ? Gender.Masculinity : Gender.Femininity);
            t = random.nextInt(10);
            for (int j = 0; j < t; j++) {
                students[i].study();
            }
        }
        out.println("Before sorting:");
        for (Student student : students) {
            out.println(student.toString());
        }
        Arrays.sort(students);
        out.println("After sorting:");
        for (Student student : students) {
            out.println(student.toString());
        }//>_<
    }
}
