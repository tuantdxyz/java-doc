

public class QuickSort extends NumberList implements Sort {

	public QuickSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// Quick Sort
		int low = 0;
		int high = super.n - 1;
		quickSort(super.arr, low, high);
		System.out.println("Sau khi sap xep nhanh: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

}
