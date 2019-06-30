package com.musicweb.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;


public class showUsersAction {
	public String execute() throws IOException {
		Gson gson = new Gson();
		ActionContext context = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse)context.get(ServletActionContext.HTTP_RESPONSE);
		response.setContentType("text/json");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		

		out.print(gson.toJson());
		return null;
	}
}
