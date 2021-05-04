package boxtest1;

import java.util.Scanner;

public class Box {

    public static void main(String[] args) {

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your length");
        int len = scan.nextInt();
        System.out.println("Please enter your width");
        int wid = scan.nextInt();
        System.out.println("Please enter your height");
        int hei = scan.nextInt();

        if (box3.compare(box3.len(len, wid, hei), box3.wid(len, wid, hei), box3.hie(len, wid, hei))) {
            System.out.println("Use box3 to input");
            System.out.println("The cost is 60 dollars");
        }   else if (box5.compare(box5.len(len, wid, hei), box5.wid(len, wid ,hei), box5.hie(len, wid, hei))) {
            System.out.println("Use box5 to input");
            System.out.println("The cost is 90 dollars");
        }   else {
            System.out.println("There is no perfect size of box");
        }

    }



}
