package vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
//@Builder
@SuperBuilder
public class Toy extends Product{


    boolean isTransForm;
    String factoryOrigin;

//    @Builder
//    public Toy(String name, String origin, int price,int count ,boolean isTransForm, String factoryOrigin) {
//        super(name, origin, price,count);
//        this.isTransForm = isTransForm;
//        this.factoryOrigin = factoryOrigin;
//    }


}
