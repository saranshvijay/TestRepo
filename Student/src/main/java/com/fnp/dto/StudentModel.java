package com.fnp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


public class StudentModel {
	
	@NotNull
	private int id;
	@NotBlank(message = "name cant be empty.")
	private String name;
	@Email(message = "please enter correct format.")
	private String email;
	@NotNull
	private long phone;
	
	
	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentModel(@NotNull int id, @NotBlank(message = "name cant be empty.") String name,
			@Email(message = "please enter correct format.") String email, @NotNull long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
}
