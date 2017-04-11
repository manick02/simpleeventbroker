package eventbroker;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class EventBroker {

    private static EventBroker instance;
    private static ConcurrentHashMap<String,List<EventHandler>> topicHandlers = new ConcurrentHashMap<>();
    private EventBroker()
    {

    }

    public synchronized static EventBroker getInstance()
    {
        if (instance==null) {
            instance = new EventBroker();
        }

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

}
