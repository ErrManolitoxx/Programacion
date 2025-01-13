import java.util.Scanner;

public class juego {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Te encuentras en un páramo alejado de la sociedad, solo, desorientado, según avanzas por un camino te encuentras una bolsa con cargamento desconocido, que haces?" +
                "1: Pasar de largo y seguir con tu camino. o 2: Coger la bolsa e investigar lo que contiene.");

        int decision1 = scanner.nextInt();
        scanner.nextLine();


        if (decision1 == 1){
            System.out.println("Decides pasar de largo y seguir con tu camino.");
            System.out.println("Caminas durante un buen rato, y cuando pasas una colina ves a lo lejos un pueblo y a tu derecha otro camino que direge hacia un bosque, que eliges");
            System.out.println("1.Seguir el camino que dirige hacia el pueblo.");
            System.out.println("2.Dirigirte hacia el misterioso bosque.");
            int decision2 = scanner.nextInt();
            scanner.nextLine();

            if (decision2 == 1){
                System.out.println("Eliges dirigirte al pueblo, lo más propable es que encuentre alguien que te ayude a orientarte.");
                System.out.println("En la entrada del pueblo ves diferentes establecimientos, como la comisaría, un bar y la iglesia.");
                System.out.println("Donde decides entrar primero.");
                System.out.println("1.En la comisaría.");
                System.out.println("2.En el bar.");
                System.out.println("3.En la iglesia.");

            }

        }
        else if(decision1 == 2){
            System.out.println("Eliges investigar la bolsa y te encuentras un peluche sucio y dañado");
            System.out.println("Además del peluche te encuentras una cruz con un grabado que dice <<Si un arbol cae en un bosque en el que no se encuentra nadie, éste hará ruido?>>");
            System.out.println("Tras esto continuas tu camino.");
            System.out.println("Caminas durante un buen rato, y cuando pasas una colina ves a lo lejos un pueblo y a tu derecha otro camino que direge hacia un bosque, que eliges");
            System.out.println("1.Seguir el camino que dirige hacia el pueblo.");
            System.out.println("2.Dirigirte hacia el misterioso bosque.");
            int decision2 = scanner.nextInt();
            scanner.nextLine();

            if (decision2 == 2){
                System.out.println("Te estas adentrando en el bosque, y cuando más lo haces peor idea te parece haber tomado.");
                System.out.println("Derrepente mientras vas caminando por el misterioso sendero, se abre un hueco bajo tus pies y caes directo hacia un profundo aguejero oscuro.");
                System.out.println("Derrepente te despiertas despues de haberte desmayado por la caida.");
                System.out.println("Sientes un gran dolor en tu tobillo, te lo has lesionado.");
                System.out.println("1.Intentas gritar por ayuda con todas tus fuerzas.");
                System.out.println("2.Miras alrededor para buscar alguna salida.");

                int decision3 = scanner.nextInt();
                scanner.nextLine();
            }
        }
        else{
            System.out.println("Esta opción no existe, elige otra vez.");

        }

    }
}