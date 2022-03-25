package lab2;
import java.util.Arrays;

public class Ex4 
{
	static int[] modifyArray(int[] a)
	{
		int n = a.length;
		int[] b = new int[n];
		int[] c = new int[n];
		b = a;
		int temp;
		Arrays.sort(b);
		int k = 0;
		
		for (int i = 0; i < n-1; i++)  // Removing Duplicate 
        {
			if (b[i] != b[i+1])
			{
				c[k++] = b[i];
			}  
        } 
		c[k++] = b[n-1];
		int[] d = new int[k];
		for (int i = 0; i < k; i++)
		{
			d[i] = c[i];
		}
		
		for (int i = 0; i < k; i++)   // Sorting in Descending Order
        {  
            for (int j = i + 1; j < k; j++)   
            {  
                if (d[i] < d[j])
                {  
                    temp = d[i];  
                    d[i] = d[j];  
                    d[j] = temp;  
                }  
            }  
        } 
		return d;
	}

	public static void main(String[] args) 
	{
		int[] a = {1,1,3,2,2,4,5,3,5};
		System.out.println("Resulting Array:"+Arrays.toString(modifyArray(a)));
	}

}
