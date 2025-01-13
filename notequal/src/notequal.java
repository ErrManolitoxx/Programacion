import java.util.Scanner;

public class notequal{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");

        int num1 = scanner.nextInt();

        System.out.println("Introduzca el segundo número:");

        int num2 = scanner.nextInt();

        boolean res = num1 != num2;

        System.out.println( res );
    }
}