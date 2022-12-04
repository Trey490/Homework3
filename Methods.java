package assignment;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.class;
		
	}
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName; }
	
		 
	
	public static String multiword(String word, int n) {
		String multiword = "";
		for (int i = 0; i < n; i++) {
			multiword += word; }
			
		}
		public static boolean Over100(int[] array) {
			int sum = 0;
			for(int number : array) {
				sum += number;
			return sum > 100;
			}
			
		}
		public static double Average(double[] array) {
			double sum = 0;
			for (double number : array) {
			return  (sum / array.length); }
			
	
		
		
		
			}
		public static boolean GreaterAverage(double[] array1, double[] array2) {
			double sum1 = 0;
			double sum2 = 0;
			for(double number : array1) {
				sum1 += number;
			}
			for(double number : array2) {
				sum2 += number;
			}
			return sum1 / array1.length > sum2 / array2.length;
			
		}
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside = true && moneyInPocket > 10.50) {
				return true;
			}else {
				return false; }
			}
			public static boolean goJogging(boolean streetsClear, double niceTemp) {
				if(streetsClear = true && niceTemp >65) {
					return true;
				}else { 
					return false;
					
				}
			}
	}


