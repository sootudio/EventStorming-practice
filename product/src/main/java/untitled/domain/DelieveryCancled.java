package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DelieveryCancled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
}
