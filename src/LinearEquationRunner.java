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

		// testing
		System.out.println(coord1.getX());
		System.out.println(coord1.getY());
		System.out.println(coord2.getX());
		System.out.println(coord2.getY());
	}
}
