package com.service.user;

import javax.ws.rs.*;

@Path("/users/service")
public class UserServices
{
	@PUT
	@Path("/create")
	public void createUser()
	{
		
	}
	@GET
	public void getUser()
	{
		System.out.println("Inside getUser Method");
	}
	@POST
	public void updateUser()
	{
		System.out.println("Inside updateUser Method");
	}
	@DELETE
	public void deleteUser()
	{
	}
	@Path("/special")
	public SpecialUser getSpecialUser()
	{
		return new SpecialUser();
	}
}
