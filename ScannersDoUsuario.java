package Condicoes;

import java.util.Scanner;

public class ScannersDoUsuario {
    public static void main(String[] args) {
        Scanner boxOfText = new Scanner(System.in);

        // Nome
        System.out.println("Qual o nome do ninja? ");
        String nameOfNinja = boxOfText.nextLine();

        System.out.println("------------------");

        // Idade
        System.out.println("Qual sua idade? ");
        int ageOfNinja = boxOfText.nextInt();

        System.out.println("------------------");

        // Saia
       if (ageOfNinja >= 15) {
           System.out.println("O ninja está na idade correta para ir em missões");
       } else {
           System.out.println("O ninja é muito novo");
       }



        boxOfText.close();
    }
}
