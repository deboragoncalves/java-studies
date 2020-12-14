package com.debora.exercicios.orientacaoobjetos.parte02.heranca.desafio01;

public class desafio01 {

    /*

    Desafio 01: Criar super classe, com atributo e 2 métodos;
     2 subclasses, que herdam os métodos.
     Modificadores de acesso: protected (herança)

     */

    public static void main(String[] args) {

        Person p1 = new Person("João", 23);
        Employee employee1 = new Employee(p1.getName(), p1.getAge(), "Administrativo", 3);
        Boss boss1 = new Boss(employee1.getName(), employee1.getAge(), employee1.getDepartament(), employee1.getYearsExperience());

        System.out.println(p1);
        System.out.println();
        System.out.println(employee1);
        System.out.println();
        System.out.println(boss1);

    }
}
