package com.debora.exercicios.orientacaoobjetos.parte01.desafio05;

import java.util.zip.GZIPOutputStream;

public class Person {

    private String name;
    private double weight;

    public Person() {

    }

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double eat(Food food) {
        return this.weight += food.getWeight();
    }

    @Override
    public String toString() {
        return "Pessoa: \nNome: " + this.getName() + "\nPeso: " + this.getWeight() + " kg";
    }
}
