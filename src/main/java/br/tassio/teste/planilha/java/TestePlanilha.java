package br.tassio.teste.planilha.java;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class TestePlanilha {

	private static Fillo fillo;
	private static Connection connection;
	private static Recordset recordset;
	private static String result;
	private static String STRQUERY = "Select * from ipricing ";
	public TestePlanilha() {
	
	}
	
	/**
	 * @param numcli numero do cliente como parametro
	 * @param coluna as colunas recebidas como parametro (CONTRATO, CAT, CNPJ, PV, CLIENTE)
	 * @return retorna uma string da planilha de massa a partir das colunas passadas por parametro
	 */
	public static String selectIpricing (String numcli, String coluna) {

	
		try {
			
			fillo = new Fillo();
			
			connection = fillo.getConnection("massa/massa.xlsx");

			String strQuery = "Select "+coluna.toUpperCase()+" from Planilha1 where numero_cliente = " + numcli;

			recordset = connection.executeQuery(strQuery);

			while(recordset.next()) {

				result = recordset.getField(coluna);

			}
			
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			recordset.close();
			connection.close();
		}
		
		 return "";
	}
}
