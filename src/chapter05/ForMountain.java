package chapter05;

public class ForMountain {
	public static void main(String[] args)
	{
		int k = 5;
		for(int i = 0; i<6 ;i++)
		{
			for(int j = 0; j<=10;j++)
			{
				if(k-i<=j && k+i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();
		}
		System.out.println();
		
		boolean dice = true;
		int number = 0;
		int rolling_counter=0;
		while(dice)
		{
			number = (int)Math.round(Math.random()*6);
			if(number==0)
			{
				
			}
			else
			{
				rolling_counter++;
				System.out.println(number);
				if(number==6)
				{
					System.out.println("던진 횟수 : "+rolling_counter);
					dice=false;
				}
			}
		}
		
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1 ; i<=100 ; i++)
		{
			if(i%2==0)
			{
				evenSum+=i;
			}
			else
			{
				oddSum+=i;
			}
		}
		System.out.println("evenSum : " + evenSum);
		System.out.println("oddSum : " + oddSum);
		
	}//main method
}
