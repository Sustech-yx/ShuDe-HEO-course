package HEO_course.week3;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    // 成员变量
    public String name;
    private int ability;
    private String SID;
    private Gender gender;
    private static int Student_Number = 0;

    // 构造器
    private Student () {
        ability = 0;
        Student_Number ++;
    }
    public Student (String name, String SID, Gender gender) {
        this();
        this.name = name;
        this.SID = SID;
        this.gender = gender;
        // this.ability = 0;
    }

    // 方法
    public void study () {
        this.ability ++;
    }
    public void programming () {
        this.ability += 100;
    }
    public static int getStudent_Number () {
        return Student_Number;
    }

    @Override // 方法的重写，标识符
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ability=" + ability +
                ", SID='" + SID + '\'' +
                ", gender=" + gender +
                '}';
    }
    // java中的所有类都继承自Object类，同样的，也可以重载Object类的toString方法。
    @Override
    public int compareTo(Student o) {
        return Comparator.comparingInt(Student::getAbility).compare(this, o);
    }

//    如果指定的数与参数相等返回0;
//    如果指定的数小于参数返回-1;
//    如果指定的数大于参数返回1;

    // 操纵数据
    public void setName(String name) {
        this.name = name;
    }


    public Gender getGender() {
        return gender;
    }
    public int getAbility() {
        return ability;
    }
    public String getName() {
        return name;
    }
}
