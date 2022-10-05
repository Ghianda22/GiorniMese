package com.mese.giorni;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire nome mese: ");
		String month = in.nextLine();
		if(month.lastIndexOf(" ") != -1) {			
			month = month.substring(0, month.indexOf(" ")).toLowerCase();
		}
		
		int numOfDays = 0;
		
//		switch (month.toLowerCase()) {
//			case "novembre":
//			case "aprile":
//			case "giugno":
//			case "settembre":
//				numOfDays = 30;
//				break;
//			case "febbraio":
//				numOfDays = 28;
//				break;
//			default:
//				numOfDays = 31;
//				break;
//		}
		
		if(month.equals("febbraio")) {
			numOfDays = 28;
		}else if(month.equals("novembre") || month.equals("aprile") || month.equals("giugno") || month.equals("settembre")) {
			numOfDays = 30;
		}else if(month.equals("gennaio") || month.equals("marzo") || month.equals("maggio") || month.equals("luglio") || month.equals("agosto") || month.equals("ottobre") || month.equals("dicembre")) {
			numOfDays = 31;
		}
		
		if(numOfDays == 0) {
			System.out.println("Non e' un mese");
		}else {			
			System.out.println("Il mese di " + month + " ha " + numOfDays + " giorni.");
		}
		
	
	}
}
