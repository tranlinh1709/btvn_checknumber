package pktest;

import org.junit.Assert;
import org.junit.Test;

//false la ko co so,true la so
public class test_validation {
	public static int i;
	public static String s;
    public static boolean IsNumber() {
		for (i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				return false;
			break;
		}
		if (i + 1 == s.length())
			return true;
	}

	@Test
	public static void CheckNumber() {
		i=0;
		s="12";
		boolean result1 = IsNumber();
		Assert.assertEquals(result1, true);
	}

	@Test
	public static void CheckNoNumber() {
		i=0;
		s="1a";
		boolean result2 = IsNumber();
		Assert.assertEquals(result2, false);
	}
}
