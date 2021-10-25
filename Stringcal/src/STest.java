import static org.testing.annotation.Test;
import org.testing.Assert.assertEquels;
@Test
public class STest{
    public void emptyS(){
        App cal = new App();
        assertEquels(cal.Add(""),0);
    }
    public void single(){
        App cal = new App();
        assertEquels(cal.Add("1"),1);
    }
    public void two(){
        App cal = new App();
        assertEquels(cal.Add("1,2"),3);
    }
}
