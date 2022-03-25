package lab9;
@FunctionalInterface
interface MyInterface2
{
    String myMethod(String res);
}
public class Ex2
{
	public static void main(String[] args) 
	{
		MyInterface2 mi = (str) -> 
		{
			StringBuffer sb = new StringBuffer();
			for(int i = 0 ; i < str.length(); i++)
			{
				sb.append(str.charAt(i));
				sb.append(' ');
			}
			String res = sb.toString();
			return res;
		};
		System.out.println(mi.myMethod("Hello"));
	}

}