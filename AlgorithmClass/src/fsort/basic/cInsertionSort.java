package fsort.basic;

import java.util.Arrays;

class cInsertionSort {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		System.out.printf("\n삽입정렬 전 : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.printf("\n삽입정렬 후 : ");
		insertionSort(a, size);
		for (int i = 0; i < a.length; i++)
			System.out.printf("%3d", a[i]);
	}

	public static void insertionSort(int a[], int size) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = a[i + 1];
			int index = i + 1;
			for (int j = 0; j < index; j++) {
				if (a[j] > min) {
					//System.out.println(j+"에있는 " + a[j]+ "와 " + index+  "에 있는 " + min);
				/*	int temp = a[j];
					a[j] = a[index];
					a[index] = temp;*/
					//밀고 넣기
					for(int k=index;k>j;k--){
						a[k] =a[k-1];
					}
						a[j]=min;
					//System.out.println(Arrays.toString(a));
					break;
				}
				
			}

		}

		//System.out.println();
	}
}