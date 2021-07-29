import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

  MathService math = new MathService();

  @Test(dataProvider = "dpaddition")
  public void add1Test(int exp_value, int a, int b)
	{
         Assert.assertEquals(math.add1(5,5), 10);
	   System.out.println("Addition");
	}
  public void mul1Test(int exp_value, int a, int b)
  {
	  Assert.assertEquals(math.mul1(5,5),25);
	  System.out.println("Multiplication");
  }


@DataProvider(name="dpaddition")
public Object[][] getdata()
{
	return new Object[][] {{10,5,5},{20,10,5},{50,25,25},{50,25,25}};
}
public Object[][] getdata1()
{
	return new Object[][] {{25,5,5}, {20,5,4}};
	}
}
