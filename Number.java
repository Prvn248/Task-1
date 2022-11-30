package For;

public class Number {
	public static void main(String[]args ) {
		int odd=0;
		int even=0;
		for(int i=1;i<=10;i++) 
		{
		if(i%2==0) {
			even=even+1;
		}
		else {
			odd=odd+1;
		}
			
		}
		System.out.println(even);
		System.out.println(odd);
	}
		
	

}
