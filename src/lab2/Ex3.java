package lab2;
import java.util.Arrays;

public class Ex3 
{
	static int[] getSorted(int[] a)
	{
		int[] b = new int[a.length];
	    int j = a.length;
		for (int i = 0; i < a.length; i++) 
		{
            b[j-1] = a[i];
            j = j-1;
        }
		Arrays.sort(b);
		return b;
	}

	public static void main(String[] args) 
	{
		int[] a = {1,3,5,2,4};
		System.out.println("Resulting Array:"+Arrays.toString(getSorted(a)));
	}

}
