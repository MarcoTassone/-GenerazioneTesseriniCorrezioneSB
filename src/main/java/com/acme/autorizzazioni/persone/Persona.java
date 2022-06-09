package com.acme.autorizzazioni.persone;

public interface Persona {

	String getCap();

	String getCitta();

	String getCognome();

	String getEmail();

	String getIndirizzo();

	String getNome();

	void setCap(String cap);

	void setCitta(String citta);

	void setCognome(String cognome);

	void setEmail(String email);

	void setIndirizzo(String indirizzo);

	void setNome(String nome);

}