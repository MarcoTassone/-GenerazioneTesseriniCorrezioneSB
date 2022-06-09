package com.acme.autorizzazioni.servizi.email;

import lombok.Data;

@Data
public class EnterpriseEmail extends EmailImp {
	
	public EnterpriseEmail(String to, String message, String subject) {
		super(to, message, subject);
	}
	
}
