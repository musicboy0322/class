package list;

import boxtest1.Box;

import java.util.ArrayList;

public class ListTester {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("happy");
        list.add(123);
        Box box = new Box();
        list.add(box);
        System.out.println(list);
//        Double double = (Double)2.5;
//        System.out.println(double);
        Integer n = 123;
        Boolean b = true;
        Byte c = 2;
        Short d = 4;
        System.out.println(d);
    }

}
