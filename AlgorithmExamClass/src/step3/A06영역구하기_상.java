package step3;

import java.util.Scanner;
import java.util.Stack;

class SQUARE
{
	int x;
	int y;
	int cnt;
	public SQUARE(int x, int y, int cnt)
	{
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class A06영역구하기_상 {

	static int M, N, K;
	static int a[][];
	static int visited[][];

	
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        	  M = sc.nextInt();  // 전체행
        	  N = sc.nextInt();   // 전체열
        	  K = sc.nextInt();	  // 영역수
 
           	  a = new int[M+1][N+1];
           	  visited= new int[M+1][N+1];
           	  
        	  // 좌표값을 읽어서 저장
        	  int x1[]=new int[K];
        	  int y1[]=new int[K];
        	  int x2[]=new int[K];
        	  int y2[]=new int[K]; 	  
        	  for(int i=0; i<K; i++)
        	  {
        		  x1[i] = sc.nextInt();
        		  y1[i] = sc.nextInt();
        		  x2[i] = sc.nextInt();
        		  y2[i] = sc.nextInt();
        	  }
        	  
           	  int count=0;     	 
           	  int result[]=new int[100];
           	  
           	  // 입력한 좌표로 영역을 1로 표시한다
           	  for(int i=0; i<K; i++)
       	      {
				  for(int j=y1[i]; j<y2[i]; j++)
				  {
					  for(int m=x1[i]; m<x2[i]; m++)
					  {
						  a[j][m]=1;
					  }					 				 
				  }
       	      }
           	  
           	 /* 
           	 // 그림으로 확인하면 위아래가 바꿔서 나온다
           	 for(int m=0; m<M; m++)
			  {
				  for(int n=0; n<N; n++)
				  {
					  System.out.print(a[m][n]+" ");
				  }
				  System.out.println();
			  }
			  */
           
           	  
           	 for(int i=0; i<M; i++)
     	      {
				  for(int j=0; j<N; j++)
				  {
						if(a[i][j]==0 )  //아직 방문안했다면
						{
							  //System.out.println("출발 : " + i + " "+ j);
							  result[count] = fill(i, j);
							  count++;
						}
				  }
     	      }
           	 
           	print(count, result); 
 	  

          sc.close();
    }
    
    


	static int fill(int y, int x)
	{
	
		int d1[]=new int[]{0,1,0,-1};
		int d2[]=new int[]{-1,0,1,0};
	
		int cnt=1;
		Stack stack=new Stack();
	
		/**
		 * 
		 */
		
		
		
		
		
		
		
		return cnt;
	}
	
	
	
    
    // 정렬하여 작은 수부터 출력한다
    static void print(int count, int [] result) {
       	for(int i=0; i<count-1; i++)
  	    {
  		  for(int j=i+1; j<count; j++)
  		  {
  			  if( result[i] > result[j])
  			  {
  				  int temp = result[i];
  				  result[i]=result[j];
  				  result[j]=temp;    				        				  
  			  }
  		  }
  	   }
  	  
  	  System.out.println(count);
  	  for(int i=0; i<count; i++)
  		  System.out.print(result[i] + " ");
   
    }
}

/**
5 7 3
0 2 4 4
1 1 2 5
4 0 6 2
*/