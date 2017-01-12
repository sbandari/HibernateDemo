package mainclasses;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session; 
import model.employees;


public class ManageEmployee {

public static void main(String arg[]){
	Session s= HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	employees e= new employees();
	e.setAddress("909 alrington heights");
	e.setFirstName("santosh");
	e.setLastName("bandari");
	e.setCountry("india");
	e.setNotes("Okay i got this");
	try {
		e.setPhoto((new Imgtobyte()).extractBytes());
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	e.setBirthDate(new Date());
	e.setCity("hyderabad");
	e.setReportsTo(1);
	s.save(e);
	s.getTransaction().commit();
	
}
}
