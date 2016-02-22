import java.util.Scanner;
public class HelloWorld {
	
	public static void main(String[] args){
		
		//highest number for a byte.
		byte bigByte = 127;
		// lowest value for a byte
		byte smallByte = -128;		
		//highest value for a short.
		short bigShort = 32767;
		//lowest value for a short.
		short smallShort = -32768;
		//Highest value for an int.
		int bigInt = 2100000000;
		//Highest value for a long.
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F; 
		double bigDouble = 3.1429048021398109334;
		
		//Find max value of variables.
		/*
		System.out.println(Float.MAX_VALUE);
		String nameString = "print my name";
		
		System.out.println(nameString);
		*/
		
		Scanner in = new Scanner(System.in);
		
		int minAgeForDriving = 18;
		int age;
		String name;
		System.out.println("You have entered drive service.");
		System.out.print("Please enter your name:");
		name = in.nextLine();
		System.out.println("Please enter your age:");
		age = in.nextInt();
		
				
		if(age < minAgeForDriving){
			System.out.println(name +" you are not old enough drive a car");
			
		}
		else{
			System.out.println(name +" you are old enough to drive a car");
		}
		
		

		boolean trueOrFalse = true;
		
		
	}

}