package skilltasks;

public class skill1 {
	
		public static void main(String[] args) {
			int a = 10;
	        Integer boxed = a;
	        int unboxed = boxed;
	        double d = 45.67;
	        int casted = (int) d;

	        String str = "123";
	        int parsed = Integer.parseInt(str);
	        
	        System.out.println("Boxed: " + boxed);
	        System.out.println("Unboxed: " + unboxed);
	        System.out.println("Casted double to int: " + casted);
	        System.out.println("Parsed from String: " + parsed);
	    }
	}


