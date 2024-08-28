//program for 2 dimentional array
import java.util.Scanner;
public class arrayt{
	public static void main(String[] args)
	{
		int i,j;
		int a[][] =new int[2][2];
		Scanner sc =new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("enter the element of row="+(i+1)+"and column="+(j+1));
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
