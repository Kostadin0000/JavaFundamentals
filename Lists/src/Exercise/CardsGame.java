package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumPlayer1 = 0;
        int sumPlayer2 = 0;


        while (player1.size() > 0 && player2.size() > 0) {
            int currentPlayer1 = player1.get(0);
            int currentPlayer2 = player2.get(0);
            if (currentPlayer1 > currentPlayer2) {
                player1.remove(Integer.valueOf(currentPlayer1));
                player1.add(currentPlayer1);
                player1.add(currentPlayer2);
                player2.remove(Integer.valueOf(currentPlayer2));

            } else if (currentPlayer1 < currentPlayer2) {
                player2.remove(Integer.valueOf(currentPlayer2));
                player2.add(currentPlayer2);
                player2.add(currentPlayer1);
                player1.remove(Integer.valueOf(currentPlayer1));

            } else {
                player1.remove(Integer.valueOf(currentPlayer1));
                player2.remove(Integer.valueOf(currentPlayer2));

            }
            if (player1.size() == 0) {
                for (int k = 0; k <= player2.size() - 1; k++) {
                    int current = player2.get(k);
                    sumPlayer2 += current;
                }
                System.out.printf("Second player wins! Sum: %d", sumPlayer2);
                break;

            } else if (player2.size() == 0) {
                for (int k = 0; k <= player1.size() - 1; k++) {
                    int current = player1.get(k);
                    sumPlayer1 += current;
                }
                System.out.printf("First player wins! Sum: %d", sumPlayer1);
                break;
            }
        }
    }
}
 
 