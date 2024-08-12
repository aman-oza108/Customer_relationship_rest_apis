package com.CustomerReplationshipManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerReplationshipManagement.entity.Customer;
import com.CustomerReplationshipManagement.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	// dependency injection.....
	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		String msg = customerService.insertCustomer(customer);

		return msg;
	}

	@GetMapping
	public List<Customer> getCustomersLists() {

		List<Customer> list = customerService.getCustomersLists();

		// we at this also able to write the blogic of conditions....
		return list;
	}

	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {

		Customer customer = customerService.getCustomerById(id);

		return customer;
	}

	@PutMapping
	public String updateCustomer(@RequestBody Customer customer) {

		return customerService.updateCustomer(customer);
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
		return customerService.deleteById(id);
	}

	@PostMapping
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
		return customerService.insertMultipleCustomers(customers);
	}

	@GetMapping("/byname/{firstName}")
	public List<Customer> Getapibyfirstname(@PathVariable String firstName) {
		return customerService.Getapibyfirstname(firstName);
	}

	@GetMapping("/bylessage/{age}")

	public List<Customer> getcustomersbylessage(@PathVariable int age) {

		return customerService.getcustomersbylessage(age);
	}

	@GetMapping("/byage/{age}")

	public List<Customer> getcustomersbygreaterage(@PathVariable int age) {

		return customerService.getcustomerbygage(age);
	}

	@GetMapping("/bylname/{lastName}")
	public List<Customer> getcustomerbylname(@PathVariable String lastName) {
		return customerService.getcustomerbylname(lastName);
	}

	@GetMapping("/byemail/{email}")

	public List<Customer> getcustomerbyemail(@PathVariable String email) {
		return customerService.getcustomerbyemail(email);
	}

	@GetMapping("/bymob/{mobileNumber}")
	public List<Customer> getcustomerbymobilenum(@PathVariable String mobileNumber) {
		return customerService.getcustomerbymobilenum(mobileNumber);
	}

	@PutMapping("/{id}")
	public String updatefirstname(@PathVariable int id, @RequestBody Map<String, String> request) {
		String firstName = request.get("firstName");
		return customerService.updatefirstname(id, firstName);
	}

	@PutMapping("lastnm/{id}")
	public String updatelastname(@PathVariable int id, @RequestBody Map<String, String> request) {
		String lastName = request.get("lastName");
		return customerService.updatelastname(id, lastName);
	}

	
	@PutMapping ("mail/{id}")  
	public String updateemail(@PathVariable int id ,@RequestBody Map<String, String> request) {

		
		String email=request.get("email"); 
		
		return customerService.updateemail(id, email);
		
	}
	
	@PutMapping("mob/{id}")
	public String updatemobilenum(@PathVariable int id, @RequestBody Map<String, String> request) {
		
		String mobile=request.get("mobileNumber");
		return customerService.updatemobilenum(id, mobile);
		
	}
	
	@PutMapping("age/{id}")
	public String updateage(@PathVariable  int id, @RequestBody Map<String, Integer> request)
	{
		int Age=request.get("age");
		return customerService.updateage(id, Age);
	}

	
	@GetMapping("/firstnames")
	public List<String> getfirstnames()
	{
		return customerService.getfirstnames();
	}
	
	
	@GetMapping("/lastnames")
	public List<String> getlastnames()
	{
		return customerService.getlastnames();
	}
	
	@GetMapping("/mailnames")
	public List<String> getmailnames()
	{
		return customerService.getmailnames();
	}
	
	
	
}
