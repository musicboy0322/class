package practice.stugrade;

public class Student {

    int math;
    int english;
    String name;
    String id;

    public Student() {
        super();
    }
    public Student(String name, String id, int math, int english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print() {
        System.out.println(name + "\t" + id + "\t" + math + "\t" + english);
    }

}
