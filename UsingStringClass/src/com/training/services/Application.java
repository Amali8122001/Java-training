package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringService service = new StringService();
		
		String city = "Chennai";
		
		System.out.println(String.format("%S", city));
		System.out.println(String.format("%3$.4f %2$.3f %1$.2f ", 100.456 , 200.4578 , 300.56789));
		
		int key = 14;
		
		switch(key)
		{
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.usingTrim("  suresh  ");
			break;
		case 4:
			service.lengthOfString("  Suresh  ");
			break;
		case 5:
			service.usingSubString("Suresh");
			break;
		case 6:
			service.usingCharAtAndIndexOf("suresh@abc.com");
			break;
		case 7:
			service.usingReplace("suresh@abc.com" , "Welcome to Chennai");
			break;
		case 8:
			service.usingConcat("Good" , "Morning");
			break;
		case 9:
			service.usingCompareTo("SureshAmali" , "Suresh");
			break;
		case 10:
			service.usingStringFormat("Suresh", 55.879);
			break;
		case 11:
			service.usingStringFormat(17);
			break;
		case 12:
			service.usingStringFormat(16 , 16);
			break;
		case 13:
			service.usingStringFormat("suresh" , "Suresh");
			break;
		case 14:
			service.usingStringFormat(420);
			break;
		default:
			break;
		}
		

	}

}
