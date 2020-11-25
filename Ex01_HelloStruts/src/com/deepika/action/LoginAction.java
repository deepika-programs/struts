package com.deepika.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionForward forward = null; 
		
		int a = 5+5;
		
		if(a > 9) {
			forward = mapping.findForward("success");
		} else  {
			forward = mapping.findForward("failure");
		}
		
		return forward;
	}
	
}
