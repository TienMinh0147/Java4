/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.dao;

import Helpers.NewHibernateUtil;
import ModelClass.Products;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MINH
 */
public class ProductDao {

    public Products insertProduct(Products entity)
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

    public Products updateProduct(Products entity)
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

    public void deleteProduct(int id)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        try {
            Products entity = (Products) session.load(Products.class, id);

            session.delete(entity);
            trans.commit();

        } catch (Exception ex) {
            trans.rollback();
            throw ex;
        }
    }

    public Products findProductById(int id)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            Products entity = (Products) session.load(Products.class, id);

            return entity;

        } catch (Exception ex) {

            throw ex;
        }
    }

    public List<Products> findAllProducts()
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "FROM Products";
            Query query = session.createQuery(hql);

            return query.list();

        } catch (Exception ex) {

            throw ex;
        }
    }

    public List<Products> findProductsByName(String name)
            throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "FROM Products WHERE name like: name";
            Query query = session.createQuery(hql);
            query.setParameter("name", name);

            return query.list();

        } catch (Exception ex) {

            throw ex;
        }
    }
}
