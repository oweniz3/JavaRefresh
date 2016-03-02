import java.util.Scanner;

public class Looping3{
	
	static Scanner userinput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		String contYorN = "y";
		
		int h = 1;
		
		//.equalsIgnoreCase gives me the option to use upper of lower case.
		while(contYorN.equalsIgnoreCase("y")){
			System.out.println(h);
			System.out.print("Continue y or n ?");
			contYorN = userinput.nextLine();
			h++;
		}
		
	}
	
	
}
	