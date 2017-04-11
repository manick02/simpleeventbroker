package eventbroker;


public class EventBroker {

    private static EventBroker instance;

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

}
