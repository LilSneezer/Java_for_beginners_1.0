import java.util.Scanner;

public class Cycle10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Введите значения матрицы: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[0][j] = arr[0][j] * 3;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
