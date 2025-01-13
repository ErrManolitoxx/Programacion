import java.util.Scanner;

public class equal{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca er primer número:");

        int num1 = scanner.nextInt();

        System.out.println("Introduzca el segundo número:");

        int num2 = scanner.nextInt();

        boolean res = num1 == num2;

        System.out.println( res );
    }
}