import vo.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Corner<T> {

    final Map<String, T> productInfo = new HashMap<>();

    public T getProductInfo(String productName) {
        return this.productInfo.get(productName);
    }

    public List<String> sellProductList() {
        return new ArrayList<>(productInfo.keySet());
    }

    public void registerProductInfos(List<T> products) {
        products.forEach(product -> {
            String productName = ((Product) product).getName();
            this.productInfo.put(productName, product);
        });
    }


}
