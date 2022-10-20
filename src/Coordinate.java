public class Coordinate {
	private int x;
	private int y;

	/* Creates a coordinate from a string in coordinate form */
	public Coordinate(String str) {
		int openPos = str.indexOf("(");
		int commaPos = str.indexOf(", ");
		int closePos = str.indexOf(")");

		x = Integer.parseInt(str.substring(openPos + 1, commaPos));
		y = Integer.parseInt(str.substring(commaPos + 2, closePos));
	}

	/* Getter methods */
	public int getX() { return x; }
	public int getY() { return y; }
}
