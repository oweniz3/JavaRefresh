public class Looping{
	public static void main(String[] args){
		
		int i = 1;
		
		while(i <= 20){
			
			if(i == 3){
				i+=2;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}