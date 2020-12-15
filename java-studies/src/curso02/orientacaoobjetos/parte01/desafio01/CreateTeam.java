package curso02.orientacaoobjetos.parte01.desafio01;

import java.util.ArrayList;

public class CreateTeam {

    /*

    Desafio 01: Criar classe com três atributos e instanciar duas classes na classe principal.

     */

    public static void main(String[] args) {

        ArrayList<String> developers = new ArrayList<>();
        ArrayList<String> projects = new ArrayList<>();

        developers.add("João");
        developers.add("Lucas");
        developers.add("Pedro");

        projects.add("Project1");
        projects.add("Project2");
        projects.add("Project3");

        Team team1 = new Team();
        team1.setHead("Bruno da Silva");
        team1.setDevelopers(developers);
        team1.setProjects(projects);

        System.out.println(team1);
        System.out.println();

        developers.add("Nicolas");
        projects.add("Project4");

        Team team2 = new Team("Julio da Silva", developers, projects);
        System.out.println(team2);

    }
}
