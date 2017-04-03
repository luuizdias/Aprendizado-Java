/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author luiz.dias
 */
public class CadastroServlet extends HttpServlet{
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, java.io.IOException{
        PrintWriter out = response.getWriter();
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        //Recolhendo dados
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        
        String nomep = request.getParameter("nomep");
        String marca = request.getParameter("marca");
        String preco = request.getParameter("preco");
        
               
        Double preco1 = Double.parseDouble(preco);
        
        //Montando objeto
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEndereco(endereco);
        c.setEmail(email);
        c.setTelefone(telefone);
        
        Produto p = new Produto();
        p.setNome(nomep);
        p.setMarca(marca);
        p.setPreco(preco1);
               
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(c);
        session.saveOrUpdate(p);
    
        tx.commit();
        session.flush();
        session.close();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Contato " + c.getNome() + 
                " adicionado com sucesso");
        out.println("Produto " + p.getNome() + 
                " adicionado com sucesso");   
        out.println("</body>");
        out.println("</html>");
    }
}
