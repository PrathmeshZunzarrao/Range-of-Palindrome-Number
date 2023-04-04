import java.util.Scanner;
class PalindromesRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int start = sc.nextInt();
		System.out.print("Enter ending number : ");
		int end = sc.nextInt();


		for(int i=start ; i<end; i++)
		{
			if(checkpalindrome(i))
			{
				System.out.print(i + " ");
			}
		}
	}


	public static boolean checkpalindrome(int num)
	{
		int rev = 0;
		int org = num;


		while(num > 0)
		{
			int rem = num % 10;
				rev = rem + rev*10;
				num = num/10;
		}

		if(rev == org)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
