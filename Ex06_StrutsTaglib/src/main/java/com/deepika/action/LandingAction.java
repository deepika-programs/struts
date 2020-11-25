package com.deepika.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.deepika.form.WelcomeActionForm;

public class LandingAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		WelcomeActionForm welcomeActionForm = (WelcomeActionForm) form;
		
		System.out.println(welcomeActionForm.getName());
		
		return mapping.findForward("landing");
	}
}
