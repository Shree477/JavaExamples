import java.util.Scanner;

public class EvenODD1 {

	public static void main(String[] args) {
		
		System.out.print("Enter the number:");
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		
		
		if(a%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}




	}
