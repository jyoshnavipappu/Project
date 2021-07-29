import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
DependsOnMethod method = new DependsOnMethod();

  
@Test(dependsOnMethods="sub1Test")
  public void add1Test() 
  {
	  Assert.assertEquals(method.add1(5,5),10);
	  System.out.println("Addition");
  }

  @Test(dependsOnMethods="add1Test")
  public void mul1Test() 
  {
	  Assert.assertEquals(method.mul1(5,5),25);
	  System.out.println("Multiplication");
  }

  @Test
  public void sub1Test() 
  {
	  Assert.assertEquals(method.sub1(5,4),1);
	  System.out.println("Sub");
  }
}
