package org.weatherapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.weatherapp.User;
import org.weatherapp.hibernetConfig.HibernetUtils;

public class UserDao {  // doa database adding object


    public void saveUser (User user) {
        EntityTransaction transaction = null;
        try(EntityManager entityManager = HibernetUtils.getEntityManager()){
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(user);
            transaction.commit();
        }catch (Exception ex){
            throw new ExceptionInInitializerError(ex);
        }


    }
}
