package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		System.out.println(set.subSet("d", "s")); 	//subSet : d 부터, s 앞까지
		System.out.println(set.headSet("e")); 		//headSet : e 앞까지
		System.out.println(set.tailSet("e")); 		//tailSet : e 부터
		
		

	}
}
