package assignment5.ques1;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntSet set = new IntSet(new int[] {11, 1, 13, 21, 3, 7});
		IntSet s = new IntSet(new int[] {11, 7,3,1});
		
		
		System.out.println(set.isMember(4)); 
		System.out.println(set.isSubSet(s));
		System.out.println(set.union(s));
		System.out.println(set.size());
		System.out.println(set.isMember(13));
		System.out.println(s.size()); 
	    System.out.println(s.getComplement());
		
	
		
		
		
	}

}
