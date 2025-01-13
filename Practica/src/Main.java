import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = asskNum();
        System.out.println("El número introducido es: "+num);


        double[] numbers = asskArray();
        System.out.println("Valores del array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento " + (i) + ": " + numbers[i]);
        }

        int suma = sumatorio();
        System.out.println("La suma desde el 1 hasta");
    }

    public static int asskNum(){
        System.out.println("Introduzca un número entero mayor que 0.");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num <= 0){
            System.out.println("Número inválido, porfavor, introduzca otro número.");
        }
        return num;
    }

    public static double[] asskArray(){
        System.out.println("Introduzca el tamaño desaeado para el array:");
        int size = scanner.nextInt();
        scanner.nextLine();

        double[] numeros = new double[size];

        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Número"+ (i) +":");
            numeros[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return numeros;
    }

    public static int sumatorio(){
        System.out.println("Introduzca un número positivo:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if(num <= 0){
            System.out.println("El número no es positivo, introduzca otro");
        }
        int suma = 0;
        for (int i = 1; i < num; i++) {
            suma += i;
        }
        return suma;
    }
}