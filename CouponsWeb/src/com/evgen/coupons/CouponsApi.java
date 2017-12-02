package com.evgen.coupons;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.evgen.coupons.beans.Coupon;
import com.evgen.coupons.exceptions.ApplicationException;
import com.evgen.coupons.logic.CouponController;

@Path("/coupons")
public class CouponsApi {

private CouponController couponController;
	
	public CouponsApi(){
		this.couponController = new CouponController();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createCoupon(Coupon coupon) throws ApplicationException{
		this.couponController.createCoupon(coupon);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON) 
	public void updateCoupon(Coupon coupon) throws ApplicationException{
		System.out.println(coupon);
	}
	
	
	@GET
	@Path("/{couponId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Coupon getCoupon(@PathParam("couponId") long id) throws ApplicationException{
		Coupon coupon = new Coupon(1, 100, "Cola");
	//	couponController.getCouponByID(id);
		System.out.println("In get");

		return coupon;
		 
	}
	
	@DELETE
	@Path("/{couponId}")
	public void deleteCoupon(@PathParam("couponId") long id) throws ApplicationException{
		System.out.println("deleted");
	}
	
}
