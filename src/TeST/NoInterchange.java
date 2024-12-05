package TeST;
import java.util.Scanner;

public class NoInterchange {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter value A:");
		int a =input.nextInt();
  System.out.print("Please enter Value B:");
  int b = input.nextInt();
  
  int c= a;
  a=b;
  b=c;
  System.out.println("A:" + a);
  System.out.println("B:"+ b);
	}

}
