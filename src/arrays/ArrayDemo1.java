package arrays;

import java.util.*;

public class ArrayDemo1 {

	public static void main(String[] args) {

		
		int [][]arr=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Type 10 array elements ");
		
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
			arr[i][j]=sc.nextInt();
			}
		}
		

		
		for(int i=0;i<3;i++)
		{
			
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
		
		}
		
}

}