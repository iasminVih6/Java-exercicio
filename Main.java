import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        aluno.nota3 = sc.nextDouble();
        System.out.println();
        System.out.println("Média final = " + aluno.mediaFinal());

        if (aluno.mediaFinal() < 60) {
            System.out.println("SITUAÇÃO: REPROVADO!");
            System.out.println("Pontos faltados = " + aluno.pontosFaltados());
        } else {
            System.out.println("APROVADO");
        }


    }
}
