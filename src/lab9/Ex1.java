package lab9;
@FunctionalInterface
interface MyInterface1
{
    double add(int a, int b);
}
public class Ex1 
{
	public static void main(String[] args) 
	{
		MyInterface1 mi = (a,b) -> (Math.pow(a, b));
		System.out.println("a = 3\nb = 3\na^b = "+mi.add(3, 3));
	}

}
