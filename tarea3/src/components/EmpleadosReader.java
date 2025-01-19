package components;

import model.Empleado;

import java.util.Scanner;

public class EmpleadosReader {

    private final Scanner scanner;

    public EmpleadosReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Empleado read(){
        System.out.println("Introduzca su NIF porfavor:");
        String nif = scanner.nextLine();

        System.out.println("Introduzca el nombre del empleado:");
        String name = scanner.nextLine();

        System.out.println("Introduzca los apellidos:");
        String surname = scanner.nextLine();

        System.out.println("Introduzca el puesto del trabajador:");
        String job = scanner.nextLine();

        return new Empleado(nif, name, surname, job);
    }
}
