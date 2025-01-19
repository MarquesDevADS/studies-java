package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /* Objetivo: Passar um ninja de nivel de acordo com o numero de missoes */

        String nomeNinja = "Alyson";
        String rank;

        int idadeNinja = 19;
        boolean nokage = true;
        short numeroMissoes = 25;


        if (numeroMissoes >= 25 && idadeNinja > 30) {
            System.out.println("Rank: Hokage");
        } else if (numeroMissoes >= 20 && idadeNinja >15) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }

    }



}
