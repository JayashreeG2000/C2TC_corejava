package array;
import java.util.*;

public class array {
	public static void main(String [] args) {
		int arr[]= {10,20,30,40,50,60};
		int key=70;
		int pos=0;
		for(int i:arr)
		{
			pos++;
			if(i==key)
				break;
		}
		if(pos<5)
		{
			System.out.println("found at:"+pos);
		}
		else
		{
			System.out.println("not foud");
		}
	}

}
