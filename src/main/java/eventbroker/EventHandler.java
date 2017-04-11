package eventbroker;

/**
 * Created by 8420 on 11/04/17.
 */
public interface EventHandler {
    public void handleEvent(EventPayload eventPayload);
}
