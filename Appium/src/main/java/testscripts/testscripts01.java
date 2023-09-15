package testscripts;

public class testscripts01 extends BaseClass {

	    @Test
	    public void setup() throws InterruptedException {
	        CalculatorScreen cs = new CalculatorScreen(driver);
	        // Click Digit 1
	        cs.clickButton_1();
	        // Click on Add (+)
	        cs.clickPlusButton();
	        // Click Digit 2
	        cs.clickButton_2();
	        Thread.sleep(5000);             
	    }
	
}
