import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Functional {
	static Scanner sc = new Scanner(System.in);
	static List<Employees> listEmp = new ArrayList<>();
	static List<Departments> listDept = new ArrayList<Departments>();
	// Hard code departments
	static Departments dept01 = new Departments("Dept01", "MARKETING", "HN");
	static Departments dept02 = new Departments("Dept02", "AF", "HCM");

	public static synchronized void inputEmployees() {
		listDept.add(dept01);
		listDept.add(dept02);

		Employees emp = new Employees();

		System.out.println(" Enter Employee_ID: ");
		emp.setId(sc.nextLine());
		System.out.println(" Enter Name: ");
		emp.setName(sc.nextLine());
		System.out.println(" Enter Birth Date: ");
		emp.setBirthDate(sc.nextLine());
		System.out.println(" Enter Phone: ");
		emp.setPhone(Integer.parseInt(sc.nextLine()));
		System.out.println(" Enter Email: ");
		emp.setEmail(sc.nextLine());

		int choice;
		System.out.println("Choice Departments");
		System.out.println(" Choice: 1. Marketing  ---  2. AF ");
		choice = Integer.parseInt(sc.nextLine());
		if (choice == 1) {
			emp.setDeptNo("Dept01");
		} else {
			emp.setDeptNo("Dept02");
		}
		listEmp.add(emp);
	}

	public static synchronized void showEmployees() {
		listEmp.forEach((element) -> {
			System.out.println(element);
		});
	}

	public static void saveEmployees() throws IOException {
		writeExcel(listEmp, "tuan_test01.xls");
	}

	public static void writeExcel(List<Employees> listData, String excelFilePath) throws IOException {
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("employees");
		writeTitle(sheet);
		int rowCount = 0;

		for (Employees emp : listData) {
			Row row = sheet.createRow(++rowCount);
			writeData(emp, row);
		}

		try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
			workbook.write(outputStream);
			workbook.close();
		}
	}

	private static void writeTitle(Sheet sheet) {
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(1);
		cell.setCellValue("Name");

		cell = row.createCell(2);
		cell.setCellValue("PHONE");

		cell = row.createCell(3);
		cell.setCellValue("EMAIL");
	}

	private static void writeData(Employees obj, Row row) {
		Cell cell = row.createCell(1);
		cell.setCellValue(obj.getName());

		cell = row.createCell(2);
		cell.setCellValue(obj.getPhone());

		cell = row.createCell(3);
		cell.setCellValue(obj.getEmail());
	}

}
