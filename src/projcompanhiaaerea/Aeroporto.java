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
public class Aeroporto {
    private String nomeAeroporto;
    private int codAeroporto;
    private static int qtdAeroportos;

    Aeroporto(){
        Aeroporto.qtdAeroportos = Aeroporto.qtdAeroportos+1;
        this.codAeroporto = qtdAeroportos;
    }
    
    public static int getQtdAeroportos() {
        return qtdAeroportos;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public int getCodAeroporto() {
        return codAeroporto;
    }

    public void setCodAeroporto(int codAeroporto) {
        this.codAeroporto = codAeroporto;
    }
    
    void mostraAeroporto(){
        System.out.println("Nome Aeroporto: " + this.getNomeAeroporto());
    }
    
    
}
