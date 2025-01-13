import java.util.Scanner;

public class division{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un nominador:");

        double num1 = scanner.nextDouble();

        System.out.println("Introduzca un denominador:");

        double num2 = scanner.nextDouble();

        double res = num1 / num2;

        System.out.println("El resultado es " + res);
    }
}