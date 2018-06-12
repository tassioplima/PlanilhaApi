package br.tassio.teste.planilha.java;

import com.codoid.products.exception.FilloException;

public class ExecucaoPlanilha {

	public static void main(String[] args) throws FilloException {
		
		String query = TestePlanilha.selectIpricing("75752000", "contrato");
		System.out.println(query);

	}

}
