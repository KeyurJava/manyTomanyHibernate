package miit.crud;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import miit.pojo.Employees;
import miit.pojo.Projects;
import miit.utilities.HibernateUtilities;

public class AddRecords {

	public static void main(String[] args) {

		Employees e1 = new Employees();
		Employees e2 = new Employees();

		e1.setEid(1);
		e1.setEname("Keyur");

		e2.setEid(2);
		e2.setEname("Karan");

		Projects p1 = new Projects();
		Projects p2 = new Projects();

		p1.setPid(1);
		p1.setPname("Support Session");

		p2.setPid(2);
		p2.setPname("Maketing Camps");

		List<Employees> lemp = new ArrayList<Employees>();
		lemp.add(e1);
		lemp.add(e2);

		List<Projects> lpro = new ArrayList<Projects>();
		lpro.add(p1);
		lpro.add(p2);

		e1.setProjects(lpro);
		p2.setElist(lemp);

		Session session = HibernateUtilities.hibernateUtils().openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
		session.close();

	}

}
