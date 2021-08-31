import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int coconutWater = 0;
		int coconutPulp = 0;
		int totalCoconuts;
		Scanner scan1 = new Scanner(System.in);
		int testCases = scan1.nextInt();
		int[] values = new int[testCases*4];
		for(int i=0; i<testCases*4; i++) {
			values[i] = scan1.nextInt();
		}
		for(int j=0; j<testCases*4; j+=4) {
			coconutWater = values[j+2]/values[j];
			coconutPulp = values[j+3]/values[j+1];
			totalCoconuts = coconutWater + coconutPulp;
			System.out.println(totalCoconuts);
			totalCoconuts = 0;
		}
	}
}
