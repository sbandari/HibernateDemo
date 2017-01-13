package mainclasses;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
private static SessionFactory sessionFactory=buildSessinFactory();

private static SessionFactory buildSessinFactory() {
	Configuration con = new Configuration();
	con.configure("hibernate.cfb.xml");
	ServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	sessionFactory =con.buildSessionFactory(sr);
	 return sessionFactory;
}
public static SessionFactory getSessionFactory() {
    return sessionFactory;
}

public static void shutdown() {
	// Close caches and connection pools
	getSessionFactory().close();
}

}