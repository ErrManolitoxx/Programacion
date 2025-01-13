import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca números hasta que me de la gana: ");
        int numeros = scanner.nextInt();
        scanner.nextLine();

        int suma = 0;

        while (numeros != 0) {
            System.out.println("Vaya, no es el número que quiero, introduce otro anda:");
            numeros = scanner.nextInt();
            scanner.nextLine();

            suma += numeros;

            if (numeros == 0) {
                System.out.println("Muy bien, la suma");
            }
        }

    }
}
