package com.Adhish.taxiBooking.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Adhish.taxiBooking.model.ContactForm;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@GetMapping({"/","/home"})
	public String welcomeView(HttpServletRequest req, Model m)
	{
		String requestURI = req.getRequestURI();
		m.addAttribute("myCurrentPage",requestURI);
		return "index";
	}
	
	@GetMapping("/about")
	public String aboutView(HttpServletRequest req, Model m)
	{
		String requestURI = req.getRequestURI();
		m.addAttribute("myCurrentPage",requestURI);
		return "about";
	}
	
	@GetMapping("/cars")
	public String carsView(HttpServletRequest req, Model m)
	{
		String requestURI = req.getRequestURI();
		m.addAttribute("myCurrentPage",requestURI);
		return "cars";
	}
	
	@GetMapping("/contacts")
	public String contextView(HttpServletRequest req, Model m)
	{
		String requestURI = req.getRequestURI();
		m.addAttribute("myCurrentPage",requestURI);
		m.addAttribute("contactform", new ContactForm());
		return "contacts";
	}
	
	@GetMapping("/services")
	public String servicesView(HttpServletRequest req, Model m)
	{
		String requestURI = req.getRequestURI();
		m.addAttribute("myCurrentPage",requestURI);
		return "services";
	}
	
	@PostMapping("/contactForm")
	public String contactForm(@ModelAttribute ContactForm contactForm,Model m)
	{

		System.out.println(contactForm);
		return "contacts";
	}
	
	
}
