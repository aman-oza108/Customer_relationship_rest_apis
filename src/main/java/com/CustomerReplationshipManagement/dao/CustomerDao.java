package com.CustomerReplationshipManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.CustomerReplationshipManagement.entity.Customer;

//database ka code dao me hota hai....

@Repository
public class CustomerDao {

	SessionFactory sf;

	public CustomerDao(SessionFactory sf) { // constuctor dependency injection
		super();
		this.sf = sf;
	}

	public String insertCustomer(Customer customer) {
		Session session = sf.openSession();
		// insert,update,delete=> you need to used transaction

		Transaction transaction = session.beginTransaction();

		// save name ki metthod hai session ki=>session

		session.save(customer); // to save data or insert data

		transaction.commit();
		session.close();

		return "customer insert succesfully";

	}

	public List<Customer> getCustomersLists() {
		Session session = sf.openSession();
		return session.createQuery("from Customer").list();

	}

	public Customer getCustomerById(int id) {
		Session session = sf.openSession();

		Customer customer = session.get(Customer.class, id);

		return customer;
	}

	public String updateCustomer(Customer customer) {
		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		session.update(customer);
		tr.commit();
		session.close();

		return "customer updated succesfully....";
	}

	public String deleteById(int id) {
		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		Customer customer = session.get(Customer.class, id);

		session.delete(customer);

		tr.commit();

		session.close();

		return "customer deleted succesfully....";
	}

	public String insertMultipleCustomers(List<Customer> customers) {
		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		for (Customer cus : customers) {

			session.save(cus);
		}

		tr.commit();
		session.close();

		return "Multiple customers are inserted succsesfully....";
	}

	public List<Customer> Getapibyfirstname(String firstName)

	{
		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where  c.firstName=:firstName",
				Customer.class);

		customers.setParameter("firstName", firstName);
		List<Customer> list = customers.list();

		return list;
	}

	public List<Customer> getcustomersbylessage(int age) {
		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where c.age<:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getcustomersbygreaterage(int age) {
		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where c.age>:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getcustomerbygage(int age) {
		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where c.age=:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getcustomerbylname(String lastName) {

		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where c.lastName=:lastName", Customer.class);
		customers.setParameter("lastName", lastName);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getcustomerbyemail(String email) {

		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where c.email=:email", Customer.class);
		customers.setParameter("email", email);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getcustomerbymobilenum(String mobileNumber) {

		Session session = sf.openSession();

		Query<Customer> customers = session.createQuery("from Customer c where c.mobileNumber=:mobileNumber",
				Customer.class);
		customers.setParameter("mobileNumber", mobileNumber);
		List<Customer> list = customers.list();

		return list;

	}

	public String updatefirstname(int id, String firstName) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);

		customer.setFirstName(firstName);

		tr.commit();
		session.close();

		return "updated succsesfully...";
	}

	public String updatelastname(int id, String lastName) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);

		customer.setLastName(lastName);

		tr.commit();
		session.close();

		return "updated succsesfully...";
	}

	public String updateemail(int id, String email) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);

		customer.setEmail(email);

		tr.commit();
		session.close();

		return " Email updated succsesfully...";
	}

	public String updatemobilenum(int id, String mobileNumber) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);

		customer.setMobileNumber(mobileNumber);

		tr.commit();
		session.close();

		return " mobilenumber updated succsesfully...";
	}

	public String updateage(int id, int age) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);

		customer.setAge(age);

		tr.commit();
		session.close();

		return " Age updated succsesfully...";
	}

	public List<String> getfirstnames() {
		Session session = sf.openSession();

		return session.createQuery("select c.firstName from Customer c").list();

	}

	public List<String> getlastnames() {
		Session session = sf.openSession();

		return session.createQuery("select c.lastName from Customer c").list();

	}

	public List<String> getmailnames() {
		Session session = sf.openSession();

		return session.createQuery("select c.email from Customer c").list();

	}
	
	
	public List<Integer> getallages() {
		Session session = sf.openSession();

		return session.createQuery("select c.age from Customer c").list();

	}
	
	
}
