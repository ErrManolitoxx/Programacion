import java.util.Scanner;

public class tarea2C {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca la base de la potencia:");
        int base = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ahora introduzca el exponente de la potencia:");
        int exponente = scanner.nextInt();
        scanner.nextLine();
        System.out.println("La potencia de dichos números es " + potencia(base, exponente));

        int[] arrayPotenciado = potenciaArray();
        System.out.print("El array elevado a dicho número es: { ");
        for (int num : arrayPotenciado) {
            System.out.print(num + " ");
        }
        System.out.println("}");
    }

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int[] potenciaArray() {
        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();

        int[] numeros = new int[size];
        System.out.println("Ingrese " + size + " números:");
        for (int i = 0; i < size; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ahora introduzca el número al que quiere que se eleve el array: ");
        int exponente = scanner.nextInt();

        int[] resultados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultados[i] = potencia(numeros[i], exponente);
        }

        return resultados;
    }


}

