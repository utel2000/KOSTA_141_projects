package test;

public class QuickSort {

	public static int partition(int[] arr, int left, int right, int pivotIndex) {
																	System.out.println("-----partition Ω√¿€-----");
																	System.out.println("left: " + left + " / right: " + right + " / pivotIndex: " + pivotIndex);
		int pivotValue = arr[pivotIndex];
																	System.out.println("pivotValue: " + pivotValue);
		int tmp = arr[pivotIndex];
																	System.out.println("tmp: " + tmp);
		arr[pivotIndex] = arr[right];
																	System.out.println("arr[pivotIndex]: " + arr[pivotIndex]);
		arr[right] = tmp;
																	System.out.println("arr[right]: " + arr[right]);
		int storeIndex = left;
																	System.out.println("storeIndex: " + storeIndex);
		int loopCount = 1; // for log
		for (int i = left; i < right; i++) {
																	System.out.println("loopCount: " + loopCount);
																	System.out.println("i: " + i);
			if (arr[i] < pivotValue) {
				tmp = arr[i];
																	System.out.println("tmp: " + tmp);
				arr[i] = arr[storeIndex];
																	System	.out.println("arr[i]: " + arr[i]);
				arr[storeIndex] = tmp;
																	System.out.println("storeIndex: " + storeIndex);
																	System.out.println("arr[storeIndex]: " + arr[storeIndex]);
																	System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2] + " - " + arr[3] + " - " + arr[4] + " - " + arr[5] + " - " + arr[6] + " - " + arr[7] + " - " + arr[8] + " - " + arr[9]);
				storeIndex++;
			}
			loopCount++;
		}
		tmp = arr[storeIndex];
																	System.out.println("tmp: " + tmp);
		arr[storeIndex] = arr[right];
																	System.out.println("arr[storeIndex]: " + arr[storeIndex]);
		arr[right] = tmp;
																	System.out.println("arr[right]: " + arr[right]);
																	System.out.println("-----partition ≥°-----");
		return storeIndex;
	}

	public static void quicksort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = left + (right - left) / 2;
			int pivotNewIndex = partition(arr, left, right, pivotIndex);
			quicksort(arr, left, pivotNewIndex - 1);
			quicksort(arr, pivotNewIndex + 1, right);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 2, 3, 9, 4, 7, 1, 5, 10, 8 };
		quicksort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " / ");
	}
}
