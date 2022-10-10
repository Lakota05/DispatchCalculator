

import java.util.Scanner;

import javax.swing.JOptionPane;




public class DispatchCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		//VIN VIN1 = new VIN();
			 	
		
			
		
		double maxHeight = 162;
		 
		
				
		System.out.println("Enter your truck GVW: ");
		double truckGVW = scan.nextDouble();
		
		System.out.println("Enter your trailer GVW: ");
		double trailerGVW = scan.nextDouble();
		
		System.out.println("Enter your trailer length: ");
		double trailerLength = scan.nextDouble();
		
		System.out.println("Enter your scaled weight: ");
		double scaledWeight = scan.nextDouble();
		
		System.out.println("Enter your trailer deck height at its highest point: ");
		double trailerHeight = scan.nextDouble();
		
		System.out.println("Your combined GVW is: " +(truckGVW + trailerGVW) + " pounds");
				
		System.out.println("The total weight you can load is: " + (truckGVW + trailerGVW - scaledWeight) + " pounds");
		
		System.out.println();

		System.out.println("Choose the first VIN to load on your trailer: ");
		String VIN1 = scan.next();
				
		System.out.println("Choose the second VIN to load on your trailer: ");
		String VIN2 = scan.next();
		
		System.out.println("Choose the third VIN to load on your trailer: ");
		String VIN3 = scan.next();
		
		
		
		
		
		
		
			if( VIN1+ VIN2 + VIN3 <= truckGVW + trailerGVW - scaledWeight) {
				System.out.println("You are under weight");
					
			//}else if(n1 + n2 + n3 <= trailerLength) {
				System.out.println("You are under length");
				
			
			//}else if (n1 + trailerHeight <+ maxHeight){
				System.out.println("You are under height");	
		
				
			//}else if (n2 + trailerHeight <+ maxHeight){
				System.out.println("You are under height");	
				
			//}else if (n3 + trailerHeight <+ maxHeight){
				System.out.println("You are under height");	
			
			
				
				
			
			
		
	}

}	


