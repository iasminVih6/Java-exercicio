import java.util.Scanner;
public class Exercicio2Objetos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digite seu nome: ");
        estudante.nome = sc.next();
        System.out.println("Levando em conta que a ac1 valia 30 pontos , digite sua primeira nota: ");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Levando em conta que a ac2 valia 35 pontos , digite sua segunda nota: ");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Levando em conta que a ac3 valia 35 pontos , digite sua terceira nota: ");
        estudante.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("Nota final = " + estudante.notaFinal() );

        if(estudante.notaFinal() < 60){
            System.out.println("Reprovado");
            System.out.println("Pontos que faltaram = " + estudante.pontosQueFalta());
        } else {
            System.out.println(estudante.nome + " - Situação : Aprovado!");
        }












    }
}
