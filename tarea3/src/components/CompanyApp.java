package components;

import model.Empresa;

import java.util.Scanner;

public class CompanyApp {
    private final Scanner scanner;
    private final EmpresaReader empresaReader;

    public CompanyApp(Scanner scanner, EmpresaReader empresaReader) {
        this.scanner = scanner;
        this.empresaReader = empresaReader;
    }

    public void run(){
        var empresa = empresaReader.read();


    }
}
