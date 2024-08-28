//program for linear search
import java.util.Scanner;
public class linear{
	public static void main(String[] args){
		int i;
		int a[]={10,20,43,65,22,12};
		int key=43;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("key is found at :"+i);
				break;
			}
			else if(i==6)
			{
				System.out.println("key is not found ");		
			}
		}

	}
	
}
