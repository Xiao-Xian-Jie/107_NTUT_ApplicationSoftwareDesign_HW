package test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args)throws IOException
	{
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1�Mnum2���U�عB��");
		System.out.println("num1+num2����" + (num1 + num2));
		System.out.println("num1-num2����" + (num1 - num2));
		System.out.println("num1*num2����" + (num1 * num2));
		System.out.println("num1/num2����" + (num1 / num2));
		System.out.println("num1%num2����" + (num1 % num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;

		System.out.println("�]���O�b���w�Ȥ���~���W,�ҥHb���Ȭ�" + b);
		System.out.println("�]���O�b���W����~���w��,�ҥHc���Ȭ�" + c);
	}
}
