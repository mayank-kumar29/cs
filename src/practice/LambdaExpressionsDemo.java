package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@FunctionalInterface
interface MyInterface1
{
    List<Integer> myMethod (ArrayList<Integer> list);
}

@FunctionalInterface
interface MyInterface2
{
	List<Integer> myMethod (ArrayList<Integer> list);
}

@FunctionalInterface
interface MyInterface3
{
	int myMethod (ArrayList<Integer> list);
}

@FunctionalInterface
interface MyInterface4
{
	List<Integer> myMethod (ArrayList<Integer> list);
}

@FunctionalInterface
interface MyInterface5
{
	List<Integer> myMethod (ArrayList<Integer> list);
}

public class LambdaExpressionsDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(70);
		al.add(40);
		al.add(80);
		al.add(35);
		al.add(35);
		al.add(80);
		MyInterface1 mi1 = (list) ->
		{
			ArrayList<Integer> res = new ArrayList<>();
			for(int i : list)
			{
				if(i>50)
				{
					res.add(i);
				}
			}
			return res;
		};
		MyInterface2 mi2 = (list) ->
		{
			ArrayList<Integer> res = new ArrayList<>();
			for(int i : list)
			{
				if(i%2 == 0)
				{
					res.add(i);
				}
			}
			return res;
		};
		MyInterface3 mi3 = (list) ->
		{
			int res = 0;
			for(int i : list)
			{
				if(i%2 != 0)
				{
					res++;
				}
			}
			return res;
		};
		MyInterface4 mi4 = (list) ->
		{
			Collections.sort(list);
			return list;
		};
		MyInterface5 mi5 = (list) ->
		{
			ArrayList<Integer> res = new ArrayList<>();
			Collections.sort(list);
			res.add(list.get(0));
			res.add(list.get(list.size()-1));
			return res;
		};
		
		System.out.println(mi1.myMethod(al));
		System.out.println(mi2.myMethod(al));
		System.out.println(mi3.myMethod(al));
		System.out.println(mi4.myMethod(al));
		System.out.println(mi5.myMethod(al));
	}

}
