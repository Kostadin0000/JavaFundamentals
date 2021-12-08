import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\\w]+)>[^|$%.\\d]*\\|(?<count>[0-9]+)\\|[^|$%.\\d]*(?<price>[\\d]+[.\\d]*)\\$";

        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += count * price;
                System.out.printf("%s: %s - %.2f%n",name,product, price*count);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",sum);

    }

}
