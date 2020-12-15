package curso02.orientacaoobjetos.parte01.desafio01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {

    private String head;
    private ArrayList<String> developers = new ArrayList<>();
    private ArrayList<String> projects = new ArrayList<>();

    public Team() {

    }

    public Team(String head, ArrayList<String> developers, ArrayList<String> projects) {
        this.head = head;
        this.developers = developers;
        this.projects = projects;
    }

    public String getHead() {
        return this.head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public ArrayList<String> getDevelopers() {
        return this.developers;
    }

    public void setDevelopers(ArrayList<String> developers) {
        this.developers = developers;
    }

    public ArrayList<String> getProjects() {
        return this.projects;
    }

    public void setProjects(ArrayList<String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Head: " + this.getHead() + "\nDevelopers: " + this.getDevelopers() + "\nProjects: " + this.getProjects();
    }
}
