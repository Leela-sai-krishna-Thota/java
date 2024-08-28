//program to check the perfect number or not
import java.util.Scanner;
public class perfect{
	public static void main(String[] args){
		int i,n;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		for(i=0;i<=n/2;i++)
		{
			if(n%i==0)
				sum=i++;
		}
		if(sum==n)
			System.out.println("perfect number");
		else
			System.out.println("Not a perfect number");
		
	}
}
