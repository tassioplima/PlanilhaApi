package br.tassio.teste.planilha.java;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class TestePlanilha {
	
	public static void main(String[] args) throws FilloException  {
		 
		Fillo fillo = new Fillo();
		
		Connection connection = fillo.getConnection(".\\massa\\massa.xlsx");
		
		String strQuery = "Select * from Planilha1 where id = 35693 and cliente = 7575215";
		
		Recordset recordset = connection.executeQuery(strQuery);
		
		while(recordset.next()) {
		
		System.out.println(recordset.getField("contrato"));
		
		}
		
		recordset.close();
		
		connection.close();
		
	}
	
	

}
