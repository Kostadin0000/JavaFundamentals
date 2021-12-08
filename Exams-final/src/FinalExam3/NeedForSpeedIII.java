package FinalExam3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\|");
            String name = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);
            ArrayList<Integer> arraylist = new ArrayList<>();
            arraylist.add(0, mileage);
            arraylist.add(1, fuel);
            map.put(name, arraylist);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];

            if (command.equals("Drive")) {
                String carModel = tokens[1];
                int distance = Integer.parseInt(tokens[2]);
                int fuel = Integer.parseInt(tokens[3]);
                if (map.containsKey(carModel)) {
                    for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
                        if (item.getKey().equals(carModel)) {
                            if (item.getValue().get(1) < fuel) {
                                System.out.println("Not enough fuel to make that ride");
                                break;
                            } else {
                                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carModel, distance, fuel);
                                int newDistance = item.getValue().get(0) + distance;
                                int newFuel = item.getValue().get(1) - fuel;
                                if (newDistance >= 100000) {
                                    System.out.printf("Time to sell the %s!%n", carModel);
                                    map.remove(carModel);
                                    break;
                                } else {
                                    ArrayList<Integer> newlist6 = new ArrayList<>();
                                    newlist6.add(0, newDistance);
                                    newlist6.add(1, newFuel);
                                    map.put(carModel, newlist6);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (command.equals("Refuel")) {
                String carModel2 = tokens[1];
                int newFuel2 = Integer.parseInt(tokens[2]);
                for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
                    if (map.containsKey(carModel2)) {
                        if (item.getValue().get(1) + newFuel2 >= 75) {
                            int newDistance2 = item.getValue().get(0);
                            int newfuel = 75;
                            System.out.printf("%s refueled with %d liters%n", carModel2, 75 - item.getValue().get(1));
                            ArrayList<Integer> newlist2 = new ArrayList<>();
                            newlist2.add(0, newDistance2);
                            newlist2.add(1, newfuel);
                            map.put(carModel2, newlist2);
                            break;
                        } else {
                            int newDistance3 = item.getValue().get(0);
                            int newFuel3 = item.getValue().get(1) + newFuel2;
                            System.out.printf("%s refueled with %d liters%n", carModel2, newFuel2);
                            ArrayList<Integer> newlist3 = new ArrayList<>();
                            newlist3.add(0, newDistance3);
                            newlist3.add(1, newFuel3);
                            map.put(carModel2, newlist3);
                            break;
                        }
                    }
                }
            } else if (command.equals("Revert")) {
                String carModel3 = tokens[1];
                int kms = Integer.parseInt(tokens[2]);
                for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
                    if (item.getKey().equals(carModel3)) {
                        int mileage2 = item.getValue().get(0) - kms;
                        int fuell = item.getValue().get(1);
                        if (mileage2 <= 10000) {
                            mileage2 = 10000;
                            ArrayList<Integer> newlist5 = new ArrayList<>();
                            newlist5.add(0, mileage2);
                            newlist5.add(1, fuell);
                            map.put(carModel3, newlist5);
                            break;
                        } else {
                            ArrayList<Integer> newlist4 = new ArrayList<>();
                            newlist4.add(0, mileage2);
                            newlist4.add(1, fuell);
                            map.put(carModel3, newlist4);
                            System.out.printf("%s mileage decreased by %d kilometers%n", carModel3, kms);
                            break;
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        map.entrySet().stream()
                .sorted((one, two) -> {
                    int result = two.getValue().get(0).compareTo(one.getValue().get(0));
                    if (result == 0) {
                        result = one.getKey().compareTo(two.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                        , e.getKey(), e.getValue().get(0), e.getValue().get(1)));

    }
}
