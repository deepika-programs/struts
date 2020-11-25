package com.deepika.form;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class WelcomeActionForm extends ActionForm {
	private static final long serialVersionUID = 1L;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("Inside ActionForm");
		
		
		return super.validate(mapping, request);
	}
}
