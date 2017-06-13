/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12151473perabotrt;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;


/**
 *
 * @author Dank Arif
 */
public class QueryPrabot {

    /**
     * @param args the command line arguments
     */
 public void Add(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perabotRT");
       EntityManager em = emf.createEntityManager(); 
        em.getTransaction().begin();
        try{
    em.persist(object);
    em.getTransaction().commit();
    
} catch (Exception e) {
    e.printStackTrace();
    em.getTransaction().rollback();

}finally {
    em.close();
}
        }
  public void Show(){
            System.out.println(""); 
            System.out.println("Data yang tersimpan :");   
            System.out.println("");
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perabotRT");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM perabot e");
        List<perabot> result = query.getResultList();
        for (perabot e : result) { 
            System.out.println("__________________________________________________________________________________________________");
            System.out.println("No." +e.getId()
                + " | kd_barang :"  +e.getKd_barang()
                + " | Nama :"  +e.getNama() 
                + " | Alamat :"  +e.getAlamat() 
                + " | No.Telpon :"  +e.getNo_telp() 
                + " | nama_barang :"  +e.getNama_barang() 
                + " | ");
            System.out.println("__________________________________________________________________________________________________"); 
        }
    }
     public void update(long id,String p,String q,String r,String s, String t){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perabotRT");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("UPDATE perabot e SET e.nama=?1,e.alamat=?2,e.no_telp=?3,e.nama_barang=?4 WHERE e.kd_barang=?5",perabot.class)
                .setParameter(1, q)
                .setParameter(2, r)
                .setParameter(3, s)
                .setParameter(4, t)
                .setParameter(5, p)
                .executeUpdate();
        em.getTransaction().commit();
    }
     public void Delete(String p){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perabotRT");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String hapus = p;
        em.createQuery("DELETE FROM perabot e WHERE e.kd_barang=:par").setParameter("par", hapus).executeUpdate();
        em.getTransaction().commit();
    }
}


      
        
    
    

