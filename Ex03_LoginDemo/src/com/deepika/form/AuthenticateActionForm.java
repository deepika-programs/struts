package com.deepika.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AuthenticateActionForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String pass;
	
	
	public String getUserid() { return userid; }
	public void setUserid(String userid) { this.userid = userid; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("AuthenticateActionForm");
		System.out.println(userid);
		System.out.println(pass);
		
		
		
		ActionErrors errors = new ActionErrors();
		
		if(!userid.equals("admin")) {
			errors.add("userid", new ActionMessage("err.userid", "Invalid User ID"));
		}
		if(!pass.equals("password")) {
			errors.add("pass", new ActionMessage("err.pass", "Invalid Password"));
		}
		return errors;
	}
}
