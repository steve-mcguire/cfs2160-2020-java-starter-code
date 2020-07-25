import org.junit.Assert;
import org.junit.Test;
public class HelloWorldTest {
    @Test
    public void vehicleType() throws Exception {
        String vehicleType = HelloWorld.vehicleType();
        Assert.assertEquals("H", vehicleType);
    }

    @Test
    public void vehicleSpeed() throws Exception {
        int vehicleSpeed = HelloWorld.vehicleSpeed();
        Assert.assertEquals(56, vehicleSpeed);
    }
}
