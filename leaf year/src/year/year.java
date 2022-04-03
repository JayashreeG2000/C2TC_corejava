package year;
import java.util.*;

public class year {
	public static void main(String [] args) {
		int year=2001;
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
