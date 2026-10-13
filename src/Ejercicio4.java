public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        double media = 0;
        double suma = 0;
        for (int i = 0 ; i < numeros.length ; i++){
            suma = suma + numeros[i];
        }
        media = suma / 10;
        System.out.println("La media es: " + media);
    }
}
