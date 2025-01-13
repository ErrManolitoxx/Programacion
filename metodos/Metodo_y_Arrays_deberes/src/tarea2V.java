import java.util.Scanner;

public class tarea2V {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opccion;

        do {
            System.out.println("1.Elevar array a potencia: pide un array, pide un número positivo, eleva el array a la potencia y lo imprime en pantalla.");
            System.out.println("2.Elevar número a potencia: pide un número entero (a), pide otro número entero positivo (n),  calcula an y muestra el resultado en pantalla.");
            System.out.println("3.Salir.");
            opccion = scanner.nextInt();
            if (opccion == 1){

                int[] numeros = pedirArray();
                System.out.println("Ingrese el exponente al que desea elevar cada número del array:");
                int exponenteArray = scanner.nextInt();
                int[] resultados = arrayPotencias(numeros, exponenteArray);
                System.out.print("Las potencias del array elevado a " + exponenteArray + "es : { ");
                for (int res : resultados) {
                    System.out.print(res + " ");
                }
                System.out.println("}");


            }
            else if (opccion == 2) {
                System.out.println("Introduzca la base de la potencia:");
                int base = scanner.nextInt();
                System.out.println("Introduzca el exponente de la potencia:");
                int exponente = scanner.nextInt();
                System.out.println("La potencia es: " + calcularPotencia(base, exponente));
            }
            else{
                System.out.println("Saliendo...");
            }
        } while (opccion != 3);

        int[] numeros = pedirArray();
        int exponenteArray = scanner.nextInt();
        int[] resultados = arrayPotencias(numeros, exponenteArray);

        System.out.print("Array elevado al exponente " + exponenteArray + ": { ");
        for (int res : resultados) {
            System.out.print(res + " ");
        }
        System.out.println("}");

        int numeroMayorQueUno = numeroMayorUno();
        System.out.println("Número mayor que 1 ingresado: " + numeroMayorQueUno);
    }
    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int[] arrayPotencias(int[] numeros, int exponente) {
        int[] resultados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultados[i] = calcularPotencia(numeros[i], exponente);
        }
        return resultados;
    }

    public static int[] pedirArray() {
        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();

        int[] numeros = new int[size];
        System.out.println("Ingrese " + size + " números:");
        for (int i = 0; i < size; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public static int numeroMayorUno() {
        int numero;
        do {
            System.out.print("Ingrese un número mayor que 1: ");
            numero = scanner.nextInt();
            if (numero <= 1) {
                System.out.println("Número no válido. Debe ser mayor que 1.");
            }
        } while (numero <= 1);
        return numero;
    }
}
