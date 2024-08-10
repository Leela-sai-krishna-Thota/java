bsort.java
//programe to find the sorting order
import java.util.Scanner;
public class bsort{
	public static void main(String[] args){
		int i,j,temp,n;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("enter the n value");
		n=sc.nextInt();
		System.out.println("enter the array elemets");
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		for(i=0;i<=n-1;i++){
			for(j=0;j<=n-1-i;j++){
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}for(i=0;i<n;i++)
					System.out.print(a[i]+" ");
			}
		}
		
		
	
	}
}
