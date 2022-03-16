import java.util.Scanner;

public class Voter {

	public  void voter (int a) {
		
		if (a>=18) {
			
			System.out.println("Print Voter is elgible for Vote");
				}
				else
				System.out.println("voter is not eligible for Vote");
					}
		public static void main(String args[]) {
		Voter a = new Voter();
		System.out.println("Enter age main");
		Scanner input = new Scanner (System.in);
		int age = input.nextInt();
		a.voter(age);
		}

}
