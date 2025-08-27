import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[]{scanner.nextInt()};

        int tamanho = array.length;

        int somaEsperada = tamanho * (tamanho + 1) / 2;

        int somaExistente = Arrays.stream(array).sum();

        int numeroEmFalta = somaExistente - somaEsperada;
        System.out.println(numeroEmFalta);
    }
}