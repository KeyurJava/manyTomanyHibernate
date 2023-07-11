package miit.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import miit.pojo.Employees;
import miit.pojo.Projects;

public class HibernateUtilities {

	public static SessionFactory hibernateUtils() {

		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Employees.class);
		configuration.addAnnotatedClass(Projects.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory().getSessionFactory();
		return sessionFactory;
	}

}
