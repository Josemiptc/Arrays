import java.util.Scanner;

public class EstaciónMeteorologica {
    // Devuelve el código ANSI de color según la temperatura
    static String colorPara(int t) {
        if (t < 0)   return "\u001B[34m";  // azul     -> bajo 0
        if (t <= 9)  return "\u001B[36m";  // cian     -> 0-9
        if (t <= 19) return "\u001B[32m";  // verde    -> 10-19
        if (t <= 29) return "\u001B[33m";  // amarillo -> 20-29
        return "\u001B[91m";               // rojo     -> 30 o más
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] dias_encima_media = new String[7];
        final String RESET = "\u001B[0m";
        int[] temperaturas = new int[7];
        int temperatura;
        double t_media;
        double maxima;
        double minima;
        double suma = 0;
        double mayor_subida = 0;
        String dia1_subida = dias[0];
        String dia2_subida = dias[0];
        String dia_max = dias[0];
        String dia_min = dias[0];
        String asteriscos = "";

        for (int i = 0; i <= dias.length -  1; i++){
            do{
                System.out.println(" Temperatura del " + dias[i] + " :");
                temperatura = sc.nextInt();
            }while (temperatura <= -30 || temperatura>=50);
            temperaturas[i] = temperatura;
        }

        for (int i = 0; i <= dias.length - 1; i++){
            suma = suma + temperaturas[i];
        }

        t_media = suma / 7;
        System.out.printf("La temperatura media es: %.2f%n", t_media);

        maxima = temperaturas[0];
        minima = temperaturas[0];

        for (int i = 0; i <= temperaturas.length - 1; i++){
            if (temperaturas[i] > maxima){
                maxima = temperaturas[i];
                dia_max = dias[i];
            }

        }

        for (int i = 0; i <= temperaturas.length - 1; i++){
            if (temperaturas[i] < minima){
                minima = temperaturas[i];
                dia_min = dias[i];
            }
        }

        System.out.println("Máxima: " + maxima + " ºC (" + dia_max + ") | Mínima: " + minima + " ºC (" + dia_min + ")");

        for (int i = 0; i <= dias.length - 1; i++){
            if (temperaturas[i] > t_media){
                dias_encima_media[i] = dias[i];
            }
        }

        System.out.print("Dias por encima de la media: ");

        for (String dia : dias_encima_media) {
            if (dia != null) System.out.print(dia + ", ");
        }

        for (int i = 0; i < dias.length - 1; i++){
            if (temperaturas[i + 1] - temperaturas[i] > mayor_subida){
                dia1_subida = dias[i];
                dia2_subida = dias[i + 1];
                mayor_subida = temperaturas[i + 1] - temperaturas[i];
            }
        }
        // '\u2591' '\u2588`
        System.out.println("");
        System.out.println("Mayor subida de " + dia1_subida + " a " + dia2_subida + " (+" + mayor_subida + " ºC)." );
        System.out.println("Gráfico de temperaturas:");
        for (int i = 0; i <= dias.length - 1; i++){
            if (temperaturas[i] > 0) {
                asteriscos = "\u2591".repeat(temperaturas[i]);
            }else   asteriscos = "\u2588".repeat(Math.abs(temperaturas[i]));

            System.out.println(dias[i] + " " + colorPara(temperaturas[i]) + asteriscos + RESET + " " + temperaturas[i]);
        }
        System.out.println();
        System.out.println("Leyenda: "
                + "\u001B[34m█ bajo 0" + RESET + "  "
                + "\u001B[36m█ 0-9" + RESET + "  "
                + "\u001B[32m█ 10-19" + RESET + "  "
                + "\u001B[33m█ 20-29" + RESET + "  "
                + "\u001B[91m█ 30 o más" + RESET);
    }
}
