import java.util.Scanner;
public class Task2 {
	public static void main(String[] String ) {
		double minuteInYear = 60*24*365;
		
		Scanner input = new Scanner(System.in);
		System.out.print("input the number of minutes:");
		double min=input.nextDouble();
		long years = (long) (min / minuteInYear);
		int days = (int) (min / 60 / 24) % 365;
		System.out.println((int) min + "minutes is approximatly" + years+"years and" + days + "days");
		
		
	}

}
