package com.acme.autorizzazioni.tesserini;

import com.acme.autorizzazioni.licenze.Licenza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TesserinoImp implements Tesserino {
	private int annoValidita;
	private Licenza licenza;
}
