package eventbroker;

public interface EventHandler<T extends EventPayload> {
     void handleEvent(T eventPayload) ;
}
