package com.acme.autorizzazioni.servizi.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class EmailImp implements Email {
	private String to;
	private String message;
	private String subject;
	
}
