import java.util.Scanner;
public class digit_to_word{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the single digit number");
		int n = sc.nextInt();
		switch(n){
			case 0: System.out.print("ZERO");break;
			case 1:	System.out.print("ONE");break;
			case 2: System.out.print("TWO");break;
			case 3: System.out.print("THREE");break;
			case 4: System.out.print("FOUR");break;
			case 5: System.out.print("FIVE");break;
			case 6: System.out.print("SIX");break;
			case 7: System.out.print("SEVEN");break;
			case 8: System.out.print("EIGHT");break;
                        case 9: System.out.print("NINE");break;

			default : System.out.print("PLEASE INSERT VALID SINGLE DIGIT OR VALID POSITIVE NUMBER");
		}
	}
}


