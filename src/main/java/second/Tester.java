package second;

public class Tester {

    public static void main(String[] args) {

        WeatherReporter1 wr1 = new WeatherReporter1();
        Weatherreporter2 wr2 = new Weatherreporter2();

        Reporter reporter1 = new Reporter() {
            @Override
            public void print() {
                System.out.println("Ding Don");
            }
        };

        Reporter reporter2 = new Reporter() {
            @Override
            public void print() {
                System.out.println("HeHeHeHe");
            }
        };

        reporter1.print();
        reporter2.print();

        wr1.print();
        wr2.print();




    }
}
