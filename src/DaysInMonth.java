import java.util.Scanner;

public class DaysInMonth {

	

	    public static void main(String[] args) {
	        
	        
	               int daysJanuary = 31;
	               int daysFebruary = 28;
	               int daysMarch = 31;
	               int daysApril = 30;
	               int daysMay = 31;
	               int daysJune = 30;
	               int daysJuly = 31;
	               int daysAugust = 31;
	               int daysSeptember = 30;
	               int daysOctober = 31;
	               int daysNovember = 30;
	               int daysDecember = 31;

	  
	        int monthNumber = 0;
	        Scanner insert = new Scanner(System.in);
	    System.out.println("Enter a number for a month to find out how many days it has:");
	    monthNumber = insert.nextInt();
	       
	        switch (monthNumber) {
	            case 1 : 
	                System.out.println("There are " +daysJanuary + " days in January.");
	                break;
	            case 2 :
	                System.out.println("There are " +daysFebruary + " days in February.");
	                break;
	            case 3 :
	                System.out.println("There are " +daysMarch + " days in March.");
	                break;
	            case 4 :
	                System.out.println("There are " +daysApril  + " days in April.");
	                break;
	            case 5 :
	                System.out.println("There are " +daysMay + " days in May.");
	                break;
	            case 6 :
	                System.out.println("There are " +daysJune + " days in June.");
	                break;
	            case 7 :
	                System.out.println("There are " +daysJuly + " days in July");
	                break;
	            case 8 :
	                System.out.println("There are " +daysAugust  + " days in August.");
	                break;
	            case 9 :
	                System.out.println("There are " +daysSeptember + " days in September.");
	                break;
	            case 10 :
	                System.out.println("There are " +daysOctober + " days in October");
	                break;
	            case 11 :
	                System.out.println("There are " +daysNovember + " days in November");
	                break;
	            case 12 :
	                System.out.println("There are " +daysDecember + " days in  December.");
	                break;


}
	        
	    }
	}
