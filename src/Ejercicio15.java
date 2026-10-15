import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args) {

        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] invertido = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < enteros.length; i++) {
            invertido[i] = enteros[enteros.length - 1 - i];
        }
        System.out.println(Arrays.toString(invertido));
    }
}
