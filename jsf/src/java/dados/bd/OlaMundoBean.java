/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados.bd;

import java.io.PrintWriter;
import java.util.*;
import java.text.*;
import javax.faces.bean.*;
/**
 *
 * @author luiz.dias
 */
@ManagedBean
public class OlaMundoBean {
    
    public String getHorario(){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        return sdf.format(new Date());
    }
    private String mensagem = "Quem é vc?  ";
    
    public String getMensagem(){
      return mensagem;
    }
    
    private String nome;
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String nomeFoiDigitado(){
        return("<html>" + "<body>" +  "Contato " + getNome() + 
                " adicionado com sucesso" + "</body>" + "</html>"); 

    }
}
