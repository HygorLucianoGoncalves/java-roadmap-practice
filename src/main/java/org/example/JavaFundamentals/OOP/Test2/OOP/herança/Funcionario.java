package org.example.JavaFundamentals.OOP.Test2.OOP.herança;

class teste{
    public static void main(String[] args) {

        Programador programador = new Programador();
        programador.setNome("Nome");
        programador.setCpf("CPF");
        programador.setSalario(1000);
        programador.setTeamGroup("GRUOPO2o");

        System.out.println(programador);

    }


}
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
class Programador extends Funcionario    {  //todos os atributos em Funcionario foram atribuidos a classe Programador }
    private String teamGroup;

    public String getTeamGroup() {
        return teamGroup;
    }

    public void setTeamGroup(String teamGroup) {
        this.teamGroup = teamGroup;
    }

    @Override
    public String toString() {

        return super.toString() + " Programador{" +
                "teamGroup='" + teamGroup + '\'' +
                '}';
    }
}