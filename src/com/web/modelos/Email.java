package com.web.modelos;


public class Email {
	// https://struts.apache.org/getting-started/processing-forms.html
	// Atributos

	private String name;
	private String email;
	private String tel;
	private String subject;
	private String message;

	// Métodos

	// Getter Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// toString()
	
	@Override
	public String toString() {
		return "Email [name=" + name + ", email=" + email + ", tel=" + tel + ", subject=" + subject + ", message="
				+ message + "]";
	}

}
