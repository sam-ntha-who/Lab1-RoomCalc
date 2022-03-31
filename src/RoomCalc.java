import java.util.Scanner;

public class RoomCalc {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		String response;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Enter room length:");
			double length = scnr.nextDouble();

			System.out.println("Enter room width:");
			double width = scnr.nextDouble();

			System.out.println("Enter room height:");
			double height = scnr.nextDouble();

			// formulae
			double area = length * width;
			double perimeter = (width * 2) + (length * 2);
			double volume = length * width * height;

			// output perimeter
			System.out.println("Perimeter: " + perimeter + " feet");

			// output area
			System.out.println("Area: " + area + " square feet");

			// output volume
			System.out.println("Volume: " + volume + " cubic feet");

			// only cool kids measure all the rooms
			System.out.println("Would you like to continue measuring rooms? (Yes/No)");
			response = scnr.next();

		} while (response.equalsIgnoreCase("Yes"));

		scnr.close();
	}
}