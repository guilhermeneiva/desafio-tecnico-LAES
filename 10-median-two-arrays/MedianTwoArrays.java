import java.util.Arrays;
import java.util.Locale;

public class MedianTwoArrays {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int nums1[] = {1, 2};
        int nums2[] = {3, 4};

        int[] arrayCombinado = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arrayCombinado, 0, nums1.length);
        System.arraycopy(nums2, 0, arrayCombinado, nums1.length, nums2.length);

        Arrays.sort(arrayCombinado);
        System.out.println(Arrays.toString(arrayCombinado));
        double mediana;
        int tamanho = arrayCombinado.length;

        if (tamanho % 2 == 0) {
            int indiceMeio1 = tamanho / 2 - 1;
            int indiceMeio2 = tamanho / 2;
            mediana = (arrayCombinado[indiceMeio1] + arrayCombinado[indiceMeio2]) / 2.0;
        } else {
            mediana = arrayCombinado[tamanho / 2];
        }

        System.out.printf("%.5f%n", mediana);

    }
}
