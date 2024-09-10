import java.util.HashSet;

public class EmptySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> l = new HashSet();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("The Hash Set: " + l);
		
		l.removeAll(l);
		
		System.out.println("The New Hash Set: " + l);
		

	}

}
