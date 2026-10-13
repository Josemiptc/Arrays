public class Ejercicio9 {
    public static void main(String[] args) {
        int contadorpares = 0;
        int contadorimpares = 0;
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numeros.length ; i++){
            if (numeros[i] % 2 == 0){
                contadorpares = contadorpares + 1;
            }else contadorimpares = contadorimpares + 1;
        }
        System.out.println("Hay " + contadorpares + " números pares y " + contadorimpares + " números impares." );
    }
}
