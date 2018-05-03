package step2;

import java.util.Arrays;
import java.util.Scanner;

public class 방번호 {

	public static void main(String[] args) {

		System.out.println("방번호 입력");
		Scanner scan = new Scanner(System.in);
		int roomNumber = scan.nextInt();
		scan.nextLine();
                                                                                                                    
		String roomStr = String.valueOf(roomNumber);
		int size = roomStr.length();
		int[] numbers = new int[10];

		for (int i = 0; i < size; i++) {
			numbers[Character.getNumericValue(roomStr.charAt(i))]++;
		}
		
//		if ((numbers[6] + numbers[9]) % 2 == 0) {
//			int count = (numbers[6] + numbers[9]) / 2;
//			numbers[6] = count;
//			numbers[9] = count;
//		}else{
			int c1 = (numbers[6]+numbers[9])/2;
			int c2 = (numbers[6]+numbers[9])%2;
			numbers[6] = c1;
			numbers[9] = c1+c2;
			
//		}
		
		
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println(max);

		System.out.println(Arrays.toString(numbers));

	}

}
