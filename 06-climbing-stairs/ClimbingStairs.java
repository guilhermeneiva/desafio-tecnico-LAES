import java.util.Scanner;

public class ClimbingStairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1 || n >= 45) {
            System.out.println("n não pode ser menor que 1 e maior igual a 45");
            return;
        }

        int a = 1;
        int b = 1;
        int c;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(b);
        scanner.close();
    }
}

