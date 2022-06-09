package com.acme.autorizzazioni.servizi.email;

public class Main {

	public static void main(String[] args) {
		// Usiamo il factory per recuperare un server a nostra scelta
		
		try {
			EmailService googleService = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL);
			
			Email email = new EnterpriseEmail("mauro.larese@gmail.com", "Messaggio di test", "prova messaggio");
			
			googleService.send(email);
		
			
			
		} catch (AuthorizationFailureException e) {
			
			System.out.println("Contattare l'amministratore");
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			// chiudi connessione
		}
		
		
		
		
	}

}
