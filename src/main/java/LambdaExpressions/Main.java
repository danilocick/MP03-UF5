package LambdaExpressions;

import LambdaExpressions.Planeta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Maven!");

        Planeta planetaA = new Planeta("dani",100);
        Planeta planetaB = new Planeta("oscar", 200);
        Planeta planetaC = new Planeta("josp", 135);

        ArrayList<Planeta> planetaList = new ArrayList<Planeta>();
        planetaList.add(planetaA);
        planetaList.add(planetaB);
        planetaList.add(planetaC);

        System.out.println(planetaList);
    }
}
