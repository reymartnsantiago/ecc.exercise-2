
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			UserInterface obj = new UserInterface();

			obj.start();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
