public class Aluno {
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltados() {
        if (mediaFinal() <= 60) {
            return 60 - mediaFinal();
        } else {
            return 0;
        }
    }
}
