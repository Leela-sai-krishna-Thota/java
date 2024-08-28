//java program to check whether the given string is palindrome or not
public class palindrome {
	public static void main(String[] args)
	{
		String x="1221";
		int i=0,j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i) != x.charAt(j))
			{
				System.out.println("Not a palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Is a palindrome");
	}
}
