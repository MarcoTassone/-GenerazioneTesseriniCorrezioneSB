package com.acme.autorizzazioni.servizi.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailService {
	private String nome;
	private String userNamePerInvio;
	private String password;
	
	
	public void send(Email mail) throws 
		MissingSubjectAndMessageException, 
		MailServerNotAvailableException, 
		AuthorizationFailureException, 
		EmailNotValidException {
		
		if(!isEmailValid(mail.getTo())) {
			throw new EmailNotValidException("Email non valida");
		}
		
		if(mail.getMessage() == null || mail.getMessage().isBlank()) {
				
			if(mail.getSubject()==null  || mail.getSubject().isBlank()) {
				throw new MissingSubjectAndMessageException("Mancono sia il messaggio che l'oggetto della email");
			}
			
		}
		
		// controllo se le credenziali sono valide 
		
		connectToServer();
		
		
		if (!isServerAvailable()) {
			throw new MailServerNotAvailableException("Il server è momentaneamente offline");
		}
		
		
		System.out.println("email: " +mail.getMessage() );
	}

	public void connectToServer() throws AuthorizationFailureException {
		boolean connected = true;
		
		if(!connected) {
			throw new AuthorizationFailureException("Credenziali errate");
		} 
		
	}
	
	private boolean isEmailValid(String email) {
		return true;
	}
	private boolean isServerAvailable() {
		
		
		return true;
	}
}
