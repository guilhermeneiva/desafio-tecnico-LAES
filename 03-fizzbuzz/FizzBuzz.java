import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Object> arrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arrayList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arrayList.add("Fizz");
            } else if (i % 5 == 0) {
                arrayList.add("Buzz");
            } else {
                arrayList.add(i);
            }
        }

        System.out.println(arrayList);

    }
}
