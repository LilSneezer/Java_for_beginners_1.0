import java.util.Scanner;

public class Operators5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String ch = scanner.next();
        switch (ch) {
            case "+": System.out.println(a + b);
            break;
            case "-": System.out.println(a - b);
            break;
            case "*": System.out.println(a * b);
            break;
            case "/":
                if (b == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println(a / b);
                }
            break;
            default: System.out.println("DEFAULT");
        }
    }
}
