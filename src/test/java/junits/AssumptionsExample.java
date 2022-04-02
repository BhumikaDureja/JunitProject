package junits;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


import org.junit.jupiter.api.Test;

public class AssumptionsExample {
	
	public static void SetUp() {
		System.setProperty("ENV", "PROD");
		
	}
	
	@Test
	public void Test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV"))); // need to give import for assume True
		// assumeTrue will skip the test instead of failing it if the assumption is not true
		// HEre assumption is  that Env should be Dev but in Setup we are setting the Env as Prod and hence this test will be skipped 
		// if we want to pass this test or this assumption will only pass when the ENv in setup is set as DEv instead of Prod 
		// or if we are giving Prod instead of DEV in assume True statement
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}

}
