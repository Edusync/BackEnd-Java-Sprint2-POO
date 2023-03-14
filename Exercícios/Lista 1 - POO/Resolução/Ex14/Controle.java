package Ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {

    List<Aluno> alunos = new ArrayList<Aluno>();
    boolean encerrar = false;

    Scanner input = new Scanner(System.in);

    public void inserirAlunos() {
        do {
            System.out.println("Insira o nome do aluno: (ou fim para encerrar)");
            String nome = input.nextLine();
            if(nome.equalsIgnoreCase("fim"))
                encerrar = true;

            if(!encerrar) {
                System.out.println("Insira a primeira nota parcial do aluno: ");
                int primeiraNota = input.nextInt();
                System.out.println("Insira a segunda nota parcial do aluno: ");
                int segundaNota = input.nextInt();
                input.nextLine();

                alunos.add(new Aluno(primeiraNota, segundaNota, nome));
            }

        } while(!encerrar);

        int media = media();
        System.out.println("Média da Turma: " + media);
        System.out.println("Quantidade de aprovados: " + calcularQuantidadadeAprovados(media));
        System.out.println("Quantidade de reprovados: " + calcularQuantidadadeReprovados(media));
        System.out.println("Quantidade de alunos que vão para a final: " + calcularQuantidadadeFinal(media));
        System.out.println("-----------------------------------------");
        System.out.println("Nomes dos alunos com nota abaixo da média: " + pegarAlunosAbaixoDaMedia(media));
    }

    public int media() {
        int soma = 0;
        for (int i = 0; i < alunos.size(); i++) {
            int notaAluno = (alunos.get(i).getPrimeiraNotaParcial() + alunos.get(i).getSegundaNotaParcial()) / 2;
            soma += notaAluno;
        }

        return soma / alunos.size();
    }

    public int calcularQuantidadadeAprovados(int media) {
        int quantidade = 0;
        for (int i = 0; i < alunos.size(); i++) {
            int notaAluno = (alunos.get(i).getPrimeiraNotaParcial() + alunos.get(i).getSegundaNotaParcial()) / 2;
            if(notaAluno > 6) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int calcularQuantidadadeReprovados(int media) {
        int quantidade = 0;
        for (int i = 0; i < alunos.size(); i++) {
            int notaAluno = (alunos.get(i).getPrimeiraNotaParcial() + alunos.get(i).getSegundaNotaParcial()) / 2;
            if(notaAluno < 5) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int calcularQuantidadadeFinal(int media) {
        int quantidade = 0;
        for (int i = 0; i < alunos.size(); i++) {
            int notaAluno = (alunos.get(i).getPrimeiraNotaParcial() + alunos.get(i).getSegundaNotaParcial()) / 2;
            if(notaAluno < 6 && notaAluno > 5) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public String pegarAlunosAbaixoDaMedia(int media) {
        String nomes = "";
        for (int i = 0; i < alunos.size(); i++) {
            int notaAluno = (alunos.get(i).getPrimeiraNotaParcial() + alunos.get(i).getSegundaNotaParcial()) / 2;
            if(notaAluno < media) {
                nomes += alunos.get(i).getNome() + "\n";
            }
        }
        return nomes;
    }

}
