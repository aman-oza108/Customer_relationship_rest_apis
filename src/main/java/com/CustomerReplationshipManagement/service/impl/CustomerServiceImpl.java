package com.CustomerReplationshipManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerReplationshipManagement.dao.CustomerDao;
import com.CustomerReplationshipManagement.entity.Customer;
import com.CustomerReplationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	// de (dependency injection)....
	CustomerDao dao;

	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String insertCustomer(Customer customer) {

		String msg = dao.insertCustomer(customer);
		return msg;

	}

	@Override
	public List<Customer> getCustomersLists() {

		List<Customer> list= dao.getCustomersLists();
		
		//we at this also able to write the blogic of conditions....
		return list;
	}

	@Override
	public Customer getCustomerById(int id) {
		
		
		
				Customer customer=dao.getCustomerById(id);
				
				return customer;
	}

	@Override
	public String updateCustomer(Customer customer) {
		
		return dao.updateCustomer(customer);
	}

	@Override
	public String deleteById(int id) {
		
		return dao.deleteById(id);
	}

	@Override
	public String insertMultipleCustomers(List<Customer> customers) {
	
		return dao.insertMultipleCustomers(customers);
	}

	@Override
	public List<Customer> Getapibyfirstname(String firstName) {
				return dao.Getapibyfirstname(firstName);
	}

	@Override
	public List<Customer> getcustomersbylessage(int age) {
		
		return dao.getcustomersbylessage(age);
	}

	@Override
	public List<Customer> getcustomersbygreaterage(int age) {
		
		return dao.getcustomersbygreaterage(age);
	}

	@Override
	public List<Customer> getcustomerbygage(int age) {
		
		return dao.getcustomerbygage(age);
	}

	@Override
	public List<Customer> getcustomerbylname(String lastName) {
		
		return dao.getcustomerbylname(lastName);
	}

	@Override
	public List<Customer> getcustomerbyemail(String email) {
		
		return dao.getcustomerbyemail(email);
	}

	@Override
	public List<Customer> getcustomerbymobilenum(String mobileNumber) {
		
		return dao.getcustomerbymobilenum(mobileNumber);
	}

	@Override
	public String updatefirstname(int id, String firstName) {
		
		return dao.updatefirstname(id, firstName);
	}

	@Override
	public String updatelastname(int id, String lastName) {
		
		return dao.updatelastname(id, lastName);
	}

	@Override
	public String updateemail(int id, String email) {
		
		return dao.updateemail(id, email);
	}

	@Override
	public String updatemobilenum(int id, String mobileNumber) {
		
		return dao.updatemobilenum(id, mobileNumber);
	}

	@Override
	public String updateage(int id, int age) {
		
		return dao.updateage(id, age);
	}

	@Override
	public List<String> getfirstnames() {
		
		return dao.getfirstnames();
	}

	@Override
	public List<String> getlastnames() {
		
		return dao.getlastnames();
	}

	@Override
	public List<String> getmailnames() {
		
		return dao.getmailnames();
	}

	

	
	
	
	
	
	

}
