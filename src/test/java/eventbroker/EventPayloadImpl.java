package eventbroker;

/**
 * Created by 8420 on 11/04/17.
 */
public class EventPayloadImpl implements EventPayload<MockPayload> {
    @Override
    public MockPayload getPayLoad() {
        return new MockPayload();
    }
}
