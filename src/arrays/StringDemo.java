package arrays;

public class StringDemo {

	public static void main(String[] args) {


		String s1="apple";
		String s2="   APPLE     ";
		
		System.out.println("String=1  :"+s1);
		System.out.println("String=2  :"+s2);
		
		System.out.println("String=1 Length  :"+s1.length());
		System.out.println("String=2 Length  :"+s2.length());
		
		s2=s2.trim(); //leading the spaces in both sides
		
		System.out.println("After trim String=2 Length  :"+s2.length());
		
		System.out.println("s1  == s2  :"+s1.equals(s2));//both are equals or not with case sensitive
		
		System.out.println("s1  == s2 using IgnoreCase :"+s1.equalsIgnoreCase(s2)); //without case sensitive both are equls or not
		
		System.out.println("s1  concat with s2  :"+s1.concat(s2));
		
		System.out.println("Convert into Upper Case  :"+s1.toUpperCase());
		
		System.out.println("Convert into Lower Case  :"+s1.toLowerCase());

		System.out.println("index of 'l' pos :"+s1.indexOf('l'));
		System.out.println("Character at 3rd :"+s1.charAt(3));
		
		String s3="Welcome to Learn  java technologies";
		System.out.println("using substring from beginnig 5th pos :"+s3.substring(5));
		System.out.println("using substring from beginnig 5th pos to 10th pos :"+s3.substring(5,10));
		
		System.out.println("Replace 'e' with 'E' :"+s3.replace('e', 'E'));
		
		
		
		
		
	}

}
