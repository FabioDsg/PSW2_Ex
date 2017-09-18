/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Imovel")
public class Imovel {

    @Id
    @GeneratedValue
    private int id;
    private int situacao;
    private String endereco;
    private String cidade;
    private String estado;

    public static final int DISPONIVEL = 1;
    public static final int ALUGADO = 2;
    public static final int VENDIDO = 3;

    public Imovel(String shis_ql_3, String brasilia, String df, Funcionario f) {
        this.cidade = cidade;
        this.endereco = endereco;
        this.estado = estado;
        this.situacao = situacao;
    }
    
    public Imovel(){};

    public int isSituação() {
        return situacao;
    }

    public void setSituação(int situação) {
        this.situacao = situacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
