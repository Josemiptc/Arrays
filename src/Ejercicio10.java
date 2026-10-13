import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Dime un numero entero: ");
        int numeroabuscar = sc.nextInt();
        boolean pertenece = false;
        int posicion = 0;

        for (int i = 0 ; i < numeros.length ; i++){
            if (numeros[i] == numeroabuscar){
                pertenece = true;
                posicion = i;
                break;
            }
        }
        if (pertenece == true){
            System.out.println("Esta en la posicion: " + posicion);
        }else System.out.println("-1");
    }
}
