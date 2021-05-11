package first.list;

import java.util.TreeSet;

public class SetTester {

    public static void main(String[] args) {

        TreeSet<String> aa = new TreeSet<>();
        aa.add("Hello");
        aa.add("Bro");
        System.out.println(aa);
        for (String a : aa) {
            System.out.println(a);
        }
        for (String b : aa) {
            System.out.println(b);
        }


    }
}
