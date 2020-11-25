package com.deepika.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class WelcomeAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward actionForward = null;
		
		String path = mapping.getPath();
		System.out.println(path);
		
		if(path.equals("/landing")) {
			System.out.println("Requesting landing page");
			actionForward = mapping.findForward("homepage");
		} else if(path.equals("/authenticate")) {
			System.out.println("Requesting authenticate page");
			actionForward = mapping.findForward("welcome");
		}
		
		
		return actionForward;
	}
}
