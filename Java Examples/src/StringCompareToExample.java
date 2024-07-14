
public class StringCompareToExample {

	public static void main(String[] args) {

		String str1="ABCDEFG";
		String str2="FGH";
		
		int val=str1.compareTo(str2);		//65-7-= -5 will return -5
		
		System.out.println(val);
		
		
			str1="ABC";
			str2="ABC";
		
			val=str1.compareTo(str2);	
			
			System.out.println(val);
		
			
		String s1="Adesh";	
		String s2="Adhav";
		
		val=s2.compareTo(s1);		// 104-101= 03
		
		System.out.println(val);
		
		
		
	}

}
