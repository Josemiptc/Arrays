public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int minimo = numeros[0];
        for (int i = 0 ; i < numeros.length ; i++){
            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        System.out.println("El minimo es: " + minimo);
    }
}
