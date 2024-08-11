package org.weatherapp.hibernetConfig;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernetUtils {

        private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

        private static EntityManagerFactory buildEntityManagerFactory() {
            try {
                return Persistence.createEntityManagerFactory("pu");
            } catch (Throwable ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static EntityManager getEntityManager() {
            return entityManagerFactory.createEntityManager();
        }

        public static void shutdown() {
            if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
                entityManagerFactory.close();
            }
    }






}
