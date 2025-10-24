public class Estudante {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }
    public double pontosQueFalta(){
        if(notaFinal() < 60){
            return 60 - notaFinal();
        } else {
            return 0;
        }

    }

}
