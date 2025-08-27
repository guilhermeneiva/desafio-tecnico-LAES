import java.util.Arrays;
import java.util.Scanner;

public class BestTimeStock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();


        int precos[] = Arrays.stream(entrada.split(" ")).mapToInt(Integer::parseInt).toArray();

        if (precos.length == 1 || precos.length > 100000) {
            System.out.println("Tem que ter mais de 1 preço e no máximo 10^5 preços");
            return;
        }


        for (int preco : precos) {
            if (preco <= 0 || preco > 10000) {
                System.out.println("Os preços devem ser maior que 0 e menor que 10^4.");
                return;
            }
        }

        int precoMinimo = precos[0];
        int lucroMaximo = 0;

        for (int i = 1; i < precos.length; i++) {
            int lucroAtual = precos[i] - precoMinimo;

            if (lucroAtual > lucroMaximo) {
                lucroMaximo = lucroAtual;
            }

            if (precos[i] < precoMinimo) {
                precoMinimo = precos[i];
            }
        }

        System.out.println("Lucro máximo: " + lucroMaximo);


        scanner.close();
    }
}
