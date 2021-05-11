package first.boxtest1;


public abstract class BoxBoss {

    int length;
    int width;
    int height;

    public BoxBoss() {
        super();
    }

    /*
    public BoxBoss(int length, int width, int height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    */

    public Boolean compare(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public abstract int len(int a , int b, int c);
    public abstract int wid(int a , int b, int c);
    public abstract int hie(int a , int b, int c);

}
