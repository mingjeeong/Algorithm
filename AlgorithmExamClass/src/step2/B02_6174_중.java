package step2;

import java.util.Scanner;

public class B02_6174_중 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();	// 총 입력할 수
       
        for (int tcase = 0; tcase<TC; tcase++) {

        	char [] s = sc.next().toCharArray();
        	int result = 0;     	
        	int cnt=0;  // 6174까지 오는 단계 수
        	do
        	{
        			cnt++;
	            	int maxSu = sort(s, 4, 1);			// 입력한 수를 담은 배열, 수의 길이, flag 1-가장 큰수  0-가장 작은 수
	            	int minSu = sort(s, 4, 0);			// 입력한 수를 담은 배열, 수의 길이, flag 1-가장 큰수  0-가장 작은 수
	            	result = maxSu - minSu;
	            	s = changeCharArray(result);		// 정수값을 문자열 배열로 변환
        	}while(result != 6174);
        	
        	System.out.println(cnt);
          }
        sc.close();
  }   
    
    /**
     *  1. 숫자를 섞어서 flag가 1이면 큰수를 만들고, flag가 0이면 작은 수를 만든다
     */
    static int sort(char c[], int len, int flag)
    {
  
      
    	
    	
    	
  	  
      // 문자열배열에 저장된 숫자문자들을 숫자로 변환하여 반환
  	  int sum=0;
  	  for(int i=0; i<len; i++)
  	  {
  		  sum = sum*10 + c[i] - '0';
  	  }
	  // System.out.println(sum);
  	  return sum;
    }
    
    /**
     *  2. 정수값을 문자열 배열로 변환하여 반환
     */
    static char[] changeCharArray(int n)
    {
  	  char []s=new char[4];


  	  
  	  
  	  return s;
    }
    
    

}
