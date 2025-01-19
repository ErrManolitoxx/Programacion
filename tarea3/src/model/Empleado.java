package model;

import java.util.Objects;

public class Empleado {

    private String nif;
    private String name;
    private String surName;
    private String job;

    public Empleado(String nif, String name, String surName, String job) {
        this.nif = nif;
        this.name = name;
        this.surName = surName;
        this.job = job;
    }

    public void showInfo(){
        System.out.println("El NIF del empleado es " + nif + " su nombre es " + name + " de apellidos " + surName + " y trabaja de " + job);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nif, empleado.nif) && Objects.equals(name, empleado.name) && Objects.equals(surName, empleado.surName) && Objects.equals(job, empleado.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surName, job);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
