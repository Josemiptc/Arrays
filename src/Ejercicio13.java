import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] enteros={1,2,3,4,5,6,7,8,9,10};
        Scanner sc =new Scanner(System.in);
        int numero;
        System.out.println("Escribe el número que quieres: ");
        numero = sc.nextInt();
        boolean correcto = false;
        for (int i = 0; i < enteros.length; i++){
            for (int j = i+1 ; j < enteros.length; j++){
                if ((enteros[i] + enteros[j]) == numero){
                    System.out.println("La suma de los números " + enteros[i] + " y " + enteros[j] + " da como resultado tu número.");
                    correcto = true;
                }
            }
        }
        if (correcto == false){
            System.out.println("No hay ninguna combinacion de números que al sumarlos de el tuyo.");
        }
    }
}
