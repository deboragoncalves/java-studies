package com.debora.exercicios.orientacaoobjetos.parte02.heranca.desafio01;

public class Employee extends Person {

    private String departament;
    private int yearsExperience;

    protected Employee(String name, int age, String departament, int yearsExperience) {
        super(name, age);
        this.departament = departament;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public double getSalary() {
        double baseSalary = 2000;
        return baseSalary * this.yearsExperience;
    }

    public String getDepartament() {
        return this.departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getYearsExperience() {
        return this.yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getName() + "\nIdade: " + this.getAge() + "\nDeparmento: " + this.getDepartament() + "\nSalário: R$ " + this.getSalary() +
                "\nAnos de experiência: " + this.getYearsExperience();
    }
}
