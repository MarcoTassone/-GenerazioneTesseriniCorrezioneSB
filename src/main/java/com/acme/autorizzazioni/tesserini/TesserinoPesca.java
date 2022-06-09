package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TesserinoPesca extends TesserinoImp {
	
	public TesserinoPesca(int annoValidita, Licenza licenza) {
		super(annoValidita, licenza);
		// TODO Auto-generated constructor stub
	}


}
