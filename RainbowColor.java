
public class RainbowColor {
	public void findRainbowColor(char color) {
		switch (color) {
		case 'v':
		case 'V': {
			System.out.println("the given colour is violet");
		}
		case 'i':
		case 'I': {
			System.out.println("The given color is indigo");
		}break;
		case 'b':
		case 'B':

		{
			System.out.println("The given colour is blue");
		}break;
		case 'g':
		case 'G': 
		{
           System.out.println("The given colour is green");
		}break;
		case 'y':
		case 'Y': {
			System.out.println("The given colour is yellow");
		}break;
		case 'o':
		case 'O': {
			System.out.println("The given colour is yellow");
		}break;
		case 'r':
		case 'R': {
			System.out.println("The given colour is red");
		}break;
		default:
			System.out.println("The given character is not in rainbow");
		}

	}
}
