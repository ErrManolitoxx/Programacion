import java.util.Scanner;

public class tarea2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduzca la base de la potencia:");
        int base = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ahora introduzca el exponente de la potencia:");
        int exponente = scanner.nextInt();
        scanner.nextLine();
        System.out.println("La potencia de dichos números es " + potencia(base, exponente));

        System.out.println("El array elevado a dicho número es:" + pedirArray());
    }

    public static int potencia (int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;

        }

        return resultado;
    }

    public static int[] arrayPotencia (int[] numeros, int exponente) {
        int[] resultados = new int[numeros.length];
        System.out.println("Ahora introduzca el número al que quiere que se eleve el array: ");
        int potenciaArray = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            resultados[i] = potencia(numeros[i], exponente);
        }

        return resultados;
    }
    public static int[] pedirArray() {

        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();

        int[] numeros = new int[size];

        System.out.println("Ingrese " + size + " números:");
        for (int i = 0; i < size; i++) {
            System.out.print("Número " + (i) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int[] resultados = new int[numeros.length];
        System.out.println("Ahora introduzca el número al que quiere que se eleve el array: ");
        int exponente = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            resultados[i] = potencia(numeros[i], exponente);
        }

        return numeros;
    }


}
