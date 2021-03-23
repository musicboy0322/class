package practice.stugrade;

public class GraduateStudent extends Student {
    int thesis;

    public GraduateStudent(String name, String id, int math, int english, int thesis) {
        super(name, id ,math, english);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        System.out.println(name + "\t" + id + "\t" + math + "\t" + english + "\t" + thesis);
    }
}
