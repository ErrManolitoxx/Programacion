package components;

import model.Departamento;
import model.Empresa;

import java.util.Scanner;

public class CompanyMenuApp {

    private final Scanner scanner;
    private final EmpresaReader empresaReader;

    public CompanyMenuApp(Scanner scanner, EmpresaReader empresaReader) {
        this.scanner = scanner;
        this.empresaReader = empresaReader;
    }

    public void run(){

        Empresa empresa = empresaReader.read();
        int option;

        do {
            option = chooseOption();

            if (option == 1){
                option1(empresa);
            }

            if (option == 2){

            }
        } while (option != 4);

    }

    private int chooseOption(){
        int option;

        System.out.println("1.Mostrar información de un departamento.");
        System.out.println("2.Mostrar los empleados de un departamento.");
        System.out.println("3.Mostrar los datos del empleado de un departamento.");
        System.out.println("4.Salir");

        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private void option1(Empresa empresa){
        for (var departamento : empresa.getDepartamentos()){
            departamento.showInfo();
        }
    }
}
