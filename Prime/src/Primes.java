import java.util.Scanner;

//Javier Reyna02/19/2015

public class Primes {
	
public static void main(String[] args) {
		
		int userMaxInt=0;
		int i;
		int x;
		int PrimeCount = 0;
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		//get the user input
		System.out.println("Please enter a number. The system will find the prime numbers smaller than this number:");
		
		userMaxInt = keyboard.nextInt();
		
		//print
		System.out.println("\nThese are the prime numbers smaller than "+userMaxInt +":\n");
		
		
		
		for(i = 2; i <= userMaxInt; i++) {
			
			int count = 0;
			
            for(x = 2; x < i; x++) {
            	
                if(i % x == 0) {
                    count++;
                }
            }
            
            if(count == 0) {
            	
            	PrimeCount++;
                System.out.print(x+" ");
                
            }
                    
                
                
                }
		
		System.out.print("\nThere are a total of " + PrimeCount + " prime numbers.");
		
		}
	
		
	}