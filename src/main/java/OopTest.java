import vo.Fish;
import vo.Toy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OopTest {

    public static void main(String[] args) {
        Map<String, Corner> cornerMap = new HashMap<>();
        Fish fishProduct = Fish.builder().name("고등어").origin("한국").price(1000).catchArea("캐나다").build();
        Toy toyProduct = Toy.builder().name("또봇").origin("한국").factoryOrigin("한국").price(2000).isTransForm(false).build();
        Corner<Fish> fishCorner = new FishCorner();
        Corner<Toy> toyCorner = new ToyCorner();

        carryingProduct(fishCorner, List.of(fishProduct));
        carryingProduct(toyCorner, List.of(toyProduct));

        cornerMap.put("생선코너", fishCorner);
        cornerMap.put("장난감코너", toyCorner);
        Mart mart = Mart.builder()
            .corner(cornerMap)
            .build();

        System.out.println(mart.getCorner().keySet());
        System.out.println(mart.getCorner().get("생선코너").sellProductList());
        System.out.println(mart.getCorner().get("생선코너").getProductInfo("고등어"));
        mart.getCorner().forEach((key, value) -> {
            System.out.println("---------");
            System.out.println("코너 : " + key);
            System.out.println("판매상품 : " + value.sellProductList());
//            System.out.println(  value.getProductInfo("또봇") instanceof Toy);
            System.out.println("---------");
        });
    }

    public static <T> void carryingProduct(Corner<T> corner, List<T> product) {
        corner.registerProductInfos(product);
    }

}
