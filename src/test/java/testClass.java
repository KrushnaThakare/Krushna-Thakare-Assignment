import org.testng.annotations.Test;

import junit.framework.Assert;

public class testClass extends baseTest{

	public testLogic test;

	@Test
	public void testCase1()
	{
		test= new testLogic();
		test.validatePlayers();
		Assert.assertEquals(4, test.count);
		
	}
	
	@Test
	public void testCase2()
	{
		test=new testLogic();
		Assert.assertEquals(true, test.validateWicketKeeper());
	}
	
}
