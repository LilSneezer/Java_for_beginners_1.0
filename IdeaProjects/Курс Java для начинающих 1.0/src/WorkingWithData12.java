import java.util.Scanner;

public class WorkingWithData12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.contains("Java") & str.startsWith("I like") & str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }
        String result = str.replaceAll("a", "o").substring(7, 11);
        System.out.println(result);
    }
}
