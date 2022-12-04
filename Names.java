package assignment;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		 int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length ();
		}
		int average = sum / names.length;
		System.out.println("Average:" + average );
		
		 
		 
		 String all = "";
		 for (int i = 0; i < names.length; i++) {
			all += names[i] + " ";
		}
	System.out.println(all);
	
	//How to access last element of array. Use arrayName.length -1
	//How to access first element of array. Use array[0]
	
	int [] namelengths = new int[names.length];
	for (int i = 0; i < names.length; i++) {
		namelengths[i] = names[i].length();
		
	}
	sum = 0;
	for (int i = 0; i < namelengths.length; i++) {
		sum += namelengths[i];
	}	
	System.out.println("Sum of length " + sum); }
	
			
	{
	}

}
