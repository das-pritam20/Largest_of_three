import java.util.Scanner;

public class Largest_of_three{
	public static void main(String args[]){
		int a,b,c;
		
		System.out.println("Enter Three Numbers:");
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if(a>=b && a>=c){
			System.out.println(a + " is big.");
		}
		else {
			if(b>=c && b>=a){
				System.out.println(b + " is big.");
			}
			else{
				System.out.println(c + " is big.");
			}
		}
	}
}