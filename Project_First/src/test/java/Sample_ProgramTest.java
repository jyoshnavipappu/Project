import org.testng.Assert;
import org.testng.annotations.Test;
public class Sample_ProgramTest {

Sample_Program test = new Sample_Program();

	  @Test
	  public void Case1() {
		  Assert.assertEquals(test.add1(5, 5), 10);
		  System.out.println("Case1 Runs Sucessfully");

	  }

	  @Test
	  public void Case2() {
		 Assert.assertNotEquals(test.sub1(10, 5), 7);
		  System.out.println("Case2 Runs Sucessfully");
	}

	 
	  @Test
	  public void Case3() {
		  Assert.assertNull(test.testNull(), "Null String");
		  System.out.println("Case3 Runs Sucessfully");
	    
	  }
	  @Test
	  public void Case4() {
		  Assert.assertSame(test.add1(5, 5), test.sub1(15, 5), "Assert Same");
		  System.out.println("Case4 Runs Sucessfully");
	    
	  }@Test
	  public void Case5() {
		  Assert.assertNotSame(test.mul1(5, 5), test.div1(125, 3));
		  System.out.println("Case5 Runs Sucessfully");
	    
	  }
	  @Test
	  public void Case6() {
		  Assert.assertFalse(test.testFalse(), "Assert False");
		  
		  System.out.println("Case6 Runs Sucessfully");
	    
	  }
	  @Test
	  public void Case7() {
		  Assert.assertTrue(test.testTrue(),"Assert True");
		  System.out.println("Case7 Runs Sucessfully");
	    
	  }
	}