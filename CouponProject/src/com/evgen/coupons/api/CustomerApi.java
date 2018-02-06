package com.evgen.coupons.api;



import javax.ws.rs.core.MediaType;

import java.util.List;

import javax.ws.rs.*;
import com.evgen.coupons.beans.Coupon;
import com.evgen.coupons.beans.Customer;
import com.evgen.coupons.exceptions.ApplicationException;
import com.evgen.coupons.logic.CustomerController;

@Path("/customer")
public class CustomerApi {

	private CustomerController customerController;
		
		public CustomerApi(){
			this.customerController = new CustomerController();
		}
		
		@POST           // OK
		@Path("/create")
		@Consumes(MediaType.APPLICATION_JSON)
		public void createCustomer(Customer customer) throws ApplicationException{
			customerController.createCustomer(customer);
			System.out.println("in post" + customer.toString());
		}
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON) 
		public void updateCustomer(Customer customer) throws ApplicationException{
			System.out.println(customer);
			System.out.println("in put");
		}
		
		
		@GET           // OK
		@Path("/{customerId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Customer getCustomer(@PathParam("customerId") long id) throws ApplicationException{
		return customerController.getCustomerByID(id);

		}
		
		@GET           // OK
		@Path("customerslist")
		@Produces(MediaType.APPLICATION_JSON)
		public List <Customer> getAllcustomers() throws ApplicationException{
			return customerController.getAllCustomers();
		}
		
	
		@DELETE
		@Path("/{customerId}")
		public void deleteCustomer(@PathParam("customerId") long id) throws ApplicationException{
			customerController.deleteCustomer(id);
		}
		
	}

