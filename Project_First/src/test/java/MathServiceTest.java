import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	public class MathServiceTest {
		MathService math = new MathService();
  @BeforeSuite
  public void beforesuite()
  {
	 System.out.println("Before Suite");
  }
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("Before Test");
  }
  @BeforeClass
  public void beforeclass()
  {
	 System.out.println("Before the class");
  }
  @Test
  public void add1Test() 
  {
	Assert.assertEquals(math.add1(5,5),10);
    System.out.println("Addition");
  }
  
  @Test
  public void mul1Test() 
  {
    Assert.assertEquals(math.mul1(5,5),25);
    System.out.println("Multiplication");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	 System.out.println("Before Printing");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("After Printing");
  }
  @AfterClass
  public void afterclass()
  {
	  System.out.println("After The Class");
  }
  @AfterTest
  public void aftertest()
  {
	  System.out.println("After Test");
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("After Suite");
  }
}
 