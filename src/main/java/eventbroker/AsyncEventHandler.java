package eventbroker;

public abstract class AsyncEventHandler<T extends EventPayload> implements EventHandler<T> {

    public abstract void handleEventAsync(T eventPayload);

}
