import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleGroups {
  @Test(groups="odd")
  public void first() 
  {
	  System.out.println("First Method");
	  
  }
  @Test(groups = "even")
  public void second()
  {
	  System.out.println("Second Method");
  }
  @Test(groups = "odd")
  public void third()
  {
	  System.out.println("Third Method");
  }
  @Test(groups = "even")
  public void fourth()
  {
	  System.out.println("Fourth Method");
	  Reporter.log("All even methods are executed");
  }
  
}
