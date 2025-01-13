package components;

import model.Departamento;
import model.Empresa;

import java.util.Scanner;

public class EmpresaReader {

    private final Scanner scanner;
    private final DepartamentoReader departamentoReader;

    public EmpresaReader(Scanner scanner, DepartamentoReader departamentoReader) {
        this.scanner = scanner;
        this.departamentoReader = departamentoReader;
    }

    public Empresa read(){

        System.out.println("Introduzca el nombre de la empresa:");
        String name = scanner.nextLine();

        System.out.println("Introduzca el CIF de la empresa:");
        String cif = scanner.nextLine();

        System.out.println("Introduzca la cantidad de departamentos que hay en la empresa:");
        int size = scanner.nextInt();
        scanner.nextLine();

        Departamento[] departamentos = new Departamento[size];
        for (int i = 0; i < size; i++) {
            departamentos[i] = departamentoReader.read();
        }

        return new Empresa(name, cif, departamentos);
    }
}
