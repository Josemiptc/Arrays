public class Ejercicio11 {
    public static void main(String[] args) {
        int[] enteros={1,2,3,4,5,1,7,8,9,10};
        boolean repetido = false;
        for (int i = 0; i < enteros.length ; i++){
            for (int j = i + 1; j < enteros.length; j++){
                if (enteros[i] == enteros[j]){
                    System.out.println("El numero " + enteros[i] + " esta repetido.");
                    repetido = true;
                }
            }
        }
        if (repetido == false){
            System.out.println("No hay ningun numero repetido.");
        }
    }
}
