package com.acme.autorizzazioni.servizi.email;

public interface Email {
	public void setTo(String to);
	public String getTo();
	
	public void setSubject(String subject);
	public String getSubject();
	
	public void setMessage(String message);
	public String getMessage();
	
}
