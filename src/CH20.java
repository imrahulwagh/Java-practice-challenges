//20.Create a program that categorize a person into different age groups
//Child -> below 13 Teen -> below 20
//Adult -> below 60
import java.util.Scanner;
public class CH20 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age>60)
		{
			System.out.println("You are Senior Citizen");
		}
		else if(age>=20)
		{
			System.out.println("You are Adult");
		}
		else if(age>=13)
		{
			System.out.println("You are Teenager");
		}
		else {
			System.out.println("You are Child");
		}
		
		sc.close();
	}
}

