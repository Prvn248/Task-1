package For;

public class Polyndrome {	
	public static void main(String[] args) {
       String a="madam";
       String b=""; 
        for(int i=a.length()-1;i>=0;i--) {
		    b=b+a.charAt(i);
        }
	 if(a.equalsIgnoreCase(b))
	 {
		 System.out.println("it is a polindrome");
	 }
	 else {
		 System.out.println("not a polindrome");
	 }
	 }
	

}
