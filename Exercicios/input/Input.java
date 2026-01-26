package Exercicios.input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome = " + nome + "\t \n idade = " + idade);
        scanner.close();
    }
}
