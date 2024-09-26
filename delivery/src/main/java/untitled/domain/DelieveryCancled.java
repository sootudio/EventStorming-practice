package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DelieveryCancled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;

    public DelieveryCancled(Delivery aggregate) {
        super(aggregate);
    }

    public DelieveryCancled() {
        super();
    }
}
//>>> DDD / Domain Event
