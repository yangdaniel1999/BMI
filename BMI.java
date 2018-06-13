import java.util.Scanner;

public class BMI {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Körpergröße eingeben: ");
	double koerper = input.nextDouble();
	
	Scanner input2 = new Scanner(System.in);
	System.out.println("Gewicht eingeben: ");
	double gewicht = input2.nextDouble();
	
	double bmi = gewicht / koerper * koerper; 
	
	System.out.println("Der BMI beträgt: " + bmi);
	System.out.println("Hallo Test");
}
}
