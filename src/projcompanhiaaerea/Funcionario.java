/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projcompanhiaaerea;

/**
 *
 * @author 02210412650
 */
public class Funcionario {
    private String nome, cargo, dataNascimento, dataAdmissao; 
    private int cpf, codFuncionario;
    private double salario;
    private static int qtdFuncionarios;

    
    Funcionario(){
        Funcionario.qtdFuncionarios = Funcionario.qtdFuncionarios+1;
        this.codFuncionario = qtdFuncionarios;
    }
    
    public static int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    void mostraFuncionario(){
        System.out.println("Nome Funcionario: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Data de Admissao: " + this.getDataAdmissao());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salario: R$" + this.getSalario());
    }
}
