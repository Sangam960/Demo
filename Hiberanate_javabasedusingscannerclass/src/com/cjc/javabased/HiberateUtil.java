package com.cjc.javabased;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;


public class HiberateUtil {

	private static StandardServiceRegistry registry=null;
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getsessionFactory()
	{
		if(sessionFactory==null)
		{
			Map<String, Object> settings=new HashMap<>();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/test");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL55Dialect");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			settings.put(Environment.SHOW_SQL,"true");
			
			registry=new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds= new MetadataSources(registry);
			mds.addAnnotatedClass(Student.class);
			Metadata md=mds.getMetadataBuilder().build();
			sessionFactory=md.getSessionFactoryBuilder().build();
		}
		
	return sessionFactory;
		}
	}
