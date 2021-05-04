package boxtest2;

public class Box {

   int length;
   int width;
   int height;

    public Boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }




}
