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
public class Passageiro {
    private String nome, email, telefone, dataNascimento;
    private int cpf, codPassageiro;
    private double pesoBagagem;
    private static int qtdPassageiros;

    //quando a lista de passageiros for implementada na classe voo, um atributo voo sera adicionado na classe Passageiro
    
    Passageiro(){
        Passageiro.qtdPassageiros = Passageiro.qtdPassageiros+1;
        this.codPassageiro = qtdPassageiros;
    }
    
    public static int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public int getCodPassageiro() {
        return codPassageiro;
    }

    public void setCodPassageiro(int codPassageiro) {
        this.codPassageiro = codPassageiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(double pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }
    
    void mostraPassageiro(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Data Nascimento: " + this.getDataNascimento());
        System.out.println("Peso da Bagagem: " + this.getPesoBagagem() + "kg");
    }
    
    
}
