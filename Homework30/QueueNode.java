package T3_0;

import java.io.Serializable;

public class QueueNode implements Serializable {
    protected QueueNode next;
    protected QueueNode prev;
    protected Order value;
}
