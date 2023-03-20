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
public class Voo {
    private int codVoo;
    private static int qtdVoos;
    private String origem, destino, dataHoraSaida;
    Aeronave aviao;
    
    Voo(Passageiro passageiro, Aeronave aeronave, Aeroporto aeroporto){
        Voo.qtdVoos = Voo.qtdVoos+1;
        this.codVoo = qtdVoos;
    }
    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
    
    void mostraVoo(){
        System.out.println("Origem: " + getOrigem());
        System.out.println("Destino: " + getDestino());
        System.out.println("Data de Saida: " + getDataHoraSaida());
    }
}
