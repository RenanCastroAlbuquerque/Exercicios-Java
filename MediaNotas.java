package Exercicios;

public class MediaNotas {
    public static void main(String[] args){
        // Media de notas do aluno
        float mat = 8.4F;
        short port = 10;
        double programacao = 7.7;
        double ciencias = 4.2;
        final double media = (mat + port + programacao + ciencias) / 4;
        System.out.println("Media do aluno: " + media);
    }
}
