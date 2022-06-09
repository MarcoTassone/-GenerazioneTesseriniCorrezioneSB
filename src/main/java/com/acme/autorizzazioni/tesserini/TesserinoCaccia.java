package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
	public class TesserinoCaccia extends TesserinoImp {

	public TesserinoCaccia(int annoValidita, Licenza licenza) {
		super(annoValidita, licenza);
		// TODO Auto-generated constructor stub
	}



}
