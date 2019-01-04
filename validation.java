package pktest;

//false la ko phai so,true la so
public class validation {
	public static int i;
	public static boolean IsNumber(String s) {
		for (i=0;i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
			return false;	
			break;
		}
		
			if (i + 1 == s.length())
				return true;		
		
	}

	public static void main(String[] args) {
		i=0;
		boolean result = IsNumber("1a");
		System.out.println(result);
	}
}
