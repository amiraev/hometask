import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    String a = this.getClassString();
    @Test
    public void testGetClassString()
    {
       if (a.contains("hello")){
           System.out.println("Pass");
       }else if(a.contains("Hello")){
           System.out.println("Pass");
       }else{
           System.out.println("Fail");
       }
    }

}
