import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int eliminar;
        System.out.println("Introduce la posicion del array que quieres eliminar: ");
        eliminar = sc.nextInt();

        for (int x = eliminar; x < enteros.length - 1; x++) {
            enteros[x] = enteros[x + 1];
        }
        enteros[enteros.length - 1] = 0;
        System.out.println(Arrays.toString(enteros));
    }
}

