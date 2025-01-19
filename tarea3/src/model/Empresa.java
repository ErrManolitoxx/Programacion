package model;

import java.util.Arrays;
import java.util.Objects;

public class Empresa {

    private String name;
    private String cif;
    private Departamento[] departamentos;

    public Empresa(String name, String cif, Departamento[] departamentos) {
        this.name = name;
        this.cif = cif;
        this.departamentos = departamentos;
    }

    public void showInfo(){
        System.out.println("El nombre del departamento es " + name + " el CIF es " + cif + " y tiene " + departamentos + " departamentos.");
    }

    public Departamento findDepartamento() {
        for (var departamento : departamentos){
            if (departamento.getName().equals(name)){
                return departamento;
            }
        }
        return null;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(name, empresa.name) && Objects.equals(cif, empresa.cif) && Objects.deepEquals(departamentos, empresa.departamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departamentos));
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}
