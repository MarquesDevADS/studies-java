package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha seu personagem");
        System.out.println("1 - Yasuo");
        System.out.println("2 - Gragas");
        System.out.println("3 - Aatrox");

        int escolhaDoUsuario = caixaDeTexto.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Yasuo");
                System.out.println("A morte é como o vento, está sempre ao meu lado");
                break;
            case 2:
                System.out.println("Você escolheu o Gragas");
                System.out.println("Se você for beber, me chame!");
                break;
            case 3:
                System.out.println("Você escolheu o Aatrox");
                System.out.println("Eu... sou... a destruição!");
                break;
            default:
                System.out.println("Você não escolheu algo válido,");
                System.out.println("achei paia");
        }
        
        caixaDeTexto.close();
    }
}
