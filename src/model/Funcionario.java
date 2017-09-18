/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity( name = "Funcionario" )
public class Funcionario {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    
    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private  List <Imovel> imoveis = new ArrayList();
    
    public Funcionario(){};       
    
    public Funcionario(String nome){
        this.nome = nome;
    }
        
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
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
