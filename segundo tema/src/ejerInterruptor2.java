import java.util.Scanner;

public class ejerInterruptor2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un código de 8 caracteres:");
        String codigo = scanner.nextLine();

        if (codigo.length() == 8) {
            System.out.println("Es válido.");
        }
        else {
            System.out.println("No es válido");
        }
    }
}
