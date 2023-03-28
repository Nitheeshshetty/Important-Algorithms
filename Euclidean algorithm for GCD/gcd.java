// Java program to demonstrate Basic Euclidean Algorithm

import java.lang.*;
import java.util.*;

class GFG {
	// extended Euclidean Algorithm
	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}

	// Driver code
	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
		int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println(gcd(a,b));
    
}
// Code Contributed by Mohit Gupta_OMG <(0_o)>
