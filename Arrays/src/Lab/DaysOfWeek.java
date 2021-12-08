package Lab;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] arr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
                , "Sunday"};
        if (num >= 1 && num <= 7) {
            System.out.println(arr[num-1]);
        }else{
            System.out.println("Invalid Day!");
        }
    }
}

