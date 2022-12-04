package assignment;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int x = ages[7];
		int y = ages[0];
		int sum= x-y;
		
		System.out.println(sum);
		
		int total=0;
		
		for(int count=0;count<ages.length;count++){
		
		total+=ages[count];
		
		
	}
		System.out.println(total/ages.length);}

}
