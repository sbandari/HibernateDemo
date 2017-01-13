package mainclasses;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import model.employees;

public class ManageEmployee {

	public static void main(String arg[]) {
		Session s = HibernateUtil.getSessionFactory().openSession();

		// get the manger from the database
		employees sm = new employees();
		try {
			s.beginTransaction();
			employees manager = (employees) s.get(employees.class, 1);
			sm = manager;
			if (manager != null)
				System.out.println(manager.getLastName());

		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();

		}

		employees e = new employees();
		e.setAddress("909 alrington heights");
		e.setFirstName("santosh");
		e.setLastName("bandari");
		e.setCountry("india");
		e.setNotes("Okay 555 i got this");
		try {
			e.setPhoto((new Imgtobyte()).extractBytes());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		e.setBirthDate(new Date());
		e.setCity("hyderabad");
		e.setManager(sm);
		// e.setReportsTo(sm.getEmployeeID());
		s.save(e);
		// s.save(e4);
		// s.save(manager);

		s.getTransaction().commit();

	}
}
