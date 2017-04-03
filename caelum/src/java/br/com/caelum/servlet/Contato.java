/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.servlet;

import java.util.Calendar;

/**
 *
 * @author luiz.dias
 */
public class Contato {
    String nome;
    String endereco;
    String email;
    Calendar datanasc;
    
    public Contato(){};
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setEndereco (String end){
        this.endereco = end;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
    public void setDataNascimento(Calendar nasc){
        this.datanasc = nasc;
    }
    
    public String getNome(){
        return this.nome;
    }
}