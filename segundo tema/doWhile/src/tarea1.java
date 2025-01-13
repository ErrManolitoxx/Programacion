import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int eleccion;

        do {
            System.out.println("1.Repite mensaje.");
            System.out.println("2.Media.");
            System.out.println("3.Salir");


            eleccion = scanner.nextInt();
            scanner.nextLine();

            if (eleccion == 1) {
                System.out.println("Introduzca un número que sea mayor que 0:");
                int num = scanner.nextInt();
                scanner.nextLine();

                while (num < 0) {
                    System.out.println("Su número es menor que 0, porfavor introduzca otro número:");
                    num = scanner.nextInt();
                    scanner.nextLine();
                }
                System.out.println("Ahora introduzca un mensaje de texto:");
                String mensaje = scanner.nextLine();

                for (int i = 0; i < num; i++) {
                    System.out.println(mensaje);
                }

            }

            if (eleccion == 2) {
                System.out.println("Indica la cantidad de números que va a introducir:");
                int cantidadNum = scanner.nextInt();
                scanner.nextLine();

                while (cantidadNum <= 0) {
                    System.out.print("¿Cuántos números vas a ingresar? (debe ser mayor que 0): ");
                    cantidadNum = scanner.nextInt();
                    if (cantidadNum <= 0) {
                        System.out.println("Por favor, introduce un valor mayor que 0.");
                    }
                }
                double suma = 0;

                for (int i = 1; i <= cantidadNum; i++) {
                    System.out.print("Introduce el número " + i + ": ");
                    double num = scanner.nextDouble();
                    suma += num;
                }

                double media = suma / cantidadNum;
                System.out.println("La media de dichos número es: " + media);

            }

            else {
                System.out.println("Opción Inválida.");
            }

        } while (eleccion != 3);

    }
}
