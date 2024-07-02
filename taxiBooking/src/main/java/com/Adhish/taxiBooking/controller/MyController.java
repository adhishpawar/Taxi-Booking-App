package com.Adhish.taxiBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping({" ","/home","/welcome"})
	public String welcomeView()
	{
		return "index";
	}
	
	@GetMapping("/about")
	public String aboutView()
	{
		return "about";
	}
	
	@GetMapping("/cars")
	public String carsView()
	{
		return "cars";
	}
	
	@GetMapping("/contacts")
	public String contextView()
	{
		return "contacts";
	}
	
	@GetMapping("/services")
	public String servicesView()
	{
		return "services";
	}
}
