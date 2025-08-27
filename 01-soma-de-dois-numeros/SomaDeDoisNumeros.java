import java.util.Arrays;
import java.util.Scanner;

public class SomaDeDoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números");
        String entrada = scanner.nextLine();

        int nums[] = Arrays.stream(entrada.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Informe o target:");
        int target = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int resultado[] = {i, j};
                    System.out.println(Arrays.toString(resultado));
                }
            }

        }
        scanner.close();

    }
}
