package com.lti.hib_ex.Hibernate_Proj;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.lti.hib_ex.Hibernate_Proj.Employee;

public class App {
public static void main(String args[]){
	Configuration configuration = new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory = configuration.buildSessionFactory(builder.build());
	Session session = factory.openSession();
	Employee employee = new Employee();
	employee.setEmpName("HARSHITHA");
	employee.setBranch("bangalore");
	Employee employ=new Employee();
	employ.setEmpName("Vybhav");
	employ.setBranch("Mangalore");
	
	session.beginTransaction();
	session.save(employee);
	session.getTransaction().commit();
	
}
}
