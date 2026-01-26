package Exercicios.Conditionals;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu e-mail:");
        String email = input.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = input.nextLine();

        if(email .equals("teste@teste.com") && senha .equals("1234")){
            System.out.println("Login efetudado com sucesso");
        } else{
            System.out.println("Login invalido!");
        }
    }
}
