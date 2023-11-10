package vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@ToString(callSuper = true)
//@Builder
@SuperBuilder
public class Fish extends Product{

    String catchArea;

//    @Builder
//    public Fish(String name, String origin, int count ,int price, String catchArea) {
//        super(name, origin, price, count);
//        this.catchArea = catchArea;
//    }
}
