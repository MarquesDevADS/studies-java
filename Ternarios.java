package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        String nomeNinja = "Alyson";
        String rank;

        int idadeNinja = 19;
        short numeroMissoes = 5;

        String nivelResultado = (numeroMissoes >= 25) ? "Rank: Hokage" : "Ninja novo ainda";
        System.out.println(nivelResultado);

    }
}

