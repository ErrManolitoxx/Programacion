import java.util.Scanner;

public class ejerInterruptor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int num = scanner.nextInt();
        scanner.nextLine();

        switch (num) {

            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Buenos días.");
                break;

            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("Buenas Tardes.");
                break;

            case 0, 1, 2, 3, 4, 5, 21, 22, 23:
                System.out.println("Buenas Noches.");
                break;

            default:
                System.out.println("Hora Inválida.");
        }
    }
}
