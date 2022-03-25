package lab2;

public class Ex1 
{
	static int getSecondSmallest(int []a)
	{
		int n = a.length;
		int temp;
		for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        } 
		return a[1];
	}
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The second smallest number:"+getSecondSmallest(a));
	}
	
}
