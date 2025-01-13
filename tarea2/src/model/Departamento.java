package model;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {

    private String name;
    private double budget;
    private Empleado[] empleados;

    public Departamento(String name, double budget, Empleado[] empleados) {
        this.name = name;
        this.budget = budget;
        this.empleados = empleados;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Double.compare(budget, that.budget) == 0 && Objects.equals(name, that.name) && Objects.deepEquals(empleados, that.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(empleados));
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}
