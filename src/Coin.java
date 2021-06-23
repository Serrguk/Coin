import java.util.Random;

public class Coin {

    private int eagleCount;
    private int tailsCount;

    public void throwUp(int value) {
        Random random = new Random();
        for (int i = 1; i <= value; i++) {
            int x = random.nextInt(10);
            System.out.print(i + ": ");
            if (x < 5) {
                System.out.println("Орёл");
                eagleCount++;
            } else {
                System.out.println("Решка");
                tailsCount++;
            }
        }
        System.out.println("\nОрлов: " + eagleCount + "\nРешек: " + tailsCount);
    }
}
