package racing;

public class Racing {

    public static void main(String[] args) {
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        horse1.start();
        horse2.start();
        HorseRunnable horseRunnable = new HorseRunnable();
        Thread thread = new Thread(horseRunnable);
        thread.start();


    }


}
