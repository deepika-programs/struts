package com.deepika.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

public class WelcomeActionForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private List<String> hobbies;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
}
