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

	@GET     //All       OK
	@Path("companylist")
	@Produces(MediaType.APPLICATION_JSON)
	 public List <Company> getAllCompanies() throws ApplicationException{
			return companyController.getAllCompanies();
	 }
	

	@POST     // OK
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createCompany(Company company) throws ApplicationException{
		companyController.createCompany(company);
		System.out.println("in post");
	}
	
	@PUT   // OK
	@Consumes(MediaType.APPLICATION_JSON) 
	public void updateCoupon(Company company) throws ApplicationException{
		companyController.updateCompany(company);
	}
	
	
	@GET     // OK
	@Path("/{companyid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompany(@PathParam("companyid") long id) throws ApplicationException{
	return companyController.getCompanyByID(id);

	//	return coupon;
		 
	}
	
	@DELETE     // OK
	@Path("/{companyid}")
	public void deleteCompany(@PathParam("companyid") long id) throws ApplicationException{
		companyController.deleteCompany(id);
	}
  }

