import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervalos = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        List<int[]> intervalosUnidos = new ArrayList<>();

        intervalosUnidos.add(intervalos[0]);

        for (int i = 1; i < intervalos.length; i++) {
            int[] ultimoIntervaloUnido = intervalosUnidos.get(intervalosUnidos.size() - 1);
            int[] intervaloAtual = intervalos[i];

            if (ultimoIntervaloUnido[1] >= intervaloAtual[0]) {

                ultimoIntervaloUnido[1] = Math.max(ultimoIntervaloUnido[1], intervaloAtual[1]);
            } else {
                intervalosUnidos.add(intervaloAtual);
            }
        }
        int[][] resultado = intervalosUnidos.toArray(new int[intervalosUnidos.size()][]);

        for (int[] intervalo : resultado) {
            System.out.print(Arrays.toString(intervalo) + " ");
        }
    }
}