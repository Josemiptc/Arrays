public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,-3,4,5,-6,7,-8,9,10};
        int sumapositivos = 0;
        int sumanegativos = 0;
        for (int i = 0; i < numeros.length ; i++){
            if (numeros[i] >= 0){
                sumapositivos = sumapositivos + numeros[i];
            }else sumanegativos = sumanegativos + numeros[i];
        }
        System.out.println("La suma de los positivos es: " + sumapositivos);
        System.out.println("La suma de los negativos es: " + sumanegativos);
    }
}
