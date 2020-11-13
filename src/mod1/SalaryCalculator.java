 package mod1;

public class SalaryCalculator {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare variables
		String career;
		
		System.out.println("The programming is starting");
		
		//Define variables
		career="Software developer";
		System.out.println("My career is "+ career);
		
		//Declare and define
		
		int hoursPerWeek=40;
		int weeksPerYear=50;
		double rate=42.0;
		double salary= rate*hoursPerWeek*weeksPerYear;
		
		System.out.println("My salary as "+career+ " at the rate of $: "+ rate +" per hour is $= "+salary+" per year.");
		
		//Computer our annual salary
		//rate *hourPerWeek*weeksPerYear
		
		
	}

}
