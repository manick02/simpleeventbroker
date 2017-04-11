package eventbroker;
public class MockEventHandler implements EventHandler {

    @Override
    public void handleEvent(EventPayload eventPayload) {
        HandlesEvent(eventPayload);
    }


    public void HandlesEvent(EventPayload eventPayload)
    {
        System.out.println("event handled");
    }
}
