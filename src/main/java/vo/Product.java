package vo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@ToString
@SuperBuilder
public class Product {

    String name;
    String origin;
    int price;
    int count;
}
