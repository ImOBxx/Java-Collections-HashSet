import java.util.HashSet;

public class CloneSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet <String> l = new HashSet();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("The Haset Set: " + l);
		
		HashSet <String> l2 = new HashSet();
		l2 = (HashSet)l.clone();
		
		System.out.println("The Haset Set: " + l2);
		
		
		
	}

}
