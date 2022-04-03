package oddeven;
import java.util.*;
import java.io.*;

public class oddeven {
	static int isEven(int n) {
		return n&1;
	}
	
	public static void main(String [] args) {
		int n=21;
		if(isEven(n)==0) {
			System.out.println("even");
	    }
		else
		{
			System.out.println("odd");
		}
	}
}