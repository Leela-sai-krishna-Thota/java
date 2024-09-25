// programe for binary search in java
import java.util.Scanner;
class binary{
	public static void main(String[] args){
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.println("enter the elements of array");
		for(i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		int count=0,key;
		System.out.println("enter the key element");
		key=sc.nextInt();
		int low=0,high=4,mid=0;
		while(low<=high){
			mid =(low+high)/2;
			if(key==a[mid]){
				count=1;
				break;
				
			}
			else if(key<a[mid]){
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		if(count==1){
			System.out.printf("key is found at index %d",mid);
		}
		else {
			System.out.println("search is unsuccessful");
		}
		
	}
}
