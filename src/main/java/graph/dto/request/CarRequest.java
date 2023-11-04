package graph.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * author: Ulansky
 */
@Setter
@Getter
@Builder
public class CarRequest {
    private String name;
    private String email;
    private String model;
    private String color;
    private Integer price;
}
