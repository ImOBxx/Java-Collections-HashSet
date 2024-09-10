import java.util.HashSet;

public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> l = new HashSet <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Original hash set contains: "+ l);
		
		l.clear();
		
		System.out.println("New hash set contains: "+ l);
		
		

	}

}
