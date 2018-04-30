package fsort.basic;

class bSelectionSort{
	public static void main(String args[]){
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		
		System.out.printf("\n선택정렬 전 : ");
		for( int i=0; i < a.length; i++)
			System.out.printf("%3d",a[i]);
		selectionSort(a);
		System.out.printf("\n선택정렬 후 : ");
		for( int i=0; i < a.length; i++)
			System.out.printf("%3d",a[i]);
	}
	
	public static void selectionSort(int a[]) {
		int min =0;
		int index=0;
		
		for (int i = 0; i < a.length-1; i++) {
			
			min =a[i+1];
			for(int j=i+1;j<a.length-1;j++){
				if(min > a[j+1]){
					min = a[j+1];
					index = j+1;
				}
			}
			//System.out.println(min);
			if(a[i]>a[index]){
//				int temp =a[i];
//				a[i] = a[index];
//				a[index] = temp;
				swap(a, i , index);
				
			}
			
		}
	}

	 public static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	 

}	