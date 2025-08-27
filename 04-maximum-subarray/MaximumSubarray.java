import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        int nums[] = Arrays.stream(entrada.split(" ")).mapToInt(Integer::parseInt).toArray();

        int somaAtual = nums[0];
        int somaMaxima = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (somaAtual < 0) {
                somaAtual = num;
            } else {
                somaAtual += num;
            }

            if (somaAtual > somaMaxima) {
                somaMaxima = somaAtual;
            }
        }

        System.out.println(somaMaxima);

    }
}
