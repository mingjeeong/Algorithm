package step1;

import java.util.Scanner;

public class A05전자레인지_저 {

  public static void main(String[] args) {
	 
          // 입력받는 부분
          Scanner sc = new Scanner(System.in);
          int T = sc.nextInt();				// 원하는 초를 입력받음
          sc.close();
    
          
          int A=0, B=0, C=0;				// 각각의 세 버튼 A:5분  B:1분 C:10초
          int imp =0 ;
          
          if( T >= 1 & T <= 10000 ) 	// 입력값이 1부터 10000사이의 값
          {
        	  /**
        	  // 1.  5분(300초) 버튼 이라면
        	  // 2.  1분(60초) 버튼 이라면
        	  // 3.  10초 버튼 이라면
        	  // 4.  잔액이 아직도 남았다면 imp 변수에 -1 저장
        	   */
        	  
        	  
        	  
        	  
        	  
          }
          // 출력하는 부분
          if(imp != 0) 
          	System.out.print("-1");
          else 
          	System.out.print( A + " " + B + " " + C + " ");
    }
}

