import java.util.Scanner;

public class LinearEquationRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome!");

		// get coordinates
		System.out.print("Enter coordinate 1: ");
		Coordinate coord1 = new Coordinate(scanner.nextLine());
		System.out.print("Enter coordinate 2: ");
		Coordinate coord2 = new Coordinate(scanner.nextLine());

		System.out.println();

		// stupid edge case of vertical lines
		if (coord1.getX() == coord2.getX()) {
			System.out.println(String.format("These points are on a vertical line: x = %d", coord1.getX()));
			return;
		}

		// create and print equation
		LinearEquation equation = new LinearEquation(
			coord1.getX(),
			coord1.getY(),
			coord2.getX(),
			coord2.getY());

		System.out.println(equation.lineInfo());
		System.out.println();

		// get alternate x value and print resulting y value
		System.out.print("Enter a value for x: ");
		double altX = scanner.nextDouble();

		System.out.println();
		System.out.println("The on the line is " + equation.coordinateForX(altX));
	}
}
