import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos números vas a introducir?");
        int canti = scanner.nextInt();
        scanner.nextLine();

        double suma = 0;


        while (canti <= 0) {
            System.out.println("Cantidad incorrecta, vuelva a introducirlo: ");
            canti = scanner.nextInt();
            scanner.nextLine();

            while (canti > 1) {
                System.out.println("Introduzca dichos números: ");
                int numeros = scanner.nextInt();
                scanner.nextLine();
                suma += numeros;

                if (canti == numeros) {
                    double division = suma / numeros;
                    System.out.println("La media es " + division);
                }
            }
        }
        while (canti > 0){
            System.out.println("Introduzca dichos números: ");
            int numeros = scanner.nextInt();
            scanner.nextLine();
            suma += numeros;

            if (canti == numeros) {
                double division = suma / numeros;
                System.out.println("La media es " + division);
            }
        }

    }
}
