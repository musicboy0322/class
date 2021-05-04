package boxtest1;

import java.util.Arrays;

public class Box5 extends  BoxBoss{

    public Box5() {
        length = 25;
        width = 10;
        height = 20;
    }

    @Override
    public Boolean compare(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    @Override
    public int len(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[2];
    }

    @Override
    public int wid(int a, int b, int c) {
        int[] numbers = {a, b ,c};
        Arrays.sort(numbers);
        return numbers[0];
    }

    @Override
    public int hie(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[1];
    }
}
