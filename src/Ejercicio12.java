public class Ejercicio12 {
    public static void main(String[] args) {
        int[] enteros={1,2,3,4,5,6,7,8,9,10};
        int[] enteros2={2,7,3,1,212,21,54,12};
        boolean comun = false;
        for (int i = 0; i < enteros.length ; i++){
            for (int j = 0; j < enteros2.length; j++){
                if (enteros[i] == enteros2[j]){
                    System.out.println("El número " + enteros[i] + " esta en los dos array.");
                    comun = true;
                }
            }
        }
        if (comun == false){
            System.out.println("No hay ningún número común.");
        }
    }
}
