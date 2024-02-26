package com.code.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate������
 * @author Administrator
 *
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * ��ȡ��̬����
	 * @return
	 */
    private static SessionFactory buildSessionFactory() {
    	Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
    }

    /**
     * ��ȡsession����
     * @return
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
