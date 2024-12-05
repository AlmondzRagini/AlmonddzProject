package TeST;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the perimeter");
		Scanner input = new Scanner(System.in);
		System.out.print("please enter all $ parameters");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c= input.nextDouble();
		double d = input.nextDouble();
		double perimeter = a+b+c+d;
		 
		System.out.println("Result; "+ perimeter);
	}

}
