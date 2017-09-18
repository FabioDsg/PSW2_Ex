/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imoveis;

import model.Funcionario;
import model.Imovel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ra21503516
 */
public class Imoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            SessionFactory sf = new Configuration().configure().buildSessionFactory();

            Session session = sf.openSession();

            Transaction tx = session.beginTransaction();

           // Alugar alug = new Alugar();
            //alug.setValor(3.000);
            
            Funcionario f = new Funcionario("Jose Antonio");
            Imovel i = new Imovel("SHIS QL 3", "Brasilia", "DF", f);
            session.save(f);

            tx.commit();

            session.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        
        }

    }

}
