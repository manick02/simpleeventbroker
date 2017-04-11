package eventbroker;


import org.junit.Assert;
import org.junit.Test;

public class EventBrokerTest {
    @Test
    public void EventBrokerConstruction()
    {
        EventBroker eventBroker = EventBroker.getInstance();
        Assert.assertTrue(eventBroker!=null);
    }
}
