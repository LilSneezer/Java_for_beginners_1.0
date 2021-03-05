import java.util.Scanner;

public class WorkingWithData11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNumb = scanner.next();
        Integer numb = scanner.nextInt();
        Integer intStr = Integer.valueOf(strNumb);
        System.out.println(Math.max(numb, intStr));
        double minNumb = Math.min(numb, intStr);
        System.out.println(minNumb);
    }
}
