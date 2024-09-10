import java.util.HashSet;

public class RetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> l = new HashSet <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Hash set 1 contains: "+ l);
		
		
		HashSet<String> l2 = new HashSet<String>();
		

		l2.add("Red");
		l2.add("Orange");
		l2.add("Black");
		l2.add("White");
		l2.add("Pink");
		
		System.out.println("Hash set 1 contains: "+ l2);
		
		l.retainAll(l2);
		
		System.out.println(l);
		
		
		

	}

}
