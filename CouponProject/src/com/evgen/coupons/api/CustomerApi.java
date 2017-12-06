package com.evgen.coupons.api;



import javax.ws.rs.core.MediaType;
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
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public void createCustomer(Customer customer) throws ApplicationException{
			this.customerController.createCustomer(customer);
		}
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON) 
		public void updateCustomer(Customer customer) throws ApplicationException{
			System.out.println(customer);
		}
		
		
		@GET
		@Path("/{couponId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Customer getCustomer(@PathParam("couponId") long id) throws ApplicationException{
		return customerController.getCustomerByID(id);

		//	return coupon;
			 
		}
		
		@DELETE
		@Path("/{customerId}")
		public void deleteCustomer(@PathParam("customerId") long id) throws ApplicationException{
			System.out.println("deleted");
		}
		
	}

