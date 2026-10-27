import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Ahorcado {
    public static void main(String[] args) {
        String [] palabras = {"Casa" , "Árbol" , "Montaña" , "Amistad" , "Esperanza" , "Libro" , "Ventana" , "Estrella" , "Mariposa" , "Sonrisa" , "Aventura" ,  "Naturaleza" , "Música" , "Libertad" , "Universo"};
        Scanner sc = new Scanner(System.in);
        boolean completado = false;
        Character letra;
        Random random = new Random();
        int indice = random.nextInt(palabras.length);
        String palabraElegida = palabras[indice];
        palabraElegida = palabraElegida.toLowerCase();
        char[] caracteres = palabraElegida.toCharArray();
        char[] caracteres_vacios = new char[caracteres.length];
        while (completado == false){
            System.out.println(caracteres_vacios);
            System.out.println("Escribe una letra: ");
            letra = sc.next().charAt(0);
            for (int i = 0; i < caracteres.length; i++){
                if (letra == caracteres[i]){
                    caracteres_vacios[i] = letra;
                }
                if (Arrays.equals(caracteres, caracteres_vacios)){
                    completado = true;
                }
            }
        }
        System.out.println("Lo has adivinado,la palabra era: " + palabraElegida );
    }
}
