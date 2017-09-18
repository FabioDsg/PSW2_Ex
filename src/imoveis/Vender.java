/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imoveis;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity( name = "Vender" )
public class Vender {
    
    @Id
    @GeneratedValue
    private int id;
    private double valor;
    private double comissao;

   
    public double getValor() {
        return valor;
    }

   
    public void setValor(double valor) {
        this.valor = valor;
    }

   
    public double getComissao() {
        return comissao;
    }

   
    public void setComissao(double comissao) {
        this.comissao = comissao;
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
