package practice.grade;

public abstract class Student {

    int math;
    int english;
    String name;
    String id;

    public Student() {
        super();
    }
//    public Student(String name, String id, int math, int english) {
//        this.id = id;
//        this.name = name;
//        this.math = math;
//        this.english = english;
//    }

    public abstract void print();

}
