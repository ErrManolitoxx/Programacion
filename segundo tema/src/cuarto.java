import java.util.Scanner;

public class cuarto {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un primer número(a):");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca un segundo número(b):");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (a > b){
            System.out.println("La suma de estos dos número es " + (a + b));
        }
        else if (a == b) {
            System.out.println("La resta de estos dos número es " + (a - b));

        }
        else {
            System.out.println("Introduzca un tercer número:");
            int c = scanner.nextInt();
            scanner.nextLine();

            if (c > (a + b)){
                System.out.println("El tercer número es mayor que a + b, es decir, " + (a + b));
            }
            else if(c < (a + b)){
                System.out.println("El tercer número es menor que a + b, es decir, " + (a + b));
            }
            else{
                System.out.println("El tercer número (c) es igual que a + b, es decir, " + (a + b));
            }

        }
    }
}