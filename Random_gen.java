import java.util.Random;


public class Random_gen {

	/**
	 * Return name with random number between 6 and 15
	 * @param name
	 * @return
	 */
	public String getData(String name){
		String str;
		
		int low=6; // Hard Coded values
		int high=15; // Hard code values
		Random rm=new Random(); // Calling existing java random functionsD
		int random_number=rm.nextInt(high-low)+low; // Random number generation
		str=name+" " + random_number; // Concatenating string to generate the result
		System.out.println(str); // Printing result
		
		// Returning output
		return str;
	}
}
