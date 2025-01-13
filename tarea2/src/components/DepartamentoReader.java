package components;

import model.Departamento;
import model.Empleado;

import java.util.Scanner;

public class DepartamentoReader {

    private final Scanner scanner;
    private final EmpleadosReader empleadosReader;

    public DepartamentoReader(Scanner scanner, EmpleadosReader empleadosReader) {
        this.scanner = scanner;
        this.empleadosReader = empleadosReader;
    }


    public Departamento read(){
        System.out.println("Introduzca el nombre del departamento:");
        String name = scanner.nextLine();

        System.out.println("Introduzca el presupuesto del departamento:");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("¿Cuantos empleados se encuentran en el departamento?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Empleado[] empleados = new Empleado[size];
        for (int i = 0; i < size; i++) {
            empleados[i] = empleadosReader.read();
        }

        return new Departamento(name, budget, empleados);
    }
}
