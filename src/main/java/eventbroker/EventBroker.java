package eventbroker;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class EventBroker {

    private static EventBroker instance;
    private static ConcurrentHashMap<String,List<EventHandler>> topicHandlers = new ConcurrentHashMap<>();
    static
    {
        instance = new EventBroker();
        topicHandlers = new ConcurrentHashMap<>();
    }
    private EventBroker()
    {

    }

    public static EventBroker getInstance()
    {
        return instance;
    }

    public static synchronized void registerEventHandler(String topic, EventHandler eventHandler)
    {
        List<EventHandler> handler = topicHandlers.get(topic);
        if (handler==null)
        {
            handler = new ArrayList<>();
            topicHandlers.put(topic,handler);
        }

        handler.add(eventHandler);
    }

    public static <T> void publishEvent(String sampletopic, EventPayload<T> payload) {
        List<EventHandler> eventHandlers = topicHandlers.get(sampletopic);
        for (EventHandler eventHandler:eventHandlers)
        {
            eventHandler.handleEvent(payload);
        }

    }
}
