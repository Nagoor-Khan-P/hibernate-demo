package com.fullstack.hibernate_demo.hibernate_config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

public class HibernateConfig {

	public SessionFactory buildSessionFactory() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata meta=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();
		return sessionFactory;
	}
}
