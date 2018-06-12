package br.tassio.teste.planilha.java;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class TesteMassaPequena {
	
		
		public static void main(String[] args) throws FilloException  {
			 
			Fillo fillo = new Fillo();
			
			Connection connection = fillo.getConnection("massa/massa.csv");
			
			String strQuery = "Select * from Planilha1 where NUM_CLI = 7575200";
			
			Recordset recordset = connection.executeQuery(strQuery);
			
			while(recordset.next()) {
			
			System.out.println(recordset.getField("NEG_MDR"));
			
			}
			
			recordset.close();
			
			connection.close();
			
		}
	}


