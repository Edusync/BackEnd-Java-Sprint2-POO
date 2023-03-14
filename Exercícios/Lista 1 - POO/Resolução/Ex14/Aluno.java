package Ex14;

public class Aluno {

    private int primeiraNotaParcial;
    private int segundaNotaParcial;
    private String nome;

    public Aluno(int primeiraNotaParcial, int segundaNotaParcial, String nome) {
        this.primeiraNotaParcial = primeiraNotaParcial;
        this.segundaNotaParcial = segundaNotaParcial;
        this.nome = nome;
    }

    public int getPrimeiraNotaParcial() {
        return primeiraNotaParcial;
    }

    public int getSegundaNotaParcial() {
        return segundaNotaParcial;
    }

    public String getNome() {
        return nome;
    }
}
