import java.util.HashSet;
import java.util.Iterator;



public class IterateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> l = new HashSet <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		Iterator p = l.iterator();
		while (p.hasNext())
		{
			System.out.println(p.next());
		}
		

	}

}
