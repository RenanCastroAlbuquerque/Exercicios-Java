package Exercicios.Conditionals;

import java.util.Scanner;

public class RegistroSimples {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String nome = input.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = input.nextLine();

        System.out.print("Digite sua Sennha: ");
        String senha = input.nextLine();

        System.out.print("Confirme sua senha: ");
        String confirmarSenha = input.nextLine();

        if (senha .equals(confirmarSenha)){
            System.out.println("Seja bem- vindo! \n" + nome);
        } else{
            System.out.println("Falha ao fazer o login! \n" + "Tente novamente!");
        }
    }
}