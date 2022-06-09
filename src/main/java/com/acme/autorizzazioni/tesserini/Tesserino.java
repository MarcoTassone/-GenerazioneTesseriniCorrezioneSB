package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

public interface Tesserino {

	int getAnnoValidita();

	Licenza getLicenza();

	void setAnnoValidita(int annoValidita);

	void setLicenza(Licenza licenza);

}