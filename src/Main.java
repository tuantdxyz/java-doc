import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		println();

		int choice;
		do {
			System.out.println(" Choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Functional.inputEmployees();
				System.out.println("Saved Employee!");
				println();
				break;
			case 2:
				System.out.println("Show Employees!");
				Functional.showEmployees();
				println();
				break;
			case 3:
				Functional.saveEmployees();
				System.out.println("Saved Files!");
				println();
				break;
			case 4:
//				TODO
				println();
				break;
			case 5:
				System.out.println("Exit!");
				break;
			}
		} while (choice != 5);

	}

	public static void println() {
		System.out.println(" \t \t MENU");
		System.out.println(" 1. Input Employee");
		System.out.println(" 2. Show List Employees.");
		System.out.println(" 3. Write file excel.");
		System.out.println(" 4. Send Email.");
		System.out.println(" 5. Exit.");
	}

}
