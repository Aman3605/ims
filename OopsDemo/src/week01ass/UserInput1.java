package week01ass;

import java.util.Scanner;

public class UserInput1 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
sc.close();
	int sum,mul,sub;
	float div;
	{
		sum=a+b;
		System.out.println(sum);
		sub=a-b;
		System.out.println(sub);
		mul=a*b;
		System.out.println(mul);
		div=(float)a/b;
		System.out.println(div);
	}
	}


}
