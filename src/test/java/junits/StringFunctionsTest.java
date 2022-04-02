package junits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {

	@Tag("Sanity")
	@DisplayName("Positive Test")
	@Test
	public void Test1() {
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}
	
	@CustomAnnotation
	public void Test2() {
		assertFalse(StringFunctions.isPalindrome("bhumika"));
	}
}
