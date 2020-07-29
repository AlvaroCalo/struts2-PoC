package com.web.dispatcher;

import com.opensymphony.xwork2.ActionSupport;
import com.web.modelos.Email;

@SuppressWarnings("serial")
public class EmailDispatcher extends ActionSupport  {
	
	// Atributos
	
	Email correo = new Email();
	
	public String enviarEmail() {
		
		System.out.println(correo.getName());
		System.out.println(correo.getEmail());
		System.out.println(correo.getTel());
		System.out.println(correo.getSubject());
		System.out.println(correo.getMessage());
		return SUCCESS;
	}	
	
	public Email getCorreo() {
		return correo;
	}

	public void setCorreo(Email correo) {
		this.correo = correo;
	}
	
	// toString()
	
	@Override
	public String toString() {
		return "PrincipalDispatcher [correo=" + correo + "]";
	}


}
