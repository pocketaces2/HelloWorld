import java.util.Calendar;

public class GoodbyeWorld {
    public static void main(String args[]) {

        while (true) {
            System.out.println("always running program ==> " + Calendar.getInstance().getTime());
            System.out.println("Goodbye World!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }
}
