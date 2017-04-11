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

    @Test
    public void EventBrokerRegistration()
    {
        EventBroker eventBroker = EventBroker.getInstance();
        String topic = "sampleTopic";
        MockEventHandler eventHandler = new MockEventHandler();
        eventBroker.registerEventHandler(topic,eventHandler);
        Assert.assertTrue(eventBroker!=null);
    }
}
