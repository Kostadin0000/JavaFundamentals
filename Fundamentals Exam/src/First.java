import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountPerWorker = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int rivalsBiscuitsPerMonth = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                sum += (amountPerWorker * 0.75) * countWorkers;
            } else {
                sum += amountPerWorker * countWorkers;

            }
        }
        System.out.printf("You have produced %d biscuits for the past month.%n", sum);
        if (sum > rivalsBiscuitsPerMonth) {
            int sum1 = sum - rivalsBiscuitsPerMonth;
            double sum2 = 1.0 * sum1 / rivalsBiscuitsPerMonth * 100;
            System.out.printf("You produce %.2f percent more biscuits.", sum2);
        } else {
            int sum3 = rivalsBiscuitsPerMonth - sum;
            double sum4 = (1.0 * sum3 / rivalsBiscuitsPerMonth) * 100;
            System.out.printf("You produce %.2f percent less biscuits.", sum4);
        }

    }
}
