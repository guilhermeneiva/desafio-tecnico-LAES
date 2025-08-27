import java.util.Scanner;

public class VerificadorDePalindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite:");
        String s = scanner.nextLine();
        scanner.close();

        StringBuilder limpa = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpa.append(Character.toLowerCase(c));
            }
        }

        String sLimpa = limpa.toString();

        String sInvertida = limpa.reverse().toString();

        boolean palindromo = sLimpa.equals(sInvertida);

        System.out.println(palindromo);
    }
}