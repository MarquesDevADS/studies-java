/*
 * Crie um programa que represente três
 * ninjas da Vila da Folha (Konoha) de "Naruto"
 * e suas respectivas missões.
 *
 * Cada ninja tem um nome, uma idade e uma
 * missão atribuída a ele, com o nome da
 * missão, nível de dificuldade e status de conclusão
 */
package Condicoes;

public class DesafioCondicoes {
    public static void main(String[] args) {
        // Ninja 1
        String nomePrimeiroNinja = "Tobi";
        int idadePrimeiroNinja = 42;

        String nomePrimeiraMissao = "Sombras da Lua Vermelha";
        String statusDaMissao;
        char nivelPrimeiraMissao = 'S';

        if(idadePrimeiroNinja >= 25){
            statusDaMissao = "Missão em andamento";
        } else {
            statusDaMissao = "Não concluida";
        }

        System.out.println("Nome do ninja: " + nomePrimeiroNinja);
        System.out.println("Idade do ninja: " + idadePrimeiroNinja);
        System.out.println("Missão designada: " + nomePrimeiraMissao);
        System.out.println("Nivel da missão: " + nivelPrimeiraMissao);
        System.out.println(statusDaMissao);
        System.out.println("------------------------------");
        System.out.println("------------------------------");




        // Ninja 2
        String nomeSegundoNinja = "Sakura";
        int idadeSegundoNinja = 14;

        String nomeSegundaMissao = "Caçada do Relâmpago Negro";
        String statusDaSegundaMissao = "";
        char nivelSegundaMissao = 'C';

        if(idadeSegundoNinja < 15) {
            if (nivelSegundaMissao == 'C' || nivelSegundaMissao == 'D'){
                statusDaSegundaMissao = "Missão Concluida";
            } else {
                statusDaSegundaMissao = "Missão Não Concluida";
            }
        }

        System.out.println("Nome do ninja: " + nomeSegundoNinja);
        System.out.println("Idade do ninja: " + idadeSegundoNinja);
        System.out.println("Missão designada: " + nomeSegundaMissao);
        System.out.println("Nivel da missão: " + nivelSegundaMissao);
        System.out.println(statusDaSegundaMissao);
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        // Ninja 3
        String nomeTerceiroNinja = "Naruto";
        int idadeTerceiroNinja = 16;

        String nomeTerceiraMissao = "Proteção do Mensageiro Real";
        String statusDaTerceiraMissao = "";
        char nivelTerceiraMissao = 'S';

        if (idadeTerceiroNinja > 15 && idadeTerceiroNinja < 25){
            if (nivelTerceiraMissao == 'S') {
                statusDaTerceiraMissao = "Missão Cancelada";
            }
        } else {
            statusDaTerceiraMissao = "Concluida";
        }

        System.out.println("Nome do ninja: " + nomeTerceiroNinja);
        System.out.println("Idade do ninja: " + idadeTerceiroNinja);
        System.out.println("Missão designada: " + nomeTerceiraMissao);
        System.out.println("Nivel da missão: " + nivelTerceiraMissao);
        System.out.println(statusDaTerceiraMissao);

        System.out.println("------------------------------");
        System.out.println("------------------------------");

    }

}
