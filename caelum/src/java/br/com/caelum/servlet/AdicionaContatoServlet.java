/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.servlet;

import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
/**
 *
 * @author luiz.dias
 */
public class AdicionaContatoServlet extends HttpServlet{
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, java.io.IOException{
        PrintWriter out = response.getWriter();
        
        //Recolhendo dados
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String dataEmTexto = request.getParameter("datanasc");
        Calendar datanasc = null;
        
        //converter data para o tipo calendar
        try{
            Date data = new SimpleDateFormat("dd/MM/yyyy")
                    .parse(dataEmTexto);
            datanasc = Calendar.getInstance();
            datanasc.setTime(data);
        }catch (ParseException e){
            out.println("Não convertido");
            return;
        }
        
        //Montando objeto
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEndereco(endereco);
        contato.setEmail(email);
        contato.setDataNascimento(datanasc);
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Contato " + contato.getNome() + 
                " adicionado com sucesso");    
        out.println("</body>");
        out.println("</html>");
    }
     
    }
