public class Looping2{
	public static void main(String[] args){
		
		// Finding pi value
		double myPi = 4.0;
		double j = 3.0;
		
		while(j < 10000000){
			
			myPi = myPi - (4/j) + (4/(j+2));
			j+=4;
			System.out.println(myPi);
		}
		
		System.out.println("Value of PI:" + Math.PI);
	}
}