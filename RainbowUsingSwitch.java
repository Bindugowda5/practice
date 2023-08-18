import java.util.Scanner;

public class RainbowUsingSwitch {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a character=");
char color=scan.next().charAt(0);
RainbowColor rainbow=new RainbowColor();
rainbow.findRainbowColor(color);
scan.close();
	}

}
