package com.debora.exercicios.orientacaoobjetos.parte02.heranca.desafio01;

public class Boss extends Employee {

    private String name;
    private int age;
    private String departament;
    private int yearsExperience;

    public Boss(String name, int age, String departament, int yearsExperience) {
        super(name, age, departament, yearsExperience);
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public double getSalary() {
        double plusSalary = 2000;
        return super.getSalary() + plusSalary;
    }

    public String getDepartament() {
        return super.getDepartament();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getName() + "\nIdade: " + this.getAge() + "\nSalário: R$ " + this.getSalary() + "\nDepartamento: " + this.getDepartament()
                + "\nAnos de experiência: " + this.getYearsExperience();
    }
}
