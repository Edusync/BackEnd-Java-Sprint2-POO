package Ex10;

public class Empregado {

    private String nome;
    private String departamento;
    private int horasTrabalhadasNoMes;
    private double salarioPorHora;

    public String mostraDados() {
        String dados = "";

        dados += "Nome: " + nome;
        dados += "\nDepartamento: " + departamento;
        dados += "\nHoras Trabalhadas por Mês: " + horasTrabalhadasNoMes;
        dados += "\nSalário por Hora: " + salarioPorHora;

        return dados;
    }

    public double calculaSalarioMensal() {
        return horasTrabalhadasNoMes * salarioPorHora;
    }

}
