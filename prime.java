import java.util.*;

class prime{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int cnt=0;
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		
		if(cnt==1)
		{
		System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		
	}

}