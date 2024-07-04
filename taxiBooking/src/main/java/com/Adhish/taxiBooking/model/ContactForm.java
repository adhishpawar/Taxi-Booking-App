package com.Adhish.taxiBooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ContactForm {

	private String name;
	private String email;
	private Long phone;
	private String message;
	
	
	
}
