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

    @Test
    public void publishEvent()
    {
        EventBroker eventBroker = EventBroker.getInstance();
        String topic = "sampleTopic";
        MockPayload payload = new MockPayload();
        eventBroker.registerEventHandler("sampleTopic", new EventHandler<MockPayload>() {
            @Override
            public void handleEvent(MockPayload eventPayload) {
                Assert.assertTrue("assertion passed",eventPayload==payload);
            }
        });

        eventBroker.publishEvent("sampleTopic", payload);
    }
}
