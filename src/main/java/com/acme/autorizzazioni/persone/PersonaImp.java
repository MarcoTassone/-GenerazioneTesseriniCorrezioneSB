package com.acme.autorizzazioni.persone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class PersonaImp implements Persona {
	private String email;
	private String nome; 
	private String cognome;
	private String indirizzo;
	private String cap; 
	private String citta; 
}
