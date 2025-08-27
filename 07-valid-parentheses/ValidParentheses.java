import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite");
        String s = scanner.nextLine();
        scanner.close();

        boolean valido = true;
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                pilha.push(x);
            } else {

                if (pilha.isEmpty()) {
                    valido = false;
                    break;
                }
                char topoDaPilha = pilha.pop();
                if ((x == ')' && topoDaPilha != '(') ||
                        (x == '}' && topoDaPilha != '{') ||
                        (x == ']' && topoDaPilha != '[')) {
                    valido = false;
                    break;
                }
            }
        }
        if (valido && !pilha.isEmpty()) {
            valido = false;
        }

        System.out.println(valido);
    }
}