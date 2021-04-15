/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.dao;

import Helpers.NewHibernateUtil;
import ModelClass.Categories;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MINH
 */
public class CategoryDao {

    public Categories insertCategory(Categories entity)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            session.persist(entity);
            trans.commit();
            return entity;

        } catch (Exception ex) {
            trans.rollback();
            throw ex;
        }
    }

    public Categories UpdateCategory(Categories entity)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            session.saveOrUpdate(entity);
            trans.commit();
            return entity;

        } catch (Exception ex) {
            trans.rollback();
            throw ex;
        }
    }

    public void deleteCategory(int id)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            Categories entity = (Categories) session.load(Categories.class, id);

            session.delete(entity);
            trans.commit();

        } catch (Exception ex) {
            trans.rollback();
            throw ex;
        }
    }

    public Categories findCategoryById(int id)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            Categories entity = (Categories) session.load(Categories.class, id);

            return entity;

        } catch (Exception ex) {

            throw ex;
        }
    }

    public List<Categories> findAllCategories()
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "FROM Categories";
            Query query = session.createQuery(hql);

            return query.list();

        } catch (Exception ex) {

            throw ex;
        }
    }

    public List<Categories> findCategoriesByName(String name)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "FROM Categories WHERE name like   :name";
            Query query = session.createQuery(hql);
            query.setParameter("name", name);

            return query.list();

        } catch (Exception ex) {

            throw ex;
        }
    }
}
