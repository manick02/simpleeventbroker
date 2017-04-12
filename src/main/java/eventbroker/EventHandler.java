package eventbroker;

/**
 * Created by 8420 on 11/04/17.
 */
public interface EventHandler<T extends EventPayload> {
     void handleEvent(T eventPayload) ;
}
