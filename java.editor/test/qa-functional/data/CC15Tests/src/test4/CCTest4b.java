package test4;

import static test4.CCTest4a.TEST_FIELD;
import static test4.CCTest4a.testMethod;

public class CCTest4b {
    
    public static void main(String[] args) {
        int x = TEST_FIELD; //Check wheher the CC provides TEST_FIELD after the =
	
	testMethod().get(0).indexOf("Hello"); //Check whether the CC provides "testMethod". Check the methods provided after the dot.
    }
}
