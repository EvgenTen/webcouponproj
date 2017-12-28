package com.evgen.coupons.api;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.evgen.coupons.beans.Company;
import com.evgen.coupons.beans.Coupon;
import com.evgen.coupons.dao.CompanyDao;
import com.evgen.coupons.exceptions.ApplicationException;
import com.evgen.coupons.logic.CompanyController;


@Path("/company")
public class CompanyApi 
{
	//CompanyDao companyDao = new CompanyDao();
	CompanyController companyController = new CompanyController();

	@GET     //All
	@Produces(MediaType.APPLICATION_JSON)
	 List<Company> companyList() throws ApplicationException
	 {
			return companyController.getAllCompanies();
	 }
	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createCompany(Company company) throws ApplicationException{
		this.companyController.createCompany(company);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON) 
	public void updateCoupon(Company company) throws ApplicationException{
		System.out.println(company);
	}
	
	
	@GET
	@Path("/{couponId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompany(@PathParam("couponId") long id) throws ApplicationException{
	return companyController.getCompanyByID(id);

	//	return coupon;
		 
	}
	
	@DELETE
	@Path("/{couponId}")
	public void deleteCoupon(@PathParam("couponId") long id) throws ApplicationException{
		System.out.println("deleted");
	}
  }

