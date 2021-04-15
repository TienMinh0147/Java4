/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;


import java.util.List;
import models.Baithi;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AccountDao {
    public Baithi InsertDanhMuc(Baithi baithi)
            throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            session.persist(baithi);
            trans.commit();
            return baithi;
        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }
   public Baithi UpdateBaithi(Baithi baithi)
            throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            session.saveOrUpdate(baithi);
            trans.commit();

            return baithi;
        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    } 
   public void  DeleteBaithi(int id)
            throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            Baithi baithi = (Baithi) session.load(Baithi.class, id);
            session.delete(baithi);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }
    public Baithi findBaithiById(int id)
            throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Baithi baithi = (Baithi) session.load(Baithi.class, id);

            return baithi;
        } catch (Exception ex) {

            throw ex;
        }

    }
    public List<Baithi> findAllBaithi()
            throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "FROM Baithi";
            Query query = session.createQuery(hql);

            return query.list();
        } catch (Exception ex) {

            throw ex;
        }

    }
    public List< Baithi> findBaithiByName(String name)
            throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "FROM Baithi WHERE Pin like :Pin";
            Query query = session.createQuery(hql);

            query.setParameter("Pin", name);

            return query.list();
        } catch (Exception ex) {

            throw ex;
        }

    }
}
