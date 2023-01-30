

import java.util.Scanner;

public class NumberList {
	int n;
	int[] arr;

	public NumberList() {
		super();
	}

	public NumberList(int n) {
		super();
		this.n = n;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap n so phan tu: ");
		this.n = sc.nextInt();
		arr = new int[this.n];
		for (int i = 0; i < this.n; i++) {
			System.out.println("Nhap so thu " + (i + 1) + " :");
			arr[i] = sc.nextInt();
		}
		sc.close();
	}

	public void print() {
		System.out.println("Cac so vua nhap la: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

}
