package Dev_allPatterns;

public class printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		/**
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
		 */
		for(int i=1;i<num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*");
			}
			 
			System.out.println();
		}
		
System.out.println("print one one time and two two  times");
/**
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 */

		for(int i=1;i<num;i++)
		{
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i+"*");
			}
			System.out.println();
		}
	 
	System.out.println("print one one time and two two  times");	
/**
	 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
**/
	//print normal level
	for(int i=1;i<num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+"*");
		}
		System.out.println();
	}
//print it reverse order
	for(int i=num;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+"*");
		}
		System.out.println();
	}
	
	
/**
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 * 
 */
	System.out.println("********** print reverse order ******************");
	for(int i=num;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+"*");
		}
		System.out.println();
	}
/**
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7  
 */
	System.out.println("********** print  ******************");
	
	for(int i=1;i<=num;i++)
	{
		for(int j=num;j>=i;j--)
		{
			System.out.print(j+"");
		}
		System.out.println();
	}
	
/*
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1	
*/
	System.out.println("********** print  ******************");
	for(int i=num;i>=1;i--)
	{
		for(int j=num;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
/*
 * 
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 * 
 * 
 */
	System.out.println("********** print  ******************");
	for(int i=num;i>=1;i--)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j+"");
		}
		System.out.println();
	}
	
/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */
	System.out.println("********** print  ******************");
	for(int i=num;i>1;i--)
		
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int i=1;i<num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
/**
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
 
 */
	System.out.println("**********Print****************");
	for(int i=1;i<num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
			
		}
		
		for(int j=i-1;j>=1;j--)
		{
			System.out.print(j+" ");
		}
 		
		System.out.println();
	}
	
/**
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
*/
	System.out.println("*******************Print below*******************");
	for(int i=1;i<num;i++)
	{
	 for(int j=i;j>=1;j--)
	 {
		 System.out.print(j+" ");
	 }
	 System.out.println();
		 
	}
	
/**
 1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
 */
	System.out.println("**********Print*****************");
	 for (int i = 1; i <= num; i++) 
     {
         //Printing i spaces at the beginning of each row
          
         for (int j = 1; j < i; j++) 
         {
             System.out.print(" ");
         }
          
         //Printing i to rows value at the end of each row
          
         for (int j = i; j <= num; j++) 
         { 
             System.out.print(j); 
         } 
          
         System.out.println(); 
     } 
      
     //Printing lower half of the pattern 
      
     for (int i = num-1; i >= 1; i--) 
     {
         //Printing i spaces at the beginning of each row
          
         for (int j = 1; j < i; j++) 
         {
             System.out.print(" ");
         }
          
         //Printing i to rows value at the end of each row
          
         for (int j = i; j <= num; j++)
         {
             System.out.print(j);
         }
          
         System.out.println();
     }
     
     /**
 1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
       
      */
     System.out.println("***********Print it*****************");
     for(int i=1;i<=num;i++)
     {
    	 for(int j=1;j<i;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int j=i;j<=num;j++)
    	 {
    		 System.out.print(j+" ");
    	 }
    	 System.out.println();
     }
     for(int i=num-1;i>=1;i--)
     {
    	 for(int j=1;j<i;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=i;k<=num;k++)
    	 {
    		 System.out.print(k+" ");
    	 }
    	 System.out.println();
     }
     
     
     
  /*
3 6 9 12 15 18 21 
 3 6 9 12 15 18 
  3 6 9 12 15 
   3 6 9 12 
    3 6 9 
     3 6 
      3 
      3 
     3 6 
    3 6 9 
   3 6 9 12 
  3 6 9 12 15 
 3 6 9 12 15 18 
3 6 9 12 15 18 21     
   */
    System.out.println("*********Print Multiplication Table************");
    
      for(int i=1;i<num;i++){
    	  for(int j=1;j<i;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=1;k<=num-i;k++)
    	  {
    		  System.out.print(k*3+" ");
    	  }
    	  System.out.println();
      }
      
      for(int i=num-1;i>=1;i--){
    	  for(int j=1;j<i;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=1;k<=num-i;k++)
    	  {
    		  System.out.print(k*3+" ");
    	  }
    	  System.out.println();
      }
  /*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
      
   */
      
      
     System.out.println("------------------------");
     for(int i=num;i>1;i--)
     {
    	 for(int j=1;j<i;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=i;k<num;k++)
    	 {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
     }
     for(int i=1;i<num;i++)
     {
    	 for(int j=1;j<i;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<num-i;k++)
    	 {
    		 System.out.print(k*3+" ");
    	 }
    	 System.out.println();
     }
     
   
}
}
