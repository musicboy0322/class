package boxtest;

import java.util.Arrays;

public class Box3 extends BoxBoss{

    public Box3() {
        length = 10;
        width = 10;
        height = 10;
    }

    @Override
    public Boolean compare(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public int len(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[2];
    }

    public int wid(int a, int b, int c) {
        int[] numbers = {a, b ,c};
        Arrays.sort(numbers);
        return numbers[1];
    }

    public int hie(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[0];
    }

}
