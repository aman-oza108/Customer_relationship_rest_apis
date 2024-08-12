package com.CustomerReplationshipManagement.service;

import java.util.List;

import org.hibernate.Session;

import com.CustomerReplationshipManagement.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);

	List<Customer> getCustomersLists();

	Customer getCustomerById(int id);

	String updateCustomer(Customer customer);

	String deleteById(int id);

	String insertMultipleCustomers(List<Customer> customers);

	List<Customer> Getapibyfirstname(String firstName);

	List<Customer> getcustomersbylessage(int age);

	List<Customer> getcustomersbygreaterage(int age);

	List<Customer> getcustomerbygage(int age);

	List<Customer> getcustomerbylname(String lastName);

	List<Customer> getcustomerbyemail(String email);

	List<Customer> getcustomerbymobilenum(String mobileNumber);

	String updatefirstname(int id, String firstName);

	String updatelastname(int id, String lastName);

	String updateemail(int id, String email);

	String updatemobilenum(int id, String mobileNumber);

	String updateage(int id, int age);

	List<String> getfirstnames();

	List<String> getlastnames();

	List<String> getmailnames();
	
	

}
