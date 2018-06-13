import java.util.Scanner;

public class BMIerweitert {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Körpergröße eingeben: ");
		double koerper = input.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Gewicht eingeben: ");
		double gewicht = input2.nextDouble();
		
		double bmi = gewicht / koerper * koerper; 
		
		System.out.println("Der BMI beträgt: " + bmi);
		
		if (bmi < 16) {
	System.out.println("Kategorie: Starkes Untergewicht");
		}
		else if (bmi <= 17) {
	System.out.println("Kategorie: Mäßiges Untergewicht");
		}
		else if (bmi <= 18.5) {
	System.out.println("Kategorie: Leichtes Untergewicht");
		}
		else if (bmi <= 25) {
	System.out.println("Kategorie: Normal Gewicht");
				}
		else if (bmi <=30) {
	System.out.println("Kategorie: Präadipositas");
				}
		else if (bmi <= 35) {
	System.out.println("Kategorie: Adipositas Grad 1");
				}
		else if (bmi <= 40) {
	System.out.println("Kategorie: Adipositas Grad 2");
				}
		else if (bmi >= 40) {
	System.out.println("Kategorie: Adipositas Grad 3");
				}
	}
}
