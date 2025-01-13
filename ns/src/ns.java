import java.util.Scanner;

public class ns {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca otro número:");
        int num2 = scanner.nextInt();

        boolean res = num1 == num2;

        System.out.println(res);

        if (num1 != num2){

            System.out.println("introduzca los números de nuevo:");
        }




    }
}